package com.redgogh.experiment;

import org.junit.Test;

/**
 * @author RedGogh
 */
public class AvailableProcessorsNumberTest {

    @Test
    public void test() {
        System.out.println(Runtime.getRuntime().availableProcessors());
    }

}