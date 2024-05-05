import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

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
                String lastName = usuario.getString("firstName");
                int age = usuario.getInt("firstName");
                System.out.println(firstName +" " + lastName + " " + age);
            }


        } catch (MalformedURLException e) {
            System.out.println("Error en la codificación de la URL");
        } catch (IOException e) {
            System.out.println("Error de internet");
        }
    }
}
