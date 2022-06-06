package controller;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;


public class FicherosController {

    // ArrayList<Resultados> listaResultados;

    public void leerFicheroJSON(){

       String urlString = "https://run.mocky.io/v3/f608b6c0-260b-4600-a929-be12fac14261";

        try {
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection)url.openConnection();

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

            StringBuffer stringBuffer = new StringBuffer();

            String linea = null;

            while ((linea=bufferedReader.readLine())!=null){
                    stringBuffer.append(linea);
            }

            String response = stringBuffer.toString();
            JSONObject responseJSON = new JSONObject(response);
            JSONArray arrayResultados = responseJSON.getJSONArray("results");

            for (int i = 0; i < arrayResultados.length(); i++) {
                JSONObject objetoResultado = arrayResultados.getJSONObject(i);
                String id = objetoResultado.getString("_id");
                String company = objetoResultado.getString("company");
                String phone = objetoResultado.getString("phone");
                String pais = objetoResultado.getString("country");
                int total = objetoResultado.getInt("invoice");
                System.out.println(id + "\n" + company +"\n" + phone + "\n"  + pais + "\n"  + total);
            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
