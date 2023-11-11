package org.example.JavaConcepts.MemoryLeaking;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class StaticFeildsMemoryLeakTest {
    private static final Logger logger = Logger.getLogger(StaticFeildsMemoryLeakTest.class.getName());

    public static List<Double> list = new ArrayList<>();

            public void populateList() {
                for (int i = 0; i < 10000000; i++) {
                    list.add(Math.random());
                }
                logger.info("Debug Point 2");
            }

            public static void main(String[] args) {
                logger.info("Debug Point 1");
                new StaticFeildsMemoryLeakTest().populateList();
                logger.info("Debug Point 3");
            }
}
