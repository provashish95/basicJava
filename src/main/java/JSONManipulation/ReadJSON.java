package JSONManipulation;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public class ReadJSON {
    public static void main(String[] args) throws IOException, ParseException {
        JSONParser jsonParser = new JSONParser();

        //Object obj = jsonParser.parse( new FileReader("./src/main/resources/employee.json"));
        //System.out.println(obj);

        JSONObject obj = (JSONObject) jsonParser.parse(new FileReader("./src/main/resources/employee.json"));

        String job = (String) obj.get("Job");
        String name = obj.get("name").toString();
        System.out.println(job);

        JSONObject address = (JSONObject) obj.get("address");
        System.out.println(address);

        String home = (String) address.get("Home");
        System.out.println(home);

    }
}
