package com.thetestingacademy.tests.fullcrud;

import com.thetestingacademy.endpoint.APIConstants;
import com.thetestingacademy.tests.base.BaseTest;
import io.qameta.allure.internal.shadowed.jackson.core.JsonProcessingException;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.ValidatableResponse;
import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PostRequestTest extends BaseTest {



        @Test
        public void test_postCreateBooking() throws JsonProcessingException {
         // URL , header
         // payload -- PayloadModule
         // post
         // response validation --Assert action
         requestSpecification.basePath(APIConstants.CREATE_GET_POST_URL_BOOKING);
         response = RestAssured.given().spec(requestSpecification)
                         .when().body(payloadModule.createPayload()).post();

         validatableResponse= response.then().log().all();
         String responseString = response.asString();
         System.out.println(responseString);

         JsonPath jsonpath = new JsonPath(responseString);
         String bookingid = jsonpath.getString("bookingid");
         String firstname = jsonpath.getString("booking.firstname");

         // status (hamcrest from the rest Assured)
          validatableResponse.statusCode(200);
          //time verification
          //validatableResponse.body(Matchers.lessThan(5000L));

         //TestNG
          Assert.assertNotNull("bookingid");

        }



        }






