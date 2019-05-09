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
            Map<String,?> responseData = (Map<String, ?>) obj;
            Map<String,?> feed1= (Map<String, ?>) responseData.get("responseData");
            String res = feed1.get("feed").toString();
            ObjectMapper objectMapper = new ObjectMapper();

             Feed feed = objectMapper.readValue(res,Feed.class);

            System.out.println(feed.toString());

             responseData.get("responseData");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (org.json.simple.parser.ParseException e) {
            e.printStackTrace();
        }
    }
}