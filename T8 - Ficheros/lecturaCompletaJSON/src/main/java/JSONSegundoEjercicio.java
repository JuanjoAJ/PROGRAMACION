import Controller.LecturaJSON;
import netscape.javascript.JSObject;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

/*- Lee el fichero y conviértelo en un objeto de tipo Json con la librería correspondiente
- Muestra el título, detalle y articulo relacionado en cada una de las misiones
- Crea método que pida por parámetros un int y que muestre la misión correspondiente a dicho número (flight number)*/
public class JSONSegundoEjercicio {
    public static void main(String[] args) {
        LecturaJSON lecturaJSON=new LecturaJSON();
        Scanner scanner=new Scanner(System.in);
        int opcion;

        System.out.println("""
                Elige entre:
                1. Ver todas las misiones
                2. Ver una misión en concreto""");
        opcion= scanner.nextInt();
        if (opcion==1){
            lecturaJSON.lecturaCompleta();
        } else if (opcion==2) {
            System.out.println("Introduce el número de vuelo");
            lecturaJSON.lecturaUnica(scanner.nextInt());
        }else {
            System.out.println("Opción no contemplada");
        }


    }

}
