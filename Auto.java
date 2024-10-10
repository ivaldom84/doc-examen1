public class Auto extends Vehiculo {
        private int numeroPuertas;
        private boolean esAutomatico;
    
        public Auto(String marca, String modelo, int año, int numeroPuertas, boolean esAutomatico) {
            super(marca, modelo, año);
            this.numeroPuertas = numeroPuertas;
            this.esAutomatico = esAutomatico;
        }
    
        @Override
        public String mostrarInfo() {
            return super.mostrarInfo() + ", Número de Puertas: " + numeroPuertas + ", Es Automático: " + esAutomatico;
        }
    
    
}
