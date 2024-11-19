package petStore;

import com.google.gson.Gson;
import io.restassured.http.Method;
import io.restassured.response.Response;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import juiceShop.frameworkUtils.Utils;
import petStore.models.User;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class UserTest extends BaseTest{

    @DataProvider(name = "userDp")
    public Iterator<Object[]> userDp () {
        Collection<Object[]> dp = new ArrayList<>();
        dp.add(new String[] {Utils.generateRandomNumber(100) + "", "alex", "alex", "dan", "dan@dan.com", "Qwerty12", "072498596", "0"});
        return dp.iterator();
    }

    @Test(dataProvider = "userDp")
    public void CreateUser(String id, String username, String name, String surrname, String email, String password, String phone, String status) {
        User u = new User(Integer.parseInt(id), username, name, surrname, email, password, phone, Integer.parseInt(status));
        Gson gson = new Gson();
        System.out.println(gson.toJson(u));
        httpRequest.body(gson.toJson(u));
        Response response = httpRequest.request(Method.POST, "/user");
        System.out.println(response.getBody().asString());
        System.out.println(response.getStatusCode());
//        Utils.serializeToFile(u, "file.txt");



    }
}
