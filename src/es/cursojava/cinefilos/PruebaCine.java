package es.cursojava.cinefilos;

public class PruebaCine {
    public static void main(String[] args) {
        Cine cine = new Cine("Trinity", 1);
        
        Sala sala1 = new Sala(1, "El rey león", "");
        Sala sala2 = new Sala(2, "Tennet", "30");
        Sala sala3 = new Sala(3, "Los Odiosos 8", "30");
        
        Espectador espectador1 = new Espectador("Juan", "20405060L");
        Espectador espectador2 = new Espectador("María", "10509070H");
        Espectador espectador3 = new Espectador("Ivan", "85274163Z");
        
    }
}
