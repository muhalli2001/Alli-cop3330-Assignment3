package ex46;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    public static String wordsToStars(int val)
    {
        String star = "";
        for(int i=0;i<val;i++)
        {
            star = star + "*";
        }
        return star;
    }
    @org.junit.jupiter.api.Test
    void wordsToStars() {
        String a = wordsToStars(7);
        assertEquals("*******", a);
    }
}