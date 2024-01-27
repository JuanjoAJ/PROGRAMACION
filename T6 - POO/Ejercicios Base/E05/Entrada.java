package E05;

import java.util.Scanner;

/*Modifica el ejercicio anterior para que el IMC se pueda calcular según el genero de la persona(se hará sobre este ejercicio). En este caso, para poder calcular el IMC según genero se utilizan las siguientes tablas
 * https://four-crime-470.notion.site/image/https%3A%2F%2Fprod-files-secure.s3.us-west-2.amazonaws.com%2Fa1b5de7d-8841-421f-9e16-ba5b8d08c091%2F9cabb336-62aa-4f40-b494-94e0aac50b6f%2FUntitled.png?table=block&id=4e4b73ba-d210-40dd-ad55-8c241b43c949&spaceId=a1b5de7d-8841-421f-9e16-ba5b8d08c091&width=1670&userId=&cache=v2*/
public class Entrada {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca nombre, apellido, dni, edad, altura y peso de una persona");
        Persona[] personas = new Persona[3];
        personas[0] = new Persona(scanner.next(), scanner.next(), scanner.next(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        System.out.println("Indique m para mujer y h para hombre");
        personas[0].setSexo(scanner.next().toLowerCase().charAt(0));
        personas[0].imprimirIMC(personas[0].calculaIMC(), personas[0].getSexo());
    }
}

