package JSONManipulation;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public class ReadJSONArrayList {
    public static void main(String[] args) throws IOException, ParseException {
        JSONParser jsonParser = new JSONParser();
        JSONArray jsonArray = (JSONArray) jsonParser.parse(new FileReader("./src/main/resources/emp.json"));

//        JSONObject empObj = (JSONObject) jsonArray.get(2);
//        System.out.println(empObj);
//        String name = (String) empObj.get("name");
//        System.out.println(name);

        for(Object obj: jsonArray){
            //System.out.println(obj);
            JSONObject jsonObject = (JSONObject) obj;
            System.out.println(jsonObject);
        }

    }
}
