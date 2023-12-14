package KI304MoravskyLab5;

public class Exception extends ArithmeticException {
    /**
     * Constructs a new `CalcException` with no detail message.
     */
    public Exception() {
    }
    /**
     * Constructs a new `CalcException` with the specified detail message.
     *
     * @param cause The detail message describing the reason for the exception.
     */
    public Exception(String cause) {
        super(cause);
    }
}
