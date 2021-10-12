package ex42;

import java.util.*;
import java.io.*;



public class App {

    public static void main(String args[]) {

        Employee [] Input = new Employee[100];
        System.out.printf("%10s %10s %10s\n", "Last", "First", "Salary");
        System.out.println("----------------------------------------");
        Input = ReadEmployeeList("src/main/java/ex42/exercise42_input.txt",Input);
        int i=0;
        while(Input[i]!=null)
        {
            System.out.printf("%10s %10s %10s\n", Input[i].First, Input[i].Last, Input[i].Salary);
            i++;
        }

    }

    public static Employee[] ReadEmployeeList(String filepath, Employee[] a){
        int i=0;
        try {
            File file = new File(filepath);
            Scanner scanIn = new Scanner(file);

            while (scanIn.hasNext()) {
                String s = scanIn.nextLine();
                String[] temp = s.split(",");

                a[i] = new Employee();
                a[i].First = temp[0];
                a[i].Last = temp[1];
                a[i].Salary = temp[2];
                i++;
            }

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();

        }
        return a;
    }
}
