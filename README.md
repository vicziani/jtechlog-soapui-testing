JTechLog soapUI
===============

Ez a program a JTechLog (<http://jtechlog.blogspot.com>) blog "Webszolgáltatások integrációs 
tesztelése soapUI és JUnit használatával" cikkéhez készült példaprogram. 
Prezentálja azt, hogyan lehet webszolgáltatásokat automatikusan, JUnit-ból, soapUI használatával
tesztelni. Egy POJO van JAX-WS webszolgáltatásként kiajánlva, és tesztelve. Maven-nel build-elhető, 
és a letöltést követően a 'mvn jetty:run' paranccsal futtatható. A webszolgáltatás a
http://localhost:8080/services/TempConvert címen érhető el, innen van linkelve a WSDL állomány is.
A unit tesztek az 'mvn test' parancs kiadásával futtathatóak.

Felhasznált technológiák: Servlet 2.5, JAX-WS 2.2.6-2, 
JUnit 4.10, soapUI 4.5.1, Maven 3.0.3, Jetty 8.0.4

viczian.istvan a gmail-en