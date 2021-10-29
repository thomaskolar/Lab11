
package com.mycompany.lab11;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Formatter {
    
    private List<String> output = new ArrayList<>();
    
    public void format(String inFile,String outFile) throws IOException {
        try{
            File fileIn = new File(inFile);
            Scanner sc = new Scanner(fileIn);
            int count = 0;
            while (sc.hasNextLine())
            {
                String line = sc.nextLine();
                line.trim();
                String singleSpace = line.trim().replaceAll(" +", " ");
                output.add(singleSpace);
                count++;
            }
            sc.close();
            File fileOut = new File (outFile);
            FileWriter writer = new FileWriter (fileOut);
            for(int i = 0; i < count; i++)
            {
                writer.write(output.get(i)+"\n");
            }
            writer.close();
        }
        catch(IOException ex){
            System.out.println("Could not load file");
        }
    }
}
