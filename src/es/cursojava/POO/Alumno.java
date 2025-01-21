package es.cursojava.POO;

public class Alumno {
    private String nombre;
    private String apellido;
    private String edad;
    private int notaMedia;
    private String email;
    private String[] asignaturas;
    
    //Constructor por defecto
    public Alumno() {
        
    }

    //Constructor A
    public Alumno(String nombre, String apellido, String edad, int notaMedia, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.notaMedia = notaMedia;
        this.email = email;
    }

    //Constructor B
    public Alumno(String nombre, String apellido, String edad, int notaMedia, String email, String[] asignaturas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.notaMedia = notaMedia;
        this.email = email;
        this.asignaturas = asignaturas;
    }

    //Método estudiar
    public void estudiar() {
        if (notaMedia == 0) {
            System.out.println("El alumno " + nombre + " " + apellido + " no estudia nada.");
        } else if (notaMedia < 5) {
            System.out.println("El alumno " + nombre + " " + apellido + " estudia muy poco.");
        } else if (notaMedia < 7) {
            System.out.println("El alumno " + nombre + " " + apellido + " es buen estudiante.");
        } else if (notaMedia < 10) {
            System.out.println("El alumno " + nombre + " " + apellido + " es muy buen estudiante.");
        } else if (notaMedia == 10) {
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
    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    //Getters y Setters de notaMedia
    public int getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(int notaMedia) {
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
