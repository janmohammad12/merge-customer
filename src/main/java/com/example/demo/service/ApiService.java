package com.example.demo.service;

import com.example.demo.model.CombinedData;
import com.example.demo.model.PackOneModel;
import com.example.demo.model.PackTwoModel;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ApiService {

    private final RestTemplate restTemplate = new RestTemplate();

    public CombinedData fetchAndCombineData(int customerId) {

        PackOneModel[] pack1Data = restTemplate.getForObject("https://6466e9a7ba7110b663ab51f2.mockapi.io/api/v1/pack1", PackOneModel[].class);
        PackTwoModel[] pack2Data = restTemplate.getForObject("https://6466e9a7ba7110b663ab51f2.mockapi.io/api/v1/pack2", PackTwoModel[].class);

        //Get Pack One data
        List<String> packOne = Arrays.stream(pack1Data)
                .map(data -> data.getIngredient() + " " + data.getQuantity() + data.getUnit())
                .collect(Collectors.toList());

        //Get Pack two data
        List<String> packTwo = Arrays.stream(pack2Data)
                .map(data -> data.getIngredient() + " " + data.getQuantity() + data.getUnit())
                .collect(Collectors.toList());

        //Create Combine Data
        CombinedData combinedData = new CombinedData();
        combinedData.setId("1");
        combinedData.setCustomer_id(customerId);
        combinedData.setPack1(packOne);
        combinedData.setPack2(packTwo);

        return combinedData;
    }
}
