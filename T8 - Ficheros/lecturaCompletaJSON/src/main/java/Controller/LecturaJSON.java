package Controller;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class LecturaJSON {

    public void lecturaCompleta(){
        BufferedReader bufferedReader=null;
        try {
            URL url=new URL("https://api.spacexdata.com/v3/history");
            HttpURLConnection httpURLConnection= (HttpURLConnection) url.openConnection();
            bufferedReader=new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
            String lectura = bufferedReader.readLine();
            JSONArray respuesta=new JSONArray(lectura);
            for (int i = 0; i < respuesta.length(); i++) {
                JSONObject mision=respuesta.getJSONObject(i);
                String titulo= mision.getString("title");
                String detalle= mision.getString("details");
                JSONObject links=mision.getJSONObject("links");
                String articulo= links.getString("article");
                System.out.println(titulo + "\n" + detalle + " \n" + articulo);
                System.out.println("-------------------------------------------------------------------------------");
            }
        } catch (MalformedURLException e) {
            System.out.println("Error en la codificación de la URL");
        } catch (IOException e) {
            System.out.println("Error de internet");
        }finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                System.out.println("Error en cierre");
            }
        }
    }

    public void lecturaUnica(int numVuelo){
        BufferedReader bufferedReader=null;
        boolean estaVuelo=false;


        try {
            URL url=new URL("https://api.spacexdata.com/v3/history");
            HttpURLConnection conection= (HttpURLConnection) url.openConnection();
            bufferedReader=new BufferedReader(new InputStreamReader(conection.getInputStream()));
            String lectura= bufferedReader.readLine();
            JSONArray jsonArray=new JSONArray(lectura);
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject vuelo=jsonArray.getJSONObject(i);
                Object num= vuelo.get("flight_number");
                int flightNum=0;

                if (num instanceof Integer) {
                     flightNum = (int) num;
                    if(flightNum==numVuelo){
                        System.out.println(vuelo.getString("title") + "\n" + vuelo.getString("details"));
                        System.out.println("-------------------------------------------------------------------------------");
                        estaVuelo=true;
                    }
                }
            }
            if (!estaVuelo) System.out.println("El vuelo no se encuentra incluido");
        } catch (MalformedURLException e) {
            System.out.println("Error en la codificación de la URL");
        } catch (IOException e) {
            System.out.println("Fallo de internet");
        }finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                System.out.println("Error en cierre");
            }
        }
    }
}
