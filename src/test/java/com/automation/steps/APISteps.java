package com.automation.steps;

import com.automation.utils.RestAssuredUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class APISteps {
    @Given("user set up request for {string} end point")
    public void userSetUpRequestForEndPoint(String endpoint) {
        RestAssuredUtils.setEndpoint(endpoint);
    }

    @When("user perform GET request")
    public void userPerformGETRequest() {
        RestAssuredUtils.get();
    }

    @When("user perform POST request")
    public void userPerformPOSTRequest() {
        RestAssuredUtils.post();
    }

    @When("user perform PUT request")
    public void userPerformPUTRequest() {
        RestAssuredUtils.put();
    }

    @Then("verify status code is {int}")
    public void verifyStatusCodeIs(int statusCode) {
        Assert.assertEquals(statusCode, RestAssuredUtils.getStatusCode());
    }

    @And("set header value{string} to {string}")
    public void setHeaderValueTo(String key, String value) {
        RestAssuredUtils.setHeaderValue(key,value);
    }

    @And("set body for the create booking request")
    public void setBodyForTheCreateBookingRequest() throws FileNotFoundException {
        RestAssuredUtils.setBody(readDataFromFile("src/test/resources/data/create_user_body_json"));
    }
    public static String readDataFromFile(String filePath) throws FileNotFoundException {
        File file = new File(filePath);
        Scanner sc = new Scanner(file);
        sc.useDelimiter("\\Z");
        return sc.next();
    }

    @And("set body for the create token request")
    public void setBodyForTheCreateTokenRequest() throws FileNotFoundException {
        RestAssuredUtils.setBody(readDataFromFile("src/test/resources/data/create_token_body_json"));
    }

    @And("verify response body has a token")
    public void verifyResponseBodyHasAToken() {
        String token=RestAssuredUtils.getResponseField("token");
        Assert.assertFalse(token.isEmpty());
        System.out.println(token);
    }
}
