import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.simple.parser.JSONParser;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;

public class Example4 {
    public static void main(String[] args) {

        JSONParser parser = new JSONParser();

        try {
            Object obj = parser.parse(new FileReader("example4.json"));


          //write code here to print all the type of phone no and the corresponding no

            ObjectMapper objectMapper = new ObjectMapper();
            Map<String,?> person = (Map<String, ?>) obj;
            Person person1 = objectMapper.readValue(person.toString(),Person.class);
            System.out.println(person1.phoneNumber);
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