
package com.mycompany.lab11;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
        Formatter formatStr = new Formatter();
        formatStr.format("inFile.txt", "outFile.txt");
    }
}
