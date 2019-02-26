package Backend_API;

import io.restassured.RestAssured;
import org.junit.Before;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.contains;

public class NovaPoshtaTest {

    //@Test
    public void KucheryavoTest(){

        RestAssured.baseURI = "https://api.novaposhta.ua/v2.0/xml/";

        String postBody = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"
                + "<file>\n"
                   + "<apiKey>252468795c71540730f78a03ab5ec04e</apiKey>\n"
                + "<modelName>Address</modelName>\n"
                + "<calledMethod>searchSettlements</calledMethod>\n"
                + "<methodProperties>\n"
                    + "<CityName>Киї</CityName>\n"
                    + "<Limit>5</Limit>\n"
                + "</methodProperties>\n"
                + "</file>";

        given()
                .contentType("text/html; charset=utf-8")
                .log().all()
                .body(postBody)
        .when().
                post("v2.0/xml/Address/searchSettlements/").
        then().log().all().
                assertThat().statusCode(200).
                body(contains("e718a680-4b33-11e4-ab6d-005056801329"));

  }

}
