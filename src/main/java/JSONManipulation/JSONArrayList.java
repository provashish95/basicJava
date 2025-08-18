package JSONManipulation;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class JSONArrayList {
    public static void main(String[] args) throws ParseException, IOException {
        JSONParser jsonParser = new JSONParser();

        JSONArray jsonArray = (JSONArray) jsonParser.parse(new FileReader("./src/main/resources/emp.json"));

        JSONObject obj = new JSONObject();
        obj.put("name", "Arunima Roy");
        obj.put("job", "Medical Technologist");
        obj.put("id", "103");

        jsonArray.add(obj);

        System.out.println(jsonArray);

        FileWriter fr = new FileWriter("./src/main/resources/emp.json");
        fr.write(jsonArray.toJSONString());
        fr.flush();
        fr.close();

    }
}
