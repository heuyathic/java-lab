package com.heuyathic.javalab.concurrency;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

@TestInstance(Lifecycle.PER_CLASS)
@Execution(ExecutionMode.CONCURRENT)
public class UnsafeCountingFactorizerTest {

    private UnsafeCountingFactorizer unsafeCountingFactorizer = new UnsafeCountingFactorizer();
    private ServletRequest req = mock(ServletRequest.class);
    private ServletResponse resp = mock(ServletResponse.class);

    @RepeatedTest(100)
    void callServiceTask1() {
        unsafeCountingFactorizer.service(req, resp);
    }

    @RepeatedTest(100)
    void callServiceTask2() {
        unsafeCountingFactorizer.service(req, resp);
    }

    @RepeatedTest(100)
    void callServiceTask3() {
        unsafeCountingFactorizer.service(req, resp);
    }

    @RepeatedTest(100)
    void callServiceTask4() {
        unsafeCountingFactorizer.service(req, resp);
    }

    @AfterAll
    void checkCount() {
        assertThat(unsafeCountingFactorizer.getCount()).isLessThan(400);
    }
}