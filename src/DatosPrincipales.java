public class DatosPrincipales {

    private double ImporteTotal;
    private double cotizacion;
    private String monedaOrigen;
    private String monedaFinal;
    private String tiempo;

    public DatosPrincipales(Datos datos) {
        this.ImporteTotal = datos.conversion_result();
        this.cotizacion = datos.conversion_rates();
        this.monedaFinal = datos.target_code();
        this.monedaOrigen = datos.base_code();
        this.tiempo = datos.time_next_update_utc();

    }

    @Override
    public String toString() {
        return monedaOrigen + " " + " " + "==> Equivalente a: ==>  " + ImporteTotal + " "
                + monedaFinal;
    }
}





