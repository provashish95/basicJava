package JSONManipulation;

import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class MyJSON {

    public static void main(String[] args) throws IOException {
        JSONObject empObj = new JSONObject();

        empObj.put("name", "Provashish");
        empObj.put("email", "provashish@gmail.com");
        empObj.put("Job", "SQA");

        JSONObject addressObj = new JSONObject();

        addressObj.put("Home", "Roy House");
        addressObj.put("Home No", "101");
        addressObj.put("Holding No", "R101");

        empObj.put("address", addressObj);


        System.out.println(empObj);

        FileWriter fw = new FileWriter("./src/main/resources/employee.json");
        fw.write(empObj.toJSONString());
        fw.flush();
        fw.close();
    }
}
