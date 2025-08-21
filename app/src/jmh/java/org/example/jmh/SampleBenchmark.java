package org.example.jmh;

import org.example.DiffusionModeler;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;

import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@State(Scope.Benchmark)
@Fork(value = 1, warmups = 2)
@Warmup(iterations = 2)
public class SampleBenchmark {
  @Benchmark
  @Timeout(time = 5, timeUnit = TimeUnit.SECONDS)
  public void sayHelloBenchmark(Blackhole bh) {
      DiffusionModeler modeler = new DiffusionModeler();
      int[] output = modeler.modelDiffusion(10,10);
      bh.consume(output);
  }
}
