package ex43;

import java.util.*;
import java.io.*;

public class App
{
    public static void main(String args[])
    {
        String SiteName, Author, y_n;
        Scanner scan = new Scanner(System.in);

        System.out.println("Site Name: ");
        SiteName = scan.nextLine();
        if(!SiteName.equals(""))
        {
            createWebsiteFolder();
            createNameFolder(SiteName);


            System.out.println("\nAuthor: ");
            Author = scan.nextLine();
            if(!Author.equals(""))
            {
                System.out.println("\nDo you want a folder for javascript?");
                y_n = scan.nextLine();
                if(y_n.equals("y")|y_n.equals("Y")){createJs_Css_Folder("js",SiteName);}
                System.out.println("\nDo you want a folder for css?");
                y_n = scan.nextLine();
                if(y_n.equals("y")|y_n.equals("Y")){createJs_Css_Folder("css",SiteName);}
                //Write HTML Index file
                File f = null;

                try {
                    // returns pathnames for files and directory
                    File file = new File("src/main/java/ex43/website"+ "//" +SiteName+ "//" + "index.html");
                    if(file.createNewFile()){System.out.println("file created");}
                } catch(Exception e) {
                    // if any error occurs
                    e.printStackTrace();
                }
            }

        }
        else{System.out.printf("enter a valid name");}


    }

    public static void createJs_Css_Folder(String type,String SiteName)
    {
        File f = null;
        boolean bool = false;

        try {
            // returns pathnames for files and directory
            f = new File("src/main/java/ex43/website"+ "//" +SiteName+ "//" + type);

            // create
            bool = f.mkdir();

            // print
            System.out.print("\nDirectory created? "+bool);
            if(!bool){System.out.println("\nFolder exists with given name or no characters were detected in scan.");}

        } catch(Exception e) {
            // if any error occurs
            e.printStackTrace();
        }
    }
    public static void createNameFolder(String SiteName)
    {
        File f = null;
        boolean bool = false;

        try {
            // returns pathnames for files and directory
            f = new File("src/main/java/ex43/website" + "//" + SiteName);

            // create
            bool = f.mkdir();

            // print
            System.out.print("\nDirectory created? "+bool);
            if(!bool){System.out.println("\nFolder exists with given name or no characters were detected in scan.");}

        } catch(Exception e) {
            // if any error occurs
            e.printStackTrace();
        }


    }
    public static void createWebsiteFolder()
    {
        File f = null;
        boolean bool = false;

        try {
            // returns pathnames for files and directory
            f = new File("src/main/java/ex43/website");

            // create
            bool = f.mkdir();

            // print
            System.out.print("\nDirectory created? "+bool);
            if(!bool){System.out.println("\nFolder exists with given name");}

        } catch(Exception e) {
            // if any error occurs
            e.printStackTrace();
        }
    }
}
