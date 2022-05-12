import com.google.gson.Gson;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;

public class JsonController {

    public void verPeliculasCartelera() {
        String urlString = "https://api.themoviedb.org/3/movie/now_playing?api_key=4ef66e12cddbb8fe9d4fd03ac9632f6e&language=en-US&";

        BufferedReader reader = null;
        try {
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder stringBuffer = new StringBuilder();
            String linea = null;

            while ((linea = reader.readLine()) != null) {
                stringBuffer.append(linea);
            }

            JSONObject jsonObject = new JSONObject(stringBuffer.toString());

            JSONArray arreyResultados = jsonObject.getJSONArray("results");
            for (int i = 0; i < arreyResultados.length(); i++) {
                JSONObject objetoResultado = arreyResultados.getJSONObject(i);
                String title = objetoResultado.getString("original_title");
                String description = objetoResultado.getString("overview");
                String date = objetoResultado.getString("release_date");
                String poster = objetoResultado.getString("poster_path");
                System.out.println("Titulo: " + title);
                System.out.println("Fecha: " + date);
                System.out.println("Descripcion: " + description);
                System.out.println("Poster: " + "https://image.tmdb.org/t/p/w500/" + poster + "\n");

                Gson gson = new Gson();
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public void verPeliculasProximamente() {
        String urlString = "https://api.themoviedb.org/3/movie/upcoming?api_key=4ef66e12cddbb8fe9d4fd03ac9632f6e&language=en-US&page=1";

        BufferedReader reader = null;
        try {
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder stringBuffer = new StringBuilder();
            String linea = null;

            while ((linea = reader.readLine()) != null) {
                stringBuffer.append(linea);
            }

            JSONObject jsonObject = new JSONObject(stringBuffer.toString());

            JSONArray arreyResultados = jsonObject.getJSONArray("results");
            for (int i = 0; i < arreyResultados.length(); i++) {
                JSONObject objetoResultado = arreyResultados.getJSONObject(i);
                String title = objetoResultado.getString("original_title");
                String description = objetoResultado.getString("overview");
                String date = objetoResultado.getString("release_date");
                String poster = objetoResultado.getString("poster_path");
                System.out.println("Titulo: " + title);
                System.out.println("Fecha: " + date);
                System.out.println("Descripcion: " + description);
                System.out.println("Poster: " + "https://image.tmdb.org/t/p/w500/" + poster + "\n");

                Gson gson = new Gson();
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public void guardarPeliculas() {
        String urlString = "https://api.themoviedb.org/3/movie/upcoming?api_key=4ef66e12cddbb8fe9d4fd03ac9632f6e&language=en-US&page=1";

        BufferedReader reader = null;
        try {
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder stringBuffer = new StringBuilder();
            String linea = null;

            while (true) {
                try {
                    if (!((linea = reader.readLine()) != null))
                        break;
                } catch (IOException e) {
                    e.printStackTrace();
                }
                stringBuffer.append(linea);
            }

            JSONObject jsonObject = new JSONObject(stringBuffer.toString());

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}