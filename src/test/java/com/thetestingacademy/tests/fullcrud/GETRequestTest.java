package com.thetestingacademy.tests.fullcrud;

import com.thetestingacademy.endpoint.APIConstants;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GETRequestTest {
   //Tc# status code
    //TC# Response not null
    //Tc# Id    should be present

    @Test
     public void test_get(){
//       RequestSpecification r = RestAssured.given();
//        r.baseUri(APIConstants.BASE_URL);
//        r.basePath(APIConstants.CREATE_GET_POST_URL_BOOKING);
//        r.when().get();
//        r.then().statusCode(200);
        System.out.println("Hello");
        Assert.assertTrue(true);

    }
    @Test
    public void test_get2(){

        System.out.println("Hello2");
    }




}
