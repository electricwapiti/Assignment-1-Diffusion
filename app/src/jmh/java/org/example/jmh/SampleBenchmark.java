package org.example.jmh;

import org.example.DiffusionModeler;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;

import java.util.concurrent.TimeUnit;


/// Start off by using the most efficient options possible (least iterations, least trials)
/// Find max for lines 19 & 22 each
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
@State(Scope.Thread)
@Warmup(iterations = 1, time = 100, timeUnit = TimeUnit.MILLISECONDS)
@Measurement(iterations = 1)
public class SampleBenchmark {

    @Param({"10"})
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
        // try doing this with only steps
        //Limit: 10 seconds per operation
        // look for "score" when you run the benchmark with ./gradlew jmh
        bh.consume(output);
    }
}