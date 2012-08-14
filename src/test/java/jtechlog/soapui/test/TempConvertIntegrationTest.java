package jtechlog.soapui.test;

import java.net.MalformedURLException;

import javax.xml.ws.Endpoint;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import jtechlog.soapui.TempConvert;

import com.eviware.soapui.tools.SoapUITestCaseRunner;

public class TempConvertIntegrationTest {

    private static String address;

    private static Endpoint ep;


    @BeforeClass
    public static void beforeClass() throws MalformedURLException {
        address = "http://localhost:9000/TempConvert";
        ep = Endpoint.publish(address, new TempConvert());
    }

    @AfterClass
    public static void afterClass() {
        ep.stop();
    }


    @Test
    public void testTempConvert() throws Exception {
        SoapUITestCaseRunner runner = new SoapUITestCaseRunner();
        runner.setProjectFile( "src/test/resources/TempConvert-soapui-project.xml" );
        runner.setEndpoint(address);
        runner.run();
    }
}
