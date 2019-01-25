package com.example.merchantservice.MicroServiceCommunication;

import com.example.merchantservice.Entity.MerchantEntity;
import com.example.merchantservice.MerchantRepository.MerchantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

public class MicroServiceCommunication {


    @Autowired
    MerchantRepository merchantRepository;

    public void getMessage() {


        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        MerchantEntity data = merchantRepository.findOne("124");

        HttpEntity<?> entity = new HttpEntity<Object>(data, headers);
        ResponseEntity<Object> responseEntity = restTemplate.exchange("localhost:8080/getMessage", HttpMethod.POST, entity, Object.class);
    }
}
