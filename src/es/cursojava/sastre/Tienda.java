package es.cursojava.sastre;

public class Tienda {
    public static void main(String[] args) {
        Boton boton1 = new Boton("rojo", "pequeño", "redondo");
        Boton boton2 = new Boton("azul", "mediano", "cuadrado");
        Boton boton3 = new Boton("verde", "grande", "redondo");

        Boton[] botones = {boton1, boton2, boton3};

        Pantalon pantalon1 = new Pantalon("azul", 20.0, "M", boton1);

        Camisa camisa1 = new Camisa("rojo", 15.0, "S", botones);

        Vestido vestido1 = new Vestido("verde", 30.0, "L");

        System.out.println("=====================================");
        Maniqui maniqui1 = new Maniqui(pantalon1, camisa1);
        System.out.println("Maniquí 1: " + maniqui1.getId());
        //Vestimos al maniqui con un pantalon y una camisa
        System.out.println("Pantalón: " + maniqui1.getPantalon().getColor() + " | Botón: " + pantalon1.getBoton().getColor() + " | Talla: " + pantalon1.getTalla());
        System.out.println("Camisa: " + maniqui1.getCamisa().getColor() + " | Botón: " + camisa1.getBoton().getColor() + " | Talla: " + camisa1.getTalla());

        System.out.println("=====================================");
        Maniqui maniqui2 = new Maniqui(vestido1);
        System.out.println("Maniquí 2: " + maniqui2.getId());
        //Vestimos al maniqui con un vestido
        System.out.println("Vestido: " + maniqui2.getVestido().getColor());

        System.out.println("=====================================");
        Maniqui maniqui3 = new Maniqui();
        System.out.println("Maniquí 3: " + maniqui3.getId());

        //Método abrirTienda() → donde se van a generar todos los objetos (no tiene que ser estático).
        // public void abrirTienda() {


    }
    
    
}
