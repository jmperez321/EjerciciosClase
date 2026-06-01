package objetos2.Solution14;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class URLTest {
    @Test
    void successTest() {
        URL url = new URL();
        url.protocol = "http";
        url.domain = "www.mydomain.com";
        url.path = "/path/to";
        url.query = "query=true";
        url.fragment = "fragment1";

        Assertions.assertEquals("http://www.mydomain.com/path/to?query=true#fragment1", url.toString());
    }

    @Test
    void testInvalidProtocol() {
        URL url = new URL();
        url.protocol = " ";
        url.domain = "www.mydomain.com";
        url.path = "/path/to";
        url.query = "query=true";
        url.fragment = "fragment1";

        Assertions.assertThrows(InvalidURLException.class, () -> url.validar());
    }
    @Test
    void testInvalidDom() {
        URL url = new URL();
        url.protocol = "http";
        url.domain = " ";
        url.path = "/path/to";
        url.query = "query=true";
        url.fragment = "fragment1";

        Assertions.assertThrows(InvalidURLException.class, () -> url.validar());
    }

    @Test
    void testInvalidDomConEspacios() {
        URL url = new URL();
        url.protocol = "http";
        url.domain = "www. my domain .com";

        Assertions.assertThrows(InvalidURLException.class, () -> url.validar());
    }
    @Test
    void testInvalidExcpNoThrow() {
        URL url = new URL();
        url.protocol = "http";
        url.domain = "www.mydomain.com";

        Assertions.assertDoesNotThrow(() -> url.validar());
    }

}
