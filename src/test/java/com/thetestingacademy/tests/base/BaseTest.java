package com.thetestingacademy.tests.base;

import com.thetestingacademy.actions.AssertActions;
import com.thetestingacademy.endpoint.APIConstants;
import com.thetestingacademy.module.PayloadModule;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    // Common functionality
    protected RequestSpecification requestSpecification;
    protected Response response;
    protected ValidatableResponse validatableResponse;
    protected AssertActions assertActions = new AssertActions();
    protected PayloadModule payloadModule = new PayloadModule();


    // Before any Method
    @BeforeMethod

    protected void setUpBeforeMethod(){
        requestSpecification =
                // RestAssured.given().baseUri().contentType();
                new RequestSpecBuilder()
                        .setBaseUri(APIConstants.BASE_URL)
                        .addHeader("Content-Type" , "application/json")
                        .build().log().all();


    }

}
