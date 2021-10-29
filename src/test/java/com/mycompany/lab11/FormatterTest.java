
package com.mycompany.lab11;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class FormatterTest {
    
    
    @Test
    public void testFormat1() throws Exception {
        Formatter formatTest = new Formatter();
        File fileIn = new File("tempIn.txt");
        List<String> resultList =  new ArrayList<>();        
        FileWriter writer = new FileWriter (fileIn);
        writer.write(" Hello    World   \n");
        writer.write(" This   Is  SE2 \n");
        writer.close();
        formatTest.format("tempIn.txt","tempOut.txt");
        File result = new File("tempOut.txt");
        Scanner sc = new Scanner(result);
        while (sc.hasNextLine())
        {
            String line = sc.nextLine();
            resultList.add(line);
        }
        sc.close();
        assertEquals("Hello World",resultList.get(0));
        assertEquals("This Is SE2",resultList.get(1));
        fileIn.deleteOnExit();
        result.deleteOnExit();
    }
    
    @Test
    public void testFormat2() throws Exception {
        Formatter formatTest = new Formatter();
        File fileIn = new File("tempIn.txt");
        List<String> resultList =  new ArrayList<>();        
        FileWriter writer = new FileWriter (fileIn);
        writer.write("     This          Is     a Test \n");
        writer.write("The     Spaces      Are       Deleted  \n");
        writer.close();
        formatTest.format("tempIn.txt","tempOut.txt");
        File result = new File("tempOut.txt");
        Scanner sc = new Scanner(result);
        while (sc.hasNextLine())
        {
            String line = sc.nextLine();
            resultList.add(line);
        }
        sc.close();
        assertEquals("This Is a Test",resultList.get(0));
        assertEquals("The Spaces Are Deleted",resultList.get(1));
        fileIn.deleteOnExit();
        result.deleteOnExit();
    }
    
}
