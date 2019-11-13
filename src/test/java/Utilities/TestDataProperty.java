package Utilities;


import java.io.IOException;
import java.util.Properties;



public class TestDataProperty {
    private static Properties testData;
    static
    {
        /*
            if there's a need for cross-browser testing this can be enhanced
         */

        String DataFile = System.getProperty("testDataFile", "chrome.test.properties");

        testData = new Properties();
        try
        {
            testData.load(Thread.currentThread().getContextClassLoader().getResourceAsStream(DataFile));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static String getDataItem(String s) {
        return testData.getProperty(s);
    }
}
