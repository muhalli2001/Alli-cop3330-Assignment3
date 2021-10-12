package ex45;

import java.util.*;
import java.io.*;

public class App {

    public static void main(String args[]) throws FileNotFoundException {

        Scanner s = new Scanner(new File("src/main/java/ex45/exercise45_input.txt"));
        ArrayList<String> list = new ArrayList<String>();
        while (s.hasNext()){
            list.add(s.next());
        }
        s.close();

        for(int i=0; i<list.size();i++)
        {
            if(list.get(i).equals("utilize")||list.get(i).equals("utilizes"))
            {
                list.set(i,"use");
            }
            if(list.get(i).equals("\"utilize\"")||list.get(i).equals("\"utilizes\""))
            {
                list.set(i,"\"use\"");
            }
        }
        String thefilepath = filepath();
        try
        {
            FileWriter myWriter = new FileWriter(thefilepath);

            for(int i=0; i<list.size();i++)
            {
                myWriter.write(list.get(i)+" ");

            }


            myWriter.close();

            System.out.println("Successfully wrote to the file.");
        }
        catch (IOException e)
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
    public static String filepath()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("What should the file be named?");

        String filepath =  s.nextLine();
        filepath = "src/main/java/ex45/" + filepath;
        return filepath;
    }



}
