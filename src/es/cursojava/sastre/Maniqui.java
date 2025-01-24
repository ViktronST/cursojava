package es.cursojava.sastre;

public class Maniqui {
    //Creamos la clase maniquí con los atributos id (identificador), pantalón, camisa y vestido.
    private int id;
    private Pantalon pantalon;
    private Camisa camisa;
    private Vestido vestido;

    //Creamos 3 cosntructores
    // 1. Contructor que inicialice con pantalón y camisa.
    public Maniqui(Pantalon pantalon, Camisa camisa) {
        this.id = 903071;
        this.pantalon = pantalon;
        this.camisa = camisa;
    }

    // 2. Contructor que inicialice con vestido.
    public Maniqui(Vestido vestido) {
        this.id = 923273;
        this.vestido = vestido;
    }

    // 3. Constructor por defecto
    public Maniqui() {
        this.id = 993377;
    }

    //Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Pantalon getPantalon() {
        return pantalon;
    }

    public void setPantalon(Pantalon pantalon) {
        this.pantalon = pantalon;
    }

    public Camisa getCamisa() {
        return camisa;
    }

    public void setCamisa(Camisa camisa) {
        this.camisa = camisa;
    }

    public Vestido getVestido() {
        return vestido;
    }

    public void setVestido(Vestido vestido) {
        this.vestido = vestido;
    }

    
}
