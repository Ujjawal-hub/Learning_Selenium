package Data_Driven;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import Utility.Util;


public class Dummy_Data_Driven {

    @Test(dataProvider = "data_function")
    public void dummy_test_run(String email, String password) {

        System.out.println("Email - " + email + " , Password - " + password);

    }


    @DataProvider
    public Object[][] data_function() {




        return Util.getdata("LoginData");

    }
}