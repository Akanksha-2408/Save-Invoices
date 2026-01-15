package ERP.saveInvoices.Handler.RestHandler;

import ERP.saveInvoices.Constants.ResponseMessage;
import ERP.saveInvoices.Exception.GSPException;
import ERP.saveInvoices.Handler.ResponseHandler;
import ERP.saveInvoices.Service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import java.util.Map;

@Component
public class RestHandlerImpl implements IRestHandler {

    @Autowired
    private IService service;

    @Override
    public ResponseEntity<Map<String, Object>> saveInvoices(Object object) throws GSPException {

        ResponseEntity<Map<String, Object>> result = null;

        if(service.saveInvoices(object)) {
            result = new ResponseEntity<>(
                    ResponseHandler.success(ResponseMessage.INVOICES_SAVED_SUCCESSFULLY),
                    HttpStatus.OK);
        }
        return result;
    }

}
