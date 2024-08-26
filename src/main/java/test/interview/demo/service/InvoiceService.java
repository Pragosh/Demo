package test.interview.demo.service;

import test.interview.demo.domain.Invoice;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import test.interview.demo.exception.InvoiceNotFoundException;
import test.interview.demo.repository.InvoiceRepo;

import java.util.Collection;
import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class InvoiceService {

    private final InvoiceRepo invoiceRepo;

    public Invoice getInvoice(UUID id) {
        Invoice invoice = invoiceRepo.getById(id);
        if (invoice == null) {
            throw new InvoiceNotFoundException("Invoice with provided id not found");
        }
        return invoice;
    }

    public Collection<Invoice> getAllInvoices() {
        return invoiceRepo.getAllInvoices();
    }
}
