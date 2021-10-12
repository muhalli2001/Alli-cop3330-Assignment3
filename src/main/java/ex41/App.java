package ex41;


import java.io.*;
import java.util.*;


public class App {
    public static void main(String args[]) throws FileNotFoundException
    {
        ArrayList<String> names = new ArrayList<>();
        int count = 0;
        //file of input is created here:
        File input = new File("src/main/java/ex41/exercise41_input.txt");

        Scanner nl = new Scanner(input);
        String name = null;
        while(nl.hasNextLine())
        {
            name = nl.nextLine();
            names.add(name);
            System.out.println(name);
            count++;
        }

        System.out.println("counter: "+count);
        Collections.sort(names);
        System.out.println(names.get(0));

        try {
            File myObj = new File("src/main/java/ex41/exercise41_output.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        try
        {
            FileWriter myWriter = new FileWriter("src/main/java/ex41/exercise41_output.txt");

            myWriter.write("Total names: "+count);
            myWriter.write("\n----------\n");
            for(int i=0; i<names.size();i++)
            {
                myWriter.write(names.get(i));
                myWriter.write("\n");
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
}
