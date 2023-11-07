package edu.hw2;

import edu.hw2.Task4.CallingInfo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task4Test {
    @Test
    void testCallingInfo() {
        CallingInfo callingInfo = new CallingInfo(new Throwable());

        Assertions.assertEquals("edu.hw2.Task4Test", callingInfo.className());
        Assertions.assertEquals("testCallingInfo", callingInfo.methodName());
    }
}
