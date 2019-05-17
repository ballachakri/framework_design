package com.cath.project;


import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.io.IOException;

public class Hooks {



  private DriverManager driverManager=new DriverManager ();

@Before
    public void openTheBrowser()
    {
        driverManager.setUpTheBrowser ();
        driverManager.maximizeBrowser ();
     //   driverManager.clearCookies ();
        driverManager.navigateTo ("https://www.cathkidston.com/");
        driverManager.killCookies ();

        //driverManager.disAbleAlert ();;
    }


    @After
    public void tearDownBrowser(Scenario src) throws IOException {
        Utils util=new Utils ();
        if (src.isFailed ())
         {
            util.screenShotGenerator (src.getName ());
             }
       driverManager.closeBrowser ();
    }
}
