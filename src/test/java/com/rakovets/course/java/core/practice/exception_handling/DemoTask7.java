package com.rakovets.course.java.core.practice.exception_handling;

import java.util.logging.Logger;

public class DemoTask7 {
    public static final Logger logger = Logger.getLogger(DemoTask7.class.getName());

    public static void main(String[] args) {
        try {
            Task7.shareOrange(5, 13);
        } catch (ReminderOfOrange e) {
            logger.info(e.getMessage());
        } finally {
            logger.info("Кто хочет апельсин?");
        }
    }
}
