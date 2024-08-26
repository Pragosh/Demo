package test.interview.demo.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import test.interview.demo.domain.BillingRecord;
import test.interview.demo.service.BillingRecordService;

import java.util.List;

@RestController
@RequestMapping("/billingrecords")
@RequiredArgsConstructor
public class BillingController {


    private final BillingRecordService billingRecordService;

    @GetMapping
    public ResponseEntity<List<BillingRecord>> getAllBillingRecords() {
        List<BillingRecord> billingRecords = billingRecordService.getAllBillingRecords();
        return ResponseEntity.ok(billingRecords);
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<BillingRecord>> getBillingRecordsByUser(@PathVariable int userId) {
        List<BillingRecord> billingRecords = billingRecordService.getBillingRecordsByUser(userId);
        return ResponseEntity.ok(billingRecords);
    }
}
