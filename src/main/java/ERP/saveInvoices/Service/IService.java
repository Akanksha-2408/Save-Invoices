package ERP.saveInvoices.Service;

import ERP.saveInvoices.Exception.GSPException;

public interface IService {

    boolean saveInvoices(Object object) throws GSPException;
}
