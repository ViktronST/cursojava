package es.cursojava.POO.herencia.concesionario;

public class Garaje {
    private Vehiculo plaza1;
    private Vehiculo plaza2;
    private Motocicleta plazaMoto;

    public boolean aparcarVehiculo(Vehiculo vehiculo) {
        if(vehiculo instanceof Motocicleta) {
            Motocicleta moto = (Motocicleta) vehiculo;
            if(moto.isTieneSidecar()) {
                System.out.println("No se permiten Motocicletas con sidecar.");
                return false;
            }else {
                
            }
        }
    }
    
}
