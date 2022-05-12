package Controller;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.*;

public class JSONController {

    String jsonString = "{\n" +
            "  \"nombre\": \"Borja\",\n" +
            "  \"apellidos\": \"Martin Herrera\",\n" +
            "  \"edad\": 38,\n" +
            "  \"hobbies\": [\n" +
            "    \"mmusica\",\n" +
            "    \"deporte\",\n" +
            "    \"cine\",\n" +
            "    \"informatica\"\n" +
            "  ],\n" +
            "  \"conocimientos\": [\n" +
            "    {\n" +
            "      \"concepto\": \"programacion\",\n" +
            "      \"experiencia\": 12,\n" +
            "      \"detalle\": [\n" +
            "        \"java\",\n" +
            "        \"html\",\n" +
            "        \"css\",\n" +
            "        \"javascript\",\n" +
            "        \"mysql\",\n" +
            "        \"powershell\"\n" +
            "      ]\n" +
            "    },\n" +
            "    {\n" +
            "      \"concepto\": \"3D\",\n" +
            "      \"experiencia\": 4,\n" +
            "      \"detalle\": [\n" +
            "        \"Maya\",\n" +
            "        \"3Dmax\",\n" +
            "        \"Blender\",\n" +
            "        \"Unity\"\n" +
            "      ]\n" +
            "    }\n" +
            "  ]\n" +
            "}";

