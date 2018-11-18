package com.gierat.anna;

import com.gierat.anna.model.GetCountriesRequest;
import com.gierat.anna.model.GetCountriesResponse;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;

public class Application {

    public static void main(String[] args) {
        GetCountriesRequest getCountriesRequest = new GetCountriesRequest();
        getCountriesRequest.setName("Poland");

        String url = "http://localhost:8080/getCountryByName";

        RestTemplate restTemplate = new RestTemplate();
        GetCountriesResponse response = restTemplate.postForObject(url, getCountriesRequest,
                GetCountriesResponse.class, new HashMap<>());
        System.out.println(response.getCountry().getName());
        System.out.println(response.getCountry().getCapital());
        System.out.println(response.getCountry().getPopulation());
    }
}
