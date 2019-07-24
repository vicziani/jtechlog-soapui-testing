JTechLog soapUI
===============

Ez a program a JTechLog (<http://jtechlog.hu>) blog "Webszolgáltatások integrációs 
tesztelése SoapUI és JUnit használatával" posztjához készült példaprogram. 
Prezentálja azt, hogyan lehet webszolgáltatásokat automatikusan, JUnitból, SoapUI használatával
tesztelni. Egy POJO van JAX-WS webszolgáltatásként kiajánlva, és tesztelve. Mavennel buildelhető, 
és a letöltést követően a 'mvn jetty:run' paranccsal futtatható. A webszolgáltatás a
http://localhost:8080/services/TempConvert címen érhető el, innen van linkelve a WSDL állomány is.
A unit tesztek az 'mvn test' parancs kiadásával futtathatóak.

Felhasznált technológiák: JAX-WS, JUnit, SoapUI, Maven, Jetty

viczian.istvan a gmail-en