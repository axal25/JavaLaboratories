package laboratories.lab1.exceptions;

public class CopyFileException extends Exception {
    public CopyFileException(String callingClassName, String callingFunctionName, String cause) {
        super(callingClassName + " >>> " + callingFunctionName + " >>> " + CopyFileException.class.getName() + ": " + "\n\r" +
                "Exception cause(custom): " + cause,
                new Throwable(cause)
        );
    }
}
