package JSONManipulation;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public class SearchDataFromJSONArray {
    public static void main(String[] args) throws IOException, ParseException {
        JSONParser jsonParser = new JSONParser();
        JSONArray empArray = (JSONArray) jsonParser.parse(new FileReader("./src/main/resources/emp.json"));

       // System.out.println(empArray);

        for (Object obj : empArray) {
            JSONObject empObj = (JSONObject) obj;
            //int id = (int) empObj.get("id");

            String id = (String) empObj.get("id");
            if (id.equals("103")) {
                System.out.println("Data found");
                System.out.println(empObj);
                break;
            } else {
                System.out.println("Data not found");
            }
        }
    }
}
