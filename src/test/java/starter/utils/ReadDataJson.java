package starter.utils;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

/**
 *  This class reads the 'data.json' file to execute automation. The automation data is saved in the 'data.json' file
 */


public class ReadDataJson {

    private String name;
    private String lastName;
    private String userName;
    private String password;
    private String zip;

    public void getInformationUser() {
        try {
            JSONParser parser = new JSONParser();
            FileReader reader = new FileReader("data.json");
            JSONObject jsonObject = (JSONObject) parser.parse(reader);
            JSONArray array = (JSONArray) jsonObject.get("infoUser");
            JSONObject user = (JSONObject) array.get(0);
            name = user.get("name").toString();
            lastName = user.get("lastName").toString();
            userName= user.get("userName").toString();
            password=user.get("password").toString();
            zip=user.get("zip").toString();

        } catch (IOException | ParseException e) {
            throw new RuntimeException(e);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getZip() {return zip;}

    public void setZip(String zip) {this.zip = zip;}

    public void setLastName(String lastName) {this.lastName = lastName;}

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