    String jsonAsignaruras = "{\n" +
            "  \"asignaturas\": [\n" +
            "    [\n" +
            "      {\n" +
            "        \"siglas\": \"PMDM\",\n" +
            "        \"nombre\": \"Programación Multimedia\",\n" +
            "        \"profesor\": { \"nombre\": \"Borja\", \"Apellido\": \"Martin\" },\n" +
            "        \"hora\": 4,\n" +
            "        \"ciclo\": \"dam\",\n" +
            "        \"curso\": 2,\n" +
            "        \"conocimientos\": [\"java\", \"android\", \"kotlin\"]\n" +
            "      },\n" +
            "      {\n" +
            "        \"siglas\": \"DI\",\n" +
            "        \"nombre\": \"Desarrollo de Interfaces\",\n" +
            "        \"profesor\": { \"nombre\": \"Borja\", \"Apellido\": \"Martin\" },\n" +
            "        \"hora\": 6,\n" +
            "        \"ciclo\": \"dam\",\n" +
            "        \"curso\": 2,\n" +
            "        \"conocimientos\": [\"javafx\", \"ts\", \"angular\"]\n" +
            "      },\n" +
            "      {\n" +
            "        \"siglas\": \"AD\",\n" +
            "        \"nombre\": \"Acceso a Datos\",\n" +
            "        \"profesor\": { \"nombre\": \"Ruben\", \"Apellido\": \"Juarez\" },\n" +
            "        \"hora\": 6,\n" +
            "        \"ciclo\": \"dam\",\n" +
            "        \"curso\": 2,\n" +
            "        \"conocimientos\": [\"java\", \"heroky\"]\n" +
            "      },\n" +
            "      {\n" +
            "        \"siglas\": \"PSP\",\n" +
            "        \"nombre\": \"Programación Servicios y Procesos\",\n" +
            "        \"profesor\": { \"nombre\": \"Jesús\", \"Apellido\": \"Niño\" },\n" +
            "        \"hora\": 4,\n" +
            "        \"ciclo\": \"dam\",\n" +
            "        \"curso\": 2,\n" +
            "        \"conocimientos\": [\"comunicaciones\", \"concurrencia\"]\n" +
            "      },\n" +
            "      {\n" +
            "        \"siglas\": \"SGE\",\n" +
            "        \"nombre\": \"Sisemas Gestión Empresarial\",\n" +
            "        \"profesor\": { \"nombre\": \"Eduardo\", \"Apellido\": \"Del Olmo\" },\n" +
            "        \"hora\": 5,\n" +
            "        \"ciclo\": \"dam\",\n" +
            "        \"curso\": 2,\n" +
            "        \"conocimientos\": [\"CRM\", \"ERP\"]\n" +
            "      },\n" +
            "      {\n" +
            "        \"siglas\": \"ING\",\n" +
            "        \"nombre\": \"Inglés\",\n" +
            "        \"profesor\": { \"nombre\": \"Rocio\", \"Apellido\": \"Pizarro\" },\n" +
            "        \"hora\": 2,\n" +
            "        \"ciclo\": \"dam|daw\",\n" +
            "        \"curso\": 2,\n" +
            "        \"conocimientos\": [\"Idioma\"]\n" +
            "      },\n" +
            "      {\n" +
            "        \"siglas\": \"EIE\",\n" +
            "        \"nombre\": \"Empresa e iniciativa emprendedora\",\n" +
            "        \"profesor\": { \"nombre\": \"Marta\", \"Apellido\": \"Valdeita\" },\n" +
            "        \"hora\": 3,\n" +
            "        \"ciclo\": \"dam|daw\",\n" +
            "        \"curso\": 2,\n" +
            "        \"conocimientos\": [\"Emprendimiento\", \"Empresas\"]\n" +
            "      },\n" +
            "      {\n" +
            "        \"siglas\": \"PRO\",\n" +
            "        \"nombre\": \"Programación\",\n" +
            "        \"profesor\": { \"nombre\": \"Borja\", \"Apellido\": \"Martin\" },\n" +
            "        \"hora\": 8,\n" +
            "        \"ciclo\": \"dam\",\n" +
            "        \"curso\": 1,\n" +
            "        \"conocimientos\": [\"java\", \"poo\"]\n" +
            "      },\n" +
            "      {\n" +
            "        \"siglas\": \"BD\",\n" +
            "        \"nombre\": \"Base de datos\",\n" +
            "        \"profesor\": { \"nombre\": \"Edaurdo\", \"Apellido\": \"Del Olmo\" },\n" +
            "        \"hora\": 6,\n" +
            "        \"ciclo\": \"dam|daw\",\n" +
            "        \"curso\": 1,\n" +
            "        \"conocimientos\": [\"sql\", \"mysql\", \"normalizacion\"]\n" +
            "      },\n" +
            "      {\n" +
            "        \"siglas\": \"XML\",\n" +
            "        \"nombre\": \"Lenguaje de Marcas\",\n" +
            "        \"profesor\": { \"nombre\": \"Eduardo\", \"Apellido\": \"Del Olmo\" },\n" +
            "        \"hora\": 5,\n" +
            "        \"ciclo\": \"dam|daw\",\n" +
            "        \"curso\": 1,\n" +
            "        \"conocimientos\": [\"css\", \"html\", \"xml\", \"php\"]\n" +
            "      },\n" +
            "      {\n" +
            "        \"siglas\": \"ED\",\n" +
            "        \"nombre\": \"Entornos de Desarrollo\",\n" +
            "        \"profesor\": { \"nombre\": \"Jesús\", \"Apellido\": \"Niño\" },\n" +
            "        \"hora\": 3,\n" +
            "        \"ciclo\": \"dam|daw\",\n" +
            "        \"curso\": 1,\n" +
            "        \"conocimientos\": [\"scrum\", \"metodologias\"]\n" +
            "      },\n" +
            "      {\n" +
            "        \"siglas\": \"DAWC\",\n" +
            "        \"nombre\": \"Desarrollo aplicaciones web cliente\",\n" +
            "        \"profesor\": { \"nombre\": \"Borja\", \"Apellido\": \"Martin\" },\n" +
            "        \"hora\": 6,\n" +
            "        \"ciclo\": \"daw\",\n" +
            "        \"curso\": 2,\n" +
            "        \"conocimientos\": [\"javascript\", \"react\", \"react native\"]\n" +
            "      },\n" +
            "      {\n" +
            "        \"siglas\": \"DWES\",\n" +
            "        \"nombre\": \"Desarrollo apliaciones web servidor\",\n" +
            "        \"profesor\": { \"nombre\": \"David\", \"Apellido\": \"Ventura\" },\n" +
            "        \"hora\": 9,\n" +
            "        \"ciclo\": \"daw\",\n" +
            "        \"curso\": 2,\n" +
            "        \"conocimientos\": [\"php\", \"python\"]\n" +
            "      },\n" +
            "      {\n" +
            "        \"siglas\": \"DAW\",\n" +
            "        \"nombre\": \"Despliegue aplicaciones web\",\n" +
            "        \"profesor\": { \"nombre\": \"Jesús\", \"Apellido\": \"Niño\" },\n" +
            "        \"hora\": 4,\n" +
            "        \"ciclo\": \"daw\",\n" +
            "        \"curso\": 2,\n" +
            "        \"conocimientos\": [\"tomcat\", \"wordpress\"]\n" +
            "      },\n" +
            "      {\n" +
            "        \"siglas\": \"DI\",\n" +
            "        \"nombre\": \"Diseño de interfaces\",\n" +
            "        \"profesor\": { \"nombre\": \"Victor\", \"Apellido\": \"Martinez\" },\n" +
            "        \"hora\": 6,\n" +
            "        \"ciclo\": \"dam\",\n" +
            "        \"curso\": 2,\n" +
            "        \"conocimientos\": [\"css\", \"bootstrap\"]\n" +
            "      },\n" +
            "      {\n" +
            "        \"siglas\": \"FCTs\",\n" +
            "        \"nombre\": \"Formación en centros de trabajo\",\n" +
            "        \"profesor\": { \"nombre\": \"\", \"Apellido\": \"\" },\n" +
            "        \"hora\": 370,\n" +
            "        \"ciclo\": \"dam|daw\",\n" +
            "        \"curso\": 2,\n" +
            "        \"conocimientos\": [\"trabajo en empresa\"]\n" +
            "      },\n" +
            "      {\n" +
            "        \"siglas\": \"PROY\",\n" +
            "        \"nombre\": \"Proyecto\",\n" +
            "        \"profesor\": { \"nombre\": \"\", \"Apellido\": \"\" },\n" +
            "        \"hora\": 30,\n" +
            "        \"ciclo\": \"dam|daw\",\n" +
            "        \"curso\": 2,\n" +
            "        \"conocimientos\": [\"trabajo personal\"]\n" +
            "      }\n" +
            "    ]\n" +
            "  ]\n" +
            "}";

