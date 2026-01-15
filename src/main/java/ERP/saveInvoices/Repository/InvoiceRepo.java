package ERP.saveInvoices.Repository;

import ERP.saveInvoices.Entity.InvoiceVO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceRepo extends JpaRepository<InvoiceVO, Long> {
}
