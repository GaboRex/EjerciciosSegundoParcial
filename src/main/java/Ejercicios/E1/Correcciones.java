package Ejercicios.E1;

public class Version {
    private int nroVersion;
    private String fecha;

    public Version(int nroVersion, String fecha) {
        this.nroVersion = nroVersion;
        this.fecha = fecha;
    }

    public int getNroVersion() {
        return nroVersion;
    }

    public void setNroVersion(int nroVersion) {
        this.nroVersion = nroVersion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
