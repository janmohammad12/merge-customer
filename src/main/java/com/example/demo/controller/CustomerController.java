package com.example.demo.controller;
import com.example.demo.model.CombinedData;
import com.example.demo.model.CustomerDataBO;
import com.example.demo.service.ApiService;
import com.fasterxml.jackson.core.util.RequestPayload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class CustomerController {

    @Autowired
    private ApiService apiService;

    @PostMapping("/merge-customer-data")
    public ResponseEntity<CombinedData> combineData(@RequestBody CustomerDataBO requestPayload) {
        try {
            CombinedData combinedData = apiService.fetchAndCombineData(Integer.valueOf(requestPayload.getCustomer_id()));
            return ResponseEntity.ok(combinedData);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}
