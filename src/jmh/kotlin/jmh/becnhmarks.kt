package jmh

import org.openjdk.jmh.annotations.*

@State(Scope.Benchmark)
@Fork(1)
open class KotlinBenchmark {

    @Benchmark
    fun `your awesome benchmark 1`(): Int {
        return 2 + 2
    }

    @Benchmark
    fun `your awesome benchmark 2`(): Int {
        return 2 * 2
    }
}