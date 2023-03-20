import io.restassured.RestAssured;
import io.restassured.response.Response;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class HelloWorldTest {
    
    @Test
    public void  testHelloWorld() {
        Map <String, String> body =  new HashMap<>();
        body.put("param1", "value1");
        body.put("param2", "value2");
//        params.put("name", "Andrey");
        Response response = RestAssured
                .given()
                //.queryParam("name", "John")
  //              .queryParams(params)
//                .queryParam("param1", "value1")
//              .queryParam("param2", "value2")
//                .body("param1=value1&param2=value2")
//                .body("{\"param1\":\"value1\", \"param2\":\"value2\"} " )
                .body(body)
                .post("https://playground.learnqa.ru/api/check_type")
                .andReturn();
        response.print();
    }
}
