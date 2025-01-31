package es.cursojava.POO.herencia.orquesta;

public class BandaMusica {
    public static void main(String[] args) {
        BandaMusica concierto = new BandaMusica();
        concierto.empezarConcierto();
    }

    private void empezarConcierto() {
        Instrumento guitarra = new Guitarra("Gibson", "Cuerda Acústica", false, 6);
        Instrumento guitarraElectrica = new GuitarraElectrica("Feder", "Eléctrica", false, 6, 12.5);
        Instrumento piano = new Piano("Yamaha", "Cuerda Percutida", false, 7, "Acústico");
        Instrumento tambor = new Tambor("Millenium", "Membrana", true, "Cuero");

        Instrumento[] instrumentos = {guitarra, guitarraElectrica, piano, tambor};
        afinarInstrumentos(instrumentos);
        tocarInstrumentos(instrumentos);
    }

    private void afinarInstrumentos(Instrumento[] instrumentos) {
        System.out.println("= = = Afinando los instrumentos = = =");
        for (Instrumento instrumento : instrumentos) {
            instrumento.Afinar();
        }
    }

    private void tocarInstrumentos(Instrumento[] instrumentos) {
        for (Instrumento instrumento : instrumentos) {
            instrumento.Tocar();
        }
    }
}
