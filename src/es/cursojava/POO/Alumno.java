package es.cursojava.POO;

//POJO 
public class Alumno {
    private String nombre;
    private String apellido;
    private int edad;
    private double notaMedia;
    private String email;
    private String[] asignaturas;
    
    //Constructor por defecto
    public Alumno() {
        
    }

    //Constructor A
    public Alumno(String nombre, String apellido, int edad, double notaMedia, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.notaMedia = notaMedia;
        this.email = email;
    }

    //Constructor B
    public Alumno(String nombre, String apellido, int edad, double notaMedia, String email, String[] asignaturas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.notaMedia = notaMedia;
        this.email = email;
        this.asignaturas = asignaturas;
    }

    //Método estudiar
    public void estudiar() {
        if (this.notaMedia == 0) {
            System.out.println("El alumno " + nombre + " " + apellido + " no estudia nada.");
        } else if (this.notaMedia < 5) {
            System.out.println("El alumno " + nombre + " " + apellido + " estudia muy poco.");
        } else if (this.notaMedia < 7) {
            System.out.println("El alumno " + nombre + " " + apellido + " es buen estudiante.");
        } else if (this.notaMedia < 10) {
            System.out.println("El alumno " + nombre + " " + apellido + " es muy buen estudiante.");
        } else if (this.notaMedia == 10) {
            System.out.println("El alumno " + nombre + " " + apellido + " es un genio.");
        } else {
            System.out.println("Nota Media incorrecta.");
        }
    }

    //Getters y Setters de nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Getters y Setters de apellido
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    //Getters y Setters de edad
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    //Getters y Setters de notaMedia
    public double getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }

    //Getters y Setters de email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //Getters y Setters de asignaturas
    public String[] getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(String[] asignaturas) {
        this.asignaturas = asignaturas;
    }

}
