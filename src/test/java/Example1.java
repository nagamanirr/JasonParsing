import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Example1 {
    public static void main(String[] args) {

        JSONParser parser = new JSONParser();

        try {
            Object obj = parser.parse(new FileReader("example1.json"));

            JSONObject jsonObject =  (JSONObject) obj;

           //write code here to parse the json

    List<Map<String, ?>> platformsList = (List<Map<String, ?>>) jsonObject.get("platforms");
    for (int i = 0; i < platformsList.size(); i++) {


        System.out.println(platformsList.get(i).get("id").toString());
        System.out.println(platformsList.get(i).get("name").toString());


        //print all the platforms


    }

}

catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (org.json.simple.parser.ParseException e) {
            e.printStackTrace();
        }
    }


    }