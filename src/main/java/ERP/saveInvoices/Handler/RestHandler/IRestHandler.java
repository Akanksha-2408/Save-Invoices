package ERP.saveInvoices.Handler.RestHandler;

import ERP.saveInvoices.Exception.GSPException;
import org.springframework.http.ResponseEntity;
import java.util.Map;

public interface IRestHandler {

    ResponseEntity<Map<String, Object>> saveInvoices(Object object) throws GSPException;
}
