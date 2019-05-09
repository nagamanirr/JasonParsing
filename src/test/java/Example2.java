import org.json.simple.parser.JSONParser;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class Example2 {
    public static void main(String[] args) {

        JSONParser parser = new JSONParser();

        //write code here to print all the cars for each person
        try {
            Object jsonObject = parser.parse(new FileReader("example2.json"));
            List<Map<String, ?>> personDetails = (List<Map<String, ?>>) jsonObject;
            int count =1;

            for (Map<String, ?> person: personDetails) {
                System.out.println("=================");
                System.out.println("First Name " + person.get("name") );
                System.out.println("City " + person.get("city"));
                System.out.println("And this person's cars are ");
                for (String car: (List<String>)person.get("cars") ) {
                    System.out.println(car);

                }
                System.out.println("He has " + person.get("job") + " job");
                System.out.println("=================");
            }


            for(int i=0;i<personDetails.size();i++)
            {
                System.out.println("User  "+count+"  Details");
                System.out.println("First Name     "+personDetails.get(i).get("name"));
                System.out.println("City    " +personDetails.get(i).get("city"));

                List<String> carNames=(List<String>) personDetails.get(i).get("cars");
                System.out.println("Car Names  ");
                 for(int j=0;j<carNames.size();j++)
                 {
                     System.out.println(carNames.get(j));

                 }

                System.out.println("Job   " +personDetails.get(i).get("job"));
                 count++;

                System.out.println("-----------------------------------------------");




            }








        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (org.json.simple.parser.ParseException e) {
            e.printStackTrace();
        }
    }
}