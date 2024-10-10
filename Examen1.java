import java.util.ArrayList;
import java.util.List;

public class Examen1 {
    public static void main(String[] args) {

        List<Vehiculo> vehiculos = new ArrayList<>();
        
        
        vehiculos.add(new Auto("Toyota", "Corolla", 2020, 4, true));
        vehiculos.add(new Auto("Ford", "Fiesta", 2019, 4, false));
        vehiculos.add(new Moto("Yamaha", "MT-07", 2021, 689, "Deportiva"));
        vehiculos.add(new Moto("Honda", "CBR500R", 2020, 471, "Deportiva"));

        
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(vehiculo.mostrarInfo());
        }
    }

    }