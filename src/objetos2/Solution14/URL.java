package objetos2.Solution14;

public class URL {
    String protocol;
    String domain;
    String path;
    String query;
    String fragment;

    public void validar() {
        if (protocol == null || protocol.trim().isEmpty()) {
            throw new InvalidURLException("El protocolo no puede estar vació.");
        }
        if (domain == null || domain.trim().isEmpty()) {
            throw new InvalidURLException("El dominio no puede estar vació.");
        }
        if(domain.contains(" ") || protocol.contains(" ")){
            throw new InvalidURLException("Protocolo/dominio No pueden contener espacios");
        }
    }

    public String toString() {
        return protocol + "://" + domain + path + "?" + query + "#" + fragment;
    }
}
