package APITests;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;
import org.json.JSONObject;

public class RESTUtil {
    static String phonebookURI = "http://localhost:8080/";
    static String usersPath = "users/";

    public static String RESTGetName(String username, String password)
    {
        try {
            Response resUser = RestAssured.given().auth().preemptive().basic(username, password).get(phonebookURI + usersPath + username + "/");
            JSONObject obj = new JSONObject(resUser.asString());
            return obj.getString("nickname");
        }
        catch (Exception e) {
            return "ErrorGET";
        }
    }

    public static int RESTcheckStatus (String username, String password) {
        Response resUser = RestAssured.given().auth().preemptive().basic(username, password).get(phonebookURI + usersPath + username + "/");
        return resUser.getStatusCode();
    }

    public static String RESTGetNameAnonymous(String username)
    {
        try {
            Response resUser = RestAssured.given().auth().preemptive().basic("anonymous", "anonymous").get(phonebookURI + usersPath + username + "/");
            JSONObject obj = new JSONObject(resUser.asString());
            return obj.getString("nickname");
        }
        catch (Exception e) {
            return "ErrorGET";
        }
    }

    public static String RESTGetFirstname(String username)
    {
        try {
            Response resUser = RestAssured.given().auth().preemptive().basic("anonymous", "anonymous").get(phonebookURI + usersPath + username + "/");
            JSONObject obj = new JSONObject(resUser.asString());
            return obj.getString("firstName");
        }
        catch (Exception e) {
            return "ErrorGET";
        }
    }

    public static int RESTPOSTName(String inputJson)
    {
        try {
            String admn1 = "admintwo"; String pswd1 = "password";
            RestAssured.baseURI = phonebookURI;
            RestAssured.basePath = usersPath;
            Response resUser = RestAssured.given().auth().preemptive().basic(admn1, pswd1).body(inputJson).contentType("application/json").when().post("");
            return resUser.getStatusCode();
        }
        catch (Exception e) {
            return 500;
        }
    }

    public static int RESTPUTName(String inputJson, String username)
    {
        try {
            String admn1 = "admintwo"; String pswd1 = "password";
            RestAssured.baseURI = phonebookURI;
            RestAssured.basePath = usersPath + username;
            Response resUser = RestAssured.given().auth().preemptive().basic(admn1, pswd1).body(inputJson).contentType("application/json").when().put("");
            return resUser.getStatusCode();
        }
        catch (Exception e) {
            return 500;
        }
    }

    public static int RESTDELETEuser(String username)
    {
        try {
            String admn1 = "admintwo"; String pswd1 = "password";
            RestAssured.baseURI = phonebookURI;
            RestAssured.basePath = usersPath + username;
            Response resUser = RestAssured.given().auth().preemptive().basic(admn1, pswd1).contentType("application/json").when().delete();
            return resUser.getStatusCode();
        }
        catch (Exception e) {
            return 500;
        }
    }
}
