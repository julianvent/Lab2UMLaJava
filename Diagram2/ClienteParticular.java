package Diagram2;

public class ClienteParticular extends Cliente{

    private String tarjeta;

    public ClienteParticular(String tarjeta) {
        this.tarjeta = tarjeta;
    }

    public String getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(String tarjeta) {
        this.tarjeta = tarjeta;
    }
}
