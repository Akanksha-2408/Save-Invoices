package ERP.saveInvoices.Service;

import ERP.saveInvoices.Constants.ResponseMessage;
import ERP.saveInvoices.Entity.InvoiceVO;
import ERP.saveInvoices.Exception.ErrorCode;
import ERP.saveInvoices.Exception.GSPException;
import ERP.saveInvoices.Repository.InvoiceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tools.jackson.databind.ObjectMapper;
import java.util.logging.Level;
import java.util.logging.Logger;

@Service
public class ServiceImpl implements IService {

    @Autowired
    private InvoiceRepo repo;

    public static final Logger LOGGER = Logger.getLogger(ServiceImpl.class.getName());

    @Override
    public boolean saveInvoices(Object object) throws GSPException {

        LOGGER.log(Level.INFO, "START >> CLASS: ServiceImpl >> METHOD: saveInvoices");

        try {
            ObjectMapper mapper = new ObjectMapper();
            String json = mapper.writeValueAsString(object);
            repo.save(InvoiceVO.builder().invoice(json).build());

            LOGGER.log(Level.INFO, "END >> CLASS: ServiceImpl >> METHOD: saveInvoices");
            return true;

        } catch (Exception e) {

            LOGGER.log(Level.SEVERE, ResponseMessage.FAILED_TO_SAVE_INVOICES, e);
            throw new GSPException(ErrorCode.FAILED_TO_SAVE_INVOICES);
        }
    }
}
