import com.google.gson.Gson;
import model.Name;
import netscape.javascript.JSObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;
import org.json.JSONObject;
import org.json.JSONArray;

public class FileController {

    public void pedirDatos(){

        Scanner scanner = new Scanner(System.in);
        int users = 0;
        String genero = "";
        String respuesta = "";
        System.out.println("Introduzca el numero de usuarios a generar");
        users = scanner.nextInt();
        String urlString = "htpps://randomuser.me/api/?results=" + users;
        URL url = null;
        try {
            url = new URL(urlString);
            try {
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                BufferedReader bufferedReader;
                bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                StringBuffer stringBuffer = new StringBuffer();
                String linea = null;

                while((linea = bufferedReader.readLine())!=null){
                    stringBuffer.append(linea);
                }

                String response = stringBuffer.toString();
                JSONObject responseJSON = new JSONObject(response);
                JSONArray arrayResultados = responseJSON.getJSONArray("results");
                for (int i = 0; i < arrayResultados.length(); i++) {
                    JSONObject objetoResultados = arrayResultados.getJSONObject(i);
                    System.out.println(objetoResultados);
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        System.out.println("Género: M(masculino), F(femenino) o A(ambos)");
        genero = scanner.next();
        System.out.println("Quieres volcar los datos en un fichero? S/N");
        respuesta = scanner.next();
    }

    public void lecturaUsers(){
        int users = 0;
        String genero = "", respuesta = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cuantos usuarios quieres generar");
        users = scanner.nextInt();
        System.out.println("Indique el genero deaseado: F(femenino), M(masculino), A(ambos)");
        genero = scanner.next();
        System.out.println("Quiere volcar los datos en un fichero? S/N");
        respuesta = scanner.next();
        String urlString = "https://randomuser.me/api/?results=" + users;
        try {
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            //File file;
            //FileReader fileReader;
            BufferedReader bufferedReader;

            bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
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
                //System.out.println(objetoResultado);
                String mail = objetoResultado.getString("email");
                JSONObject nombres = arrayResultados.getJSONObject(i).getJSONObject("name");
                System.out.println(nombres.getString("title"));
                System.out.println(nombres.getString("first"));
                System.out.println(nombres.getString("last"));

                System.out.println(mail);
                System.out.println("\n");
            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
