package ERP.saveInvoices.Exception;


public class GSPException extends RuntimeException {

    ErrorCode errorCode;

    public GSPException(ErrorCode message) {
        super(message.getMessage());
        this.errorCode = message;
    }
}
