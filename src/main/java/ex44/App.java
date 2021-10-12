package ex44;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.JsonParser;
import com.google.gson.stream.JsonReader;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;


import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.io.*;
import java.util.Scanner;


public class App {

    public static void main(String args[]) throws FileNotFoundException {

        //product[] Input = new product[100];
        //Gson gson = new Gson();
        //JsonReader jElement = null;

        //product[] product = gson.fromJson(jElement, product[].class);
        //product[] arr = gson.fromJson(str, product[].class)
        //JsonReader reader = new JsonReader("src/java/ex44/exercise44_input.json");
        String path = "src/main/java/ex44/exercise44_input.json";
        StringBuilder jsonfile = new StringBuilder();
        File aye = new File(path);
        //BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        Scanner s = new Scanner(aye);
        while(s.hasNextLine())
        {
            jsonfile.append(s.nextLine());
        }
        System.out.println(jsonfile);
        Gson gson = new Gson();
        product json = gson.fromJson(jsonfile.toString(), product.class);

        System.out.println(json.getClass());
        //System.out.println(json.toString());


    }




}
