package com.hectorpetersen.helloworld2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FailingTest {

    @Test
    void thisTestShouldFail() {
        assertEquals(1, 2);
    }
}
