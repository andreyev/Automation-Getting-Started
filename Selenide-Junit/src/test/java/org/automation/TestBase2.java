package org.automation;

import java.io.IOException;
import java.util.Properties;

/**
 * Created by shantonu on 8/14/17.
 */
public abstract class TestBase2 {

    protected TestBase2(){
        Properties properties = System.getProperties();
        try {
            properties.load(this.getClass().getResourceAsStream("/selenide.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}