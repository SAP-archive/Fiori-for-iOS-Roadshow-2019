package com.example.backend.travelexpense;

public abstract class TestSettings {
    private static final boolean INTERNAL_TEST_MODE = true;

    private static final boolean EXTERNAL_TEST_MODE = Boolean.getBoolean("test.mode") // Check if Java System property is "true".
        || String.valueOf(System.getenv("TEST_MODE")).equals("true"); // Check system environment variable.

    public static final boolean TEST_MODE = INTERNAL_TEST_MODE | EXTERNAL_TEST_MODE;
}
