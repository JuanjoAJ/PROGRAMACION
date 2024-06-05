import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
/*- Lee el fichero y conviertelo en un objeto de tipo Json con la librería correspondiente
- Muestra por pantalla todos los datos de los alumnos uno a uno
- Muestra por pantalla solo los alumnos que tengan al menos 20 años
*/

public class Entrada {
    //Objeto de tipo URL -> https://dummyjson.com/users
    //HTTPURLConnection -> abrir la url
    // BufferedReader -> Leer la contestación de la pagina -> TXT
    //Pasar el texto a JSON

    public static void main(String[] args) {
        BufferedReader br=null;
        try {
            URL url =new URL("https://dummyjson.com/users");
            HttpURLConnection connection=(HttpURLConnection) url.openConnection();
            br=new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String lectura =br.readLine();
            JSONObject respuesta=new JSONObject(lectura);
            JSONArray usuarios=respuesta.getJSONArray("users");
            System.out.println(respuesta);
            for (int i = 0; i < usuarios.length(); i++) {
                JSONObject usuario=usuarios.getJSONObject(i);
                String firstName = usuario.getString("firstName");
                String lastName = usuario.getString("lastName");
                int age = usuario.getInt("age");
                System.out.println(firstName +" " + lastName + " " + age);

            }
            System.out.println("\t \u001B[32m ------------------------------------------------- \u001B[0m");
            System.out.println("Los usuarios con al menos 20 años son: ");
            for (Object item:usuarios) {
                if(item instanceof JSONObject){
                    if(((JSONObject) item).getInt("age")>=20){
                        System.out.println(((JSONObject) item).getString("firstName") +" "
                                + ((JSONObject) item).getString("lastName"));
                    }
                }
            }
        } catch (MalformedURLException e) {
            System.out.println("Error en la codificación de la URL");
        } catch (IOException e) {
            System.out.println("Error de internet");
        }
    }
}
