package chapter10;

import java.sql.SQLException;

/**
 * Example class to demonstrate JavaDoc for documenting all thrown exceptions.
 */
public class Item74_DocumentAllThrownExceptions {

    /**
     * Custom checked exception for demonstrating JavaDoc.
     */
    public static class CustomCheckedException extends Exception {
        /**
         * Constructs a CustomCheckedException with the specified detail message.
         * 
         * @param message the detail message
         */
        public CustomCheckedException(String message) {
            super(message);
        }
    }

    /**
     * Custom unchecked exception for demonstrating JavaDoc.
     */
    @SuppressWarnings("unused")
    public static class CustomUncheckedException extends RuntimeException {
        /**
         * Constructs a CustomUncheckedException with the specified detail message.
         * 
         * @param message the detail message
         */
        public CustomUncheckedException(String message) {
            super(message);
        }
    }

    public static class ExampleService {

        /**
         * This method performs a database operation.
         *
         * @param value The value to check.
         * @throws CustomCheckedException   if the database operation fails
         * @throws IllegalArgumentException if the value is negative
         */
        public void performOperation(int value) throws CustomCheckedException {
            if (value < 0) {
                throw new IllegalArgumentException("Value must be non-negative");
            }

            try {
                // Simulating a database operation that can fail
                performDatabaseOperation();
            } catch (SQLException e) {
                throw new CustomCheckedException("Database operation failed");
            }
        }

        /**
         * Simulates a database operation that can throw SQLException.
         *
         * @throws SQLException if there is a database error
         */
        private void performDatabaseOperation() throws SQLException {
            // Simulating a database error
            throw new SQLException("Simulated database error");
        }
    }

    /**
     * Main method to demonstrate the usage of ExampleService.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        ExampleService service = new ExampleService();

        try {
            service.performOperation(-1);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } catch (CustomCheckedException e) {
            System.out.println("Caught CustomCheckedException: " + e.getMessage());
        }

        try {
            service.performOperation(1);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } catch (CustomCheckedException e) {
            System.out.println("Caught CustomCheckedException: " + e.getMessage());
        }
    }
}