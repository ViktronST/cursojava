package es.cursojava.poo.herencia.reinoanimal;

public class Zoologico {
    public static void main(String[] args) {
        Zoologico zoo = new Zoologico();
        zoo.abrirZoo();
    }

    private void abrirZoo(){
        Leon leon = new Leon(true, "Mufasa", 190);
        leon.cazar();
        leon.comer();
        leon.beber();

        Vaca vaca = new Vaca("Lola", 200, 0);
        vaca.mugir();
        vaca.comer();
        vaca.beber();

        Animal vaca1 = new Vaca("Pepita",202, 2);
        vaca1.comer();
        //vaca1.mugir(); //No se puede, la clase Animal no tiene el mugir.
        
        Animal leon1 = new Leon(true,"Leonidas", 200);
        
        Vaca vaca2 = (Vaca) vaca1;
        vaca2.mugir();
    }
}
