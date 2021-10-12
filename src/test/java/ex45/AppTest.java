package ex45;
import java.util.*;
import java.io.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    public static String filepath()
    {
        //normally it is user input, which gets taken into filep BUT I could not figure out how to test with user input
        Scanner s = new Scanner(System.in);
        System.out.println("What should the file be named?");

        String filep =  "yes";
        filep = "src/main/java/ex45/" + filep;
        return filep;
    }

    @Test
    void filepathh() {

        String str = filepath();
        assertEquals("src/main/java/ex45/yes", str);

    }
}