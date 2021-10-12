package ex46;

import java.io.*;
import java.util.*;

public class App {

    public static void main(String args[]) throws FileNotFoundException {


        TreeMap<String,Integer> words = new TreeMap<String,Integer>();

        String pathname = "src/main/java/ex46/exericse46_input.txt";

        Scanner sc = new Scanner(new File(pathname));


        while(sc.hasNext())
        {
            String temp=sc.next();

            if(words.containsKey(temp))
            {
                words.put(temp,words.get(temp)+1);
            }

            else
            {
                words.put(temp , 1);
            }

        }


        System.out.println(words);

        for (Map.Entry<String, Integer> entry : words.entrySet()) {

            String key = entry.getKey();

            int value = entry.getValue();

            String starvalue = wordsToStars(value);

            System.out.printf("%s : %s\n", key, starvalue);
        }


    }

    public static String wordsToStars(int val)
    {
        String star = "";
        for(int i=0;i<val;i++)
        {
            star = star + "*";
        }
        return star;
    }


}
