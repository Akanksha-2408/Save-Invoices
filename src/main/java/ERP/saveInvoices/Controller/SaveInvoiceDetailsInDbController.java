package ERP.saveInvoices.Controller;

import ERP.saveInvoices.Exception.GSPException;
import ERP.saveInvoices.Handler.RestHandler.IRestHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
@RequestMapping(value = "/ERP")
@RequiredArgsConstructor
public class SaveInvoiceDetailsInDbController {

    private final IRestHandler restHandler;
    public static final Logger LOGGER = Logger.getLogger(SaveInvoiceDetailsInDbController.class.getName());

    @PostMapping("/invoice")
    public ResponseEntity<Map<String, Object>> saveInvoice(@RequestBody Object object) throws GSPException {

        LOGGER.log(Level.INFO, "START >> CLASS: InvoiceController >> METHOD: saveInvoiceDetailsInDb ");
        ResponseEntity<Map<String, Object>> result = restHandler.saveInvoices(object);
        LOGGER.log(Level.INFO, "END >> CLASS: InvoiceController >> METHOD: saveInvoiceDetailsInDb ");

        return result;
    }

}
