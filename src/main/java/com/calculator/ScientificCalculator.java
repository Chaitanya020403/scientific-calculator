package com.calculator;

import java.util.logging.*;
import java.io.*;

public class ScientificCalculator {

    private static final Logger logger = Logger.getLogger(ScientificCalculator.class.getName());

    static {
        try {
            // Log to file for ELK monitoring
            FileHandler fh = new FileHandler("calculator.log", true);
            fh.setFormatter(new SimpleFormatter());
            logger.addHandler(fh);
            logger.setLevel(Level.ALL);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public double squareRoot(double x) {
        logger.info("squareRoot called with x=" + x);
        if (x < 0) {
            logger.warning("squareRoot: negative input " + x);
            throw new IllegalArgumentException("Cannot compute square root of a negative number.");
        }
        double result = Math.sqrt(x);
        logger.info("squareRoot result=" + result);
        return result;
    }

    public long factorial(int n) {
        logger.info("factorial called with n=" + n);
        if (n < 0) {
            logger.warning("factorial: negative input " + n);
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        if (n > 20) {
            logger.warning("factorial: input too large " + n);
            throw new IllegalArgumentException("Input too large; max supported is 20.");
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        logger.info("factorial result=" + result);
        return result;
    }

    public double naturalLog(double x) {
        logger.info("naturalLog called with x=" + x);
        if (x <= 0) {
            logger.warning("naturalLog: non-positive input " + x);
            throw new IllegalArgumentException("Natural log is only defined for positive numbers.");
        }
        double result = Math.log(x);
        logger.info("naturalLog result=" + result);
        return result;
    }

    public double power(double base, double exponent) {
        logger.info("power called with base=" + base + ", exponent=" + exponent);
        double result = Math.pow(base, exponent);
        logger.info("power result=" + result);
        return result;
    }
}
