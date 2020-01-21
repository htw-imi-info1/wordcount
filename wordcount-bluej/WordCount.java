

import java.io.*;
import java.nio.*;
import java.nio.charset.*;
import java.nio.file.*;
public class WordCount{

    public static void main(String[] args){

        if (args.length < 1){
            System.out.println("usage: java WordCount <filename>");
        }
    }

    public void readFileStuff(){
        Charset charset = Charset.forName("UTF-8");
        Path path = Paths.get("afile.txt");

        BufferedReader reader = 
            Files.newBufferedReader(path, charset);
                // use reader to process the file

    }
}
