public class Moto extends Vehiculo {
    private int cilindraje;
    private String tipo;

    public Moto(String marca, String modelo, int año, int cilindraje, String tipo) {
        super(marca, modelo, año);
        this.cilindraje = cilindraje;
        this.tipo = tipo;
    }

    @Override
    public String mostrarInfo() {
        return super.mostrarInfo() + ", Cilindraje: " + cilindraje + ", Tipo: " + tipo;
    }

}
