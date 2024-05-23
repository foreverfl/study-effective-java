package chapter10;

import java.sql.SQLException;

public class Item73_ThrowExceptionsAppropriateToAbstractionLevel {

    // 사용자 정의 예외
    private static class DatabaseException extends Exception {
        public DatabaseException(String message, Throwable cause) {
            super(message, cause);
        }
    }

    private static class ServiceException extends Exception {
        public ServiceException(String message, Throwable cause) {
            super(message, cause);
        }
    }

    private static class UserService {
        // 데이터베이스 작업 메서드
        public void performDatabaseOperation() throws SQLException {
            // 예를 들어, 데이터베이스 작업 중 예외 발생
            throw new SQLException("Database connection error");
        }

        // 서비스 작업 메서드 (예외 번역 및 연쇄 포함)
        public void performServiceOperation() throws ServiceException, DatabaseException {
            try {
                performDatabaseOperation();
            } catch (SQLException e) {
                // 예외 연쇄: SQLException을 DatabaseException으로 감싸서 던짐
                throw new DatabaseException("Database operation failed", e);
            }
        }
    }

    public static void main(String[] args) throws ServiceException {
        UserService userService = new UserService();

        // 예외 번역 예제
        try {
            userService.performServiceOperation();
        } catch (DatabaseException e) {
            // 예외 연쇄: DatabaseException을 ServiceException으로 감싸서 던짐
            throw new ServiceException("Service operation failed due to database error", e);
        } catch (ServiceException e) {
            System.out.println("Caught ServiceException: " + e.getMessage());
            // 예외의 원인 출력
            Throwable cause = e.getCause();
            while (cause != null) {
                System.out.println("Caused by: " + cause);
                cause = cause.getCause();
            }
        }
    }
}
