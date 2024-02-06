package com.pblgllgs.soap.controller;
/*
 *
 * @author pblgl
 * Created on 06-02-2024
 *
 */

import com.pblgllgs.soap.client.SoapClient;
import com.pblgllgs.soap.wsdl.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping
public class SoapController {
    private final SoapClient soapClient;

    public SoapController(SoapClient soapClient) {
        this.soapClient = soapClient;
    }

    @PostMapping("/add")
    public ResponseEntity<Map<String, Integer>> add(
            @RequestParam("numberA") int numberA,
            @RequestParam("numberB") int numberB
    ){
        AddResponse addResponse = soapClient.getAddResponse(numberA, numberB);
        Map<String, Integer> response = Map.of("response", addResponse.getAddResult());
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping("/subtract")
    public ResponseEntity<Map<String, Integer>> subtract(
            @RequestParam("numberA") int numberA,
            @RequestParam("numberB") int numberB
    ){
        SubtractResponse subtractResponse = soapClient.getSubtractResponse(numberA, numberB);
        Map<String, Integer> response = Map.of("response", subtractResponse.getSubtractResult());
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping("/divide")
    public ResponseEntity<Map<String, Integer>> divide(
            @RequestParam("numberA") int numberA,
            @RequestParam("numberB") int numberB
    ){
        DivideResponse divideResponse = soapClient.getDivideResponse(numberA, numberB);
        Map<String, Integer> response = Map.of("response", divideResponse.getDivideResult());
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping("/multiply")
    public ResponseEntity<Map<String, Integer>> multiply(
            @RequestParam("numberA") int numberA,
            @RequestParam("numberB") int numberB
    ){
        MultiplyResponse multiplyResponse = soapClient.getMultiplyResponse(numberA, numberB);
        Map<String, Integer> response = Map.of("response", multiplyResponse.getMultiplyResult());
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
