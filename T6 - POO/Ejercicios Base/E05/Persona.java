package E05;

public class Persona {

    private String nombre, apellido, dni;
    private int edad, altura;
    private double peso;
    private char sexo;


    // Constructores
    public Persona() {
        dni = "111111111X";
    }

    public Persona(String nombre, String apellido) {

        this.nombre = nombre;
        this.apellido = apellido;
        dni = "111111111X";
    }

    public Persona(String nombre, String apellido, String dni, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
    }

    public Persona(String nombre, String apellido, String dni, int edad, int altura, double peso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
    }

    //Metodos

    public void mostrarDatos() {

        System.out.printf("Los datos del usuario son los siguientes: %s %s, con un dni de %s y una edad de %d tiene una altura de %d y un peso de %.2f", nombre, apellido, dni, edad, altura, peso);
        System.out.println();

    }

    public int incrementoEdad(int incremento) {
        this.edad += incremento;
        return this.edad;
    }

    public double calculaIMC() {
        double IMC;
        if (this.peso == 0 || this.altura == 0) {
            IMC = -1;
        } else {
            double alturaMetros = (double) this.altura / 100;
            IMC = this.peso / Math.pow(alturaMetros, 2);
        }
        return IMC;
    }

    public void imprimirIMC(double num, char sexo) {
        switch (sexo) {
            case 'm':
                if (num < 20 && num >= 0) {
                    System.out.printf("Tiene un IMC de %.2f, lo que equivale a un peso inferior al normal", num);
                } else if (num > 20.0 && num < 25) {
                    System.out.printf("Tiene un IMC de %.2f que equivale a un peso normal", num);
                } else if (num > 25.0 && num < 30.0) {
                    System.out.printf("Según su IMC (que es de %.2f), usted tiene un peso superior al normal", num);
                } else if (num > 30.0 && num < 40.0) {
                    System.out.printf("Según los estándares del IMC, un IMC de %.2f es catalogado como obesidad", num);
                } else if (num > 40.0) {
                    System.out.printf("Según los estándares del IMC, un IMC de %.2f es catalogado como obesidad mórbida", num);
                } else {
                    System.out.println("Perdone, no nos ha proporcionado los datos correctos");
                }

                break;
            case 'h':
                if (num < 20 && num >= 0) {
                    System.out.printf("Tiene un IMC de %.2f, lo que equivale a un peso inferior al normal", num);
                } else if (num > 20.0 && num < 27) {
                    System.out.printf("Tiene un IMC de %.2f que equivale a un peso normal", num);
                } else if (num > 27.0 && num < 30.0) {
                    System.out.printf("Según su IMC (que es de %.2f), usted tiene un peso superior al normal", num);
                } else if (num > 30.0 && num < 40.0) {
                    System.out.printf("Según los estándares del IMC, un IMC de %.2f es catalogado como obesidad", num);
                } else if (num > 40.0) {
                    System.out.printf("Según los estándares del IMC, un IMC de %.2f es catalogado como obesidad mórbida", num);
                } else {
                    System.out.println("Perdone, no nos ha proporcionado los datos correctos");
                }
                break;
            default:
                System.out.println("Uno o más datos introducidos no son correctos");


        }
    }

    // GETTER & SETTER

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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public char getSexo() {
        return sexo;
    }
}