    public void pasarStringJson() {
        // STRING --> JSON (org.json)
        JSONObject jsonObject = new JSONObject(jsonString);
        // System.out.println(jsonObject);
        String nombre = jsonObject.getString("nombre");
        int edad = jsonObject.getInt("edad");
        JSONArray jsonArray = new JSONArray(jsonObject.getJSONArray("hobbies"));
        System.out.println(nombre);
        System.out.println(edad);
        System.out.println("Tus hobbies son: ");
        for (int i = 0; i < jsonArray.length(); i++) {
            System.out.println(jsonArray.getString(i));
        }
    }

    public void leerFicheroJSON() {
        File file = new File("src/main/resources/persona.json");
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader(file));
            // br.readLine() --> linea completa
            String linea = null;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void leerJSONAsignturas(){

        File file = new File("src/main/resources/asignaturas.json");
        BufferedReader bufferedReader = null;

        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            StringBuffer buffer = new StringBuffer();
            String linea = null;
            while ((linea = bufferedReader.readLine())!=null){
                buffer.append(linea);
            }

            JSONObject jsonAsignaturas = new JSONObject(buffer.toString());
            JSONArray asignaturas = jsonAsignaturas.getJSONArray("asignaturas");
            // Captura todas las asignaturas individuales y tener la posibilidad de
            // tratarlas como objetos JAVA
            // y ver su curso y su ciclo
            System.out.println(asignaturas);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public void objetosJava(){

        File file = new File("src/main/resources/asignaturas.json");
        BufferedReader bufferedReader = null;

    }
}

