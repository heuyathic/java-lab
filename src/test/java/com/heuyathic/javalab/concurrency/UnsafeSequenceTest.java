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
public class UnsafeSequenceTest {

    private UnsafeSequence unsafeSequence = new UnsafeSequence();

    @RepeatedTest(100)
    void getNextTask1() {
        unsafeSequence.getNext();
    }

    @RepeatedTest(100)
    void getNextTask2() {
        unsafeSequence.getNext();
    }

    @AfterAll
    void verifyValue() {
        assertThat(unsafeSequence.getNext()).isLessThan(200);
    }
}
