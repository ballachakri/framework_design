package com.cath.project.SamplecodeTesting;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Test;

public class FirstRest {
@Test
public void getRepoRt()
{
    RestAssured.baseURI ="http://restapi.demoqa.com/utilities/weather/city/";

    RequestSpecification req=RestAssured.given ();

    Response resp=req.request (Method.GET,"Delhi");

    int code=resp.getStatusCode ();
    String str=resp.getBody ().asString ();

    System.out.println (code);
    System.out.println (str);


}

}
