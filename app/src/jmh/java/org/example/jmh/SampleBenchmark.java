package org.example.jmh;

import org.example.DiffusionModeler;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;

import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
@State(Scope.Thread)
@Fork(value = 1, warmups = 2)
@Warmup(iterations = 2)
@Measurement(iterations = 5)
public class SampleBenchmark {

    @Param({"10", "100", "1000", "10000", "100000"})
    int steps;

    @Param({"10"})
    int trials;

    DiffusionModeler modeler;

    @Setup(Level.Iteration)
    public void setup() {
        modeler = new DiffusionModeler();
    }

    @Benchmark
    public void modelDiffusionBenchmark(Blackhole bh) {
        int[] output = modeler.modelDiffusion(steps, trials);
        bh.consume(output);
    }
}