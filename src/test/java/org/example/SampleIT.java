package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SampleIT {

    @Test
    void test1() {
        final String color = System.getProperty("color");
        System.out.println("=== test 1: color: " + color);

        if ("red".equals(color)) {
            System.out.println("failsafe should stop after this failure");
            Assertions.fail();
        }
    }


    @Test
    void test2() {
        System.out.println("=== test 2");
    }
}
