package Step_Def;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.collections.Maps;

import java.util.List;
import java.util.Map;

public class Test_Step_Def
{
    @Given("{int} user is on login page")
    public void user_is_on_login_page(Integer int1) {
        System.out.println("Integer regex working"+int1);

    }


    @Then("{double} user is on login page")
    public void user_is_on_login_page(Double double1) {
        System.out.println("Float working");
    }

    @Then("user enters \"(.*?)\"")
    public void user_enters(String string) {
        System.out.println("String 1 working");

    }

    @Then("user enters below credentials")
    public void user_enters_below_credentials(io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.

        List<String> dataTableList=dataTable.asList(String.class);

        String name=dataTableList.get(0);
        String pass=dataTableList.get(1);
        System.out.println("DataTable without header--"+name+"---"+pass);
    }

    @Then("user enters below credentials too")
    public void user_enters_below_credentials_too(io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
       List<Map<String,String>> dataTableValues =dataTable.asMaps(String.class,String.class);
        String userName = dataTableValues.get(0).get("UserName");
        String password = dataTableValues.get(0).get("Password");

        System.out.println("DataTable with header--"+userName+"---"+password);
    }

    @Then("USer register with \"(.*?)\" and \"(.*?)\"")
    public void u_ser_register_with_and(String string, String string2) {


    }


}
