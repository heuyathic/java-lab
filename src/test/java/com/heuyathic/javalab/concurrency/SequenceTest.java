package com.heuyathic.javalab.concurrency;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

@TestInstance(Lifecycle.PER_CLASS)
@Execution(ExecutionMode.CONCURRENT)
public class SequenceTest {
    private Sequence sequence = new Sequence();

    @RepeatedTest(100)
    void getNextTask1() {
        sequence.getNext();
    }

    @RepeatedTest(100)
    void getNextTask2() {
        sequence.getNext();
    }

    @AfterAll
    void verifyValue() {
        assertThat(sequence.getNext()).isEqualTo(200);
    }
}
