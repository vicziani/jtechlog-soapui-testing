package jtechlog.soapui;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService
public class TempConvert {

    @WebMethod
    @WebResult(name = "fahrenheit")
    public long celsiusToFahrenheit(@WebParam(name = "celsius") long celsius) {
        return celsius * 9 / 5 + 32;
    }

    @WebMethod
    @WebResult(name = "celsius")
    public long fahrenheitToCelsius(@WebParam(name = "fahrenheit") long fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
