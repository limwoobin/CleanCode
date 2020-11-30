package Chapter14;

import static Chapter14.ArgsException.ErrorCode.OK;

public class ArgsException extends Exception {
    private char errorArgumentId = '\0';
    private String errorParameter = null;
    private ErrorCode errorCode = OK;

    public ArgsException() {}

    public ArgsException(String message) {
        super(message);
    }

    public ArgsException(ErrorCode errorCode) {
        this.errorCode = errorCode;
    }

    public ArgsException(ErrorCode errorCode , String errorParameter) {
        this.errorCode = errorCode;
        this.errorParameter = errorParameter;
    }

    public ArgsException(ErrorCode errorCode , char errorArgumentId , String errorParameter) {
        this.errorCode = errorCode;
        this.errorParameter = errorParameter;
        this.errorArgumentId = errorArgumentId;
    }

    public char getErrorArgumentId() {
        return errorArgumentId;
    }

    public void setErrorArgumentId(char errorArgumentId) {
        this.errorArgumentId = errorArgumentId;
    }

    public String getErrorParameter() {
        return errorParameter;
    }

    public void setErrorParameter(String errorParameter) {
        this.errorParameter = errorParameter;
    }

    public ErrorCode getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(ErrorCode errorCode) {
        this.errorCode = errorCode;
    }

    public String errorMessage() {
        switch (errorCode) {
            case OK:
                return "TILT: Should not get here.";
            case UNEXPECTED_ARGUMENT:
                return String.format("Argument -%c unexpected." , errorArgumentId);
            case MISSING_STRING:
                return String.format("Could not find string parameter for -%c." ,
                        errorArgumentId);
            case INVALID_ARGUMENT_FORMAT:
                return String.format("'%c' is not a valid argument format." ,
                        errorArgumentId);
            case INVALID_ARGUMENT_NAME:
                return String.format("'%c' is not a valid argument name." ,
                        errorArgumentId);
            default:
                return "";
        }
    }

    public enum ErrorCode {
        OK , INVALID_ARGUMENT_FORMAT , UNEXPECTED_ARGUMENT,
        INVALID_ARGUMENT_NAME ,
        MISSING_STRING,
        MISSING_INTEGER,
        MISSING_DOUBLE
    }
}
