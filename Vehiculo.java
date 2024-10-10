public class Vehiculo {
    public String Marca;
    public String Modelo;
    public int Año;

    public String getMarca() {
        return Marca;
    }
    public void setMarca(String marca) {
        Marca = marca;
    }
    public String getModelo() {
        return Modelo;
    }
    public void setModelo(String modelo) {
        Modelo = modelo;
    }
    public int getAño() {
        return Año;
    }
    public void setAño(int año) {
        Año = año;
    }
    public Vehiculo(String marca, String modelo, int año) {
        this.Marca = marca;
        this.Modelo = modelo;
        this.Año= año;
    }
    public String mostrarInfo() {
        return "Marca: " + Marca + ", Modelo: " + Modelo + ", Año: " + Año;
    }

}

