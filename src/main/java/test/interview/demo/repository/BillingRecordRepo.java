package test.interview.demo.repository;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import test.interview.demo.domain.BillingRecord;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class BillingRecordRepo {

    public List<BillingRecord> getAllBillingRecords() {
        return FakeDB.allBillingRecords;
    }

    public List<BillingRecord> getBillingRecordsByUser(int userId) {
        return FakeDB.allBillingRecords.stream()
                .filter(record -> record.getUser().getCustomerNumber() == userId)
                .collect(Collectors.toList());
    }

}