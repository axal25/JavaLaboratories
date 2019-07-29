package utils;

public class ExceptionMessageGenerator {
    public static String getMessage( String callingClassName, String callingFunctionName, Exception e) {
        String message = callingClassName + " >>> " + callingFunctionName + ": \n\r" +
                "Exception class: " + e.getClass() + "\n\r" +
                "Exception message: " + e.getMessage() + "\n\r" +
                "Exception cause: " + e.getCause() + "\n\r" +
                "Exception stack trace \\/\\/\\/: " + "\n\r" + getStackTraceAsString(e) +
                "Exception stack trace /\\/\\/\\" + "\n\r";
        try {
            Thread.sleep(50);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        return message;
    }

    public static String getStackTraceAsString(Exception e) {
        StackTraceElement[] stackTrace = e.getStackTrace();
        String stackTraceAsString = "";
        for(int i=0; i<stackTrace.length; i++) {
            stackTraceAsString += stackTrace[i].toString() + "\n\r";
        }
        return stackTraceAsString;
    }
}
