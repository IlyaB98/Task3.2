package transport;

public class CantDiagnosticException extends Exception{

    public CantDiagnosticException() {
    }

    public CantDiagnosticException(String message) {
        super(message);
    }
}
