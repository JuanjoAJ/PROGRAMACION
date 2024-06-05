package modelGenericosComparable;

public final class UsuarioGenerico implements Comparable  {
    private String nombre, apellido, correo;
    private int edad;


    public UsuarioGenerico() {
    }

    public UsuarioGenerico(String nombre, String apellido, String correo, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.edad = edad;
    }

    @Override
    public int compareTo(Object user) {
        if(user instanceof UsuarioGenerico) {
            if (((UsuarioGenerico) user).getEdad() > edad) return -1;
            else if (edad > ((UsuarioGenerico) user).getEdad()) return 1;
            else return 0;
        }else {
            throw new IllegalArgumentException("Debe introducir un Usuario");
        }
    }

    @Override
    public String toString() {
        return "UsuarioGenerico{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", correo='" + correo + '\'' +
                ", edad=" + edad +
                '}';
    }

    public void mostrarDatos(){
        System.out.println("nombre = " + nombre);
        System.out.println("apellido = " + apellido);
        System.out.println("correo = " + correo);
        System.out.println("edad = " + edad);
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
