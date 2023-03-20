import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class ParsingJson {

    @Test
    public void  testParsingJson() {
        Map <String, String> params =  new HashMap<>();
        params.put("name", "Andrey");
        JsonPath response = RestAssured
                .given()
                //.queryParam("name", "John")
                .queryParams(params)
                .get("https://playground.learnqa.ru/api/hello")
                .jsonPath();

        String name = response.get("answer2");
        if (name==null){
            System.out.println("The key 'answer2' is absent");
        } else
            System.out.println(name);
        System.out.println(name);
    }
}
