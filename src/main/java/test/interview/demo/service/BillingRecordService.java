package test.interview.demo.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import test.interview.demo.domain.BillingRecord;
import test.interview.demo.repository.BillingRecordRepo;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BillingRecordService {

    private final BillingRecordRepo billingRecordRepo;

    public List<BillingRecord> getAllBillingRecords() {
        return billingRecordRepo.getAllBillingRecords();
    }

    public List<BillingRecord> getBillingRecordsByUser(int userId) {
        return billingRecordRepo.getBillingRecordsByUser(userId);
    }
}
