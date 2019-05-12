package com.cath.project;

public class LoginResults extends DriverManager{

    public String getLoginURL()
    {
        String lURL=driver.getCurrentUrl ();
        return lURL;
    }
}
