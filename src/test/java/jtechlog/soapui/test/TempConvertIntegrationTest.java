package jtechlog.soapui.test;

import javax.xml.ws.Endpoint;

import jtechlog.soapui.TempConvert;

import com.eviware.soapui.tools.SoapUITestCaseRunner;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TempConvertIntegrationTest {

    static String address;

    static Endpoint ep;


    @BeforeAll
    static void beforeClass() {
        address = "http://localhost:9000/TempConvert";
        ep = Endpoint.publish(address, new TempConvert());
    }

    @AfterAll
    static void afterClass() {
        ep.stop();
    }


    @Test
    void testTempConvert() throws Exception {
        SoapUITestCaseRunner runner = new SoapUITestCaseRunner();
        runner.setProjectFile( "src/test/resources/TempConvert-soapui-project.xml" );
        runner.setEndpoint(address);
        runner.run();
    }
}
