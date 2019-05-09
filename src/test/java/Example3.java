import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.simple.parser.JSONParser;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;

public class Example3 {
    public static void main(String[] args) {

        JSONParser parser = new JSONParser();


        try {

            Object obj = parser.parse(new FileReader("example3.json"));
            ObjectMapper objectMapper = new ObjectMapper();
            Map<String,?> response = (Map<String, ?>) obj;
            Response response1 = objectMapper.readValue(response.toString(),Response.class);
            System.out.println(response1.toString());
            System.out.println("Done");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (org.json.simple.parser.ParseException e) {
            e.printStackTrace();
        }
    }
}