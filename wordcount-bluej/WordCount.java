
import java.io.*;
import java.nio.*;
import java.nio.charset.*;
import java.nio.file.*;
public class WordCount{

    public static void main(String[] args){

        if (args.length < 1){
            System.out.println("usage: java WordCount <filename>");
            System.exit(1);
        }
        try{
            readFileStuff();
        }
        catch(IOException e){
        System.out.println(e);
        }

    }
    public static void readFileStuff() throws IOException{
        Charset charset = Charset.forName("UTF-8");
        Path path = Paths.get("afile1.txt");

        BufferedReader reader = 
            Files.newBufferedReader(path, charset);
        // use reader to process the file

    }
}
