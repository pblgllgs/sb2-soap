package com.pblgllgs.soap.client;
/*
 *
 * @author pblgl
 * Created on 06-02-2024
 *
 */

import com.pblgllgs.soap.wsdl.*;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;


public class SoapClient extends WebServiceGatewaySupport {

    /**
     *
     * @param numberA
     * @param numberB
     * @return AddResponse
     */
    public AddResponse getAddResponse(int numberA, int numberB) {
        Add addRequest = new Add();
        addRequest.setIntA(numberA);
        addRequest.setIntB(numberB);

        SoapActionCallback soapActionCallback = new SoapActionCallback("http://tempuri.org/Add");
        return (AddResponse) getWebServiceTemplate().marshalSendAndReceive(
                "http://www.dneonline.com/calculator.asmx",
                addRequest,
                soapActionCallback
        );
    }

    /**
     *
     * @param numberA
     * @param numberB
     * @return SubtractResponse
     */

    public SubtractResponse getSubtractResponse(int numberA, int numberB) {
        Subtract subtractRequest = new Subtract();
        subtractRequest.setIntA(numberA);
        subtractRequest.setIntB(numberB);

        SoapActionCallback soapActionCallback = new SoapActionCallback("http://tempuri.org/Subtract");
        return (SubtractResponse) getWebServiceTemplate().marshalSendAndReceive(
                "http://www.dneonline.com/calculator.asmx",
                subtractRequest,
                soapActionCallback
        );
    }

    /**
     *
     * @param numberA
     * @param numberB
     * @return DivideResponse
     */

    public DivideResponse getDivideResponse(int numberA, int numberB) {
        Divide divideRequest = new Divide();
        divideRequest.setIntA(numberA);
        divideRequest.setIntB(numberB);

        SoapActionCallback soapActionCallback = new SoapActionCallback("http://tempuri.org/Divide");
        return (DivideResponse) getWebServiceTemplate().marshalSendAndReceive(
                "http://www.dneonline.com/calculator.asmx",
                divideRequest,
                soapActionCallback
        );
    }

    /**
     *
     * @param numberA
     * @param numberB
     * @return MultiplyResponse
     */

    public MultiplyResponse getMultiplyResponse(int numberA, int numberB) {
        Multiply multiplyRequest = new Multiply();
        multiplyRequest.setIntA(numberA);
        multiplyRequest.setIntB(numberB);

        SoapActionCallback soapActionCallback = new SoapActionCallback("http://tempuri.org/Multiply");
        return (MultiplyResponse) getWebServiceTemplate().marshalSendAndReceive(
                "http://www.dneonline.com/calculator.asmx",
                multiplyRequest,
                soapActionCallback
        );
    }
}
