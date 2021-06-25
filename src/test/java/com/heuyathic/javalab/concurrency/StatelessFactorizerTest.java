package com.heuyathic.javalab.concurrency;

import static org.mockito.Mockito.mock;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import org.junit.jupiter.api.Test;

public class StatelessFactorizerTest {

    private StatelessFactorizer statelessFactorizer = new StatelessFactorizer();
    private ServletRequest req = mock(ServletRequest.class);
    private ServletResponse resp = mock(ServletResponse.class);

    @Test
    void callService() {
        statelessFactorizer.service(req, resp);
    }
}