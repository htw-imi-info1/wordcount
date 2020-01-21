
import java.io.*;
import java.nio.*;
import java.nio.charset.*;
import java.nio.file.*;
public class WordCount{
    String fileName; 
    BufferedReader reader;
    int lineCounter = 0;
    public static void main(String[] args){

        if (args.length < 1){
            System.out.println("usage: java WordCount <filename>");
            System.exit(1);
        }
        try{
            WordCount instance = new WordCount();
            instance.readFile(args[0]);
            instance.printWordCount();
        }
        catch(NoSuchFileException e){
            System.out.println("File not found: "+ args[0]);
        }
        catch(IOException e){
            System.out.println(e);
        }

    }

    public WordCount(){
        lineCounter = 0;
    }

    public void readFile(String fileName) throws IOException{
        Charset charset = Charset.forName("UTF-8");
        this.fileName = fileName;
        Path path = Paths.get(fileName);

        //BufferedReader 
        try(BufferedReader reader = 
            Files.newBufferedReader(path, charset)){

            String line = reader.readLine();
            while(line != null){
                countLine(line);
                line = reader.readLine();
            }
        }
        catch(IOException e){
            System.out.println("oops in readFile");
            throw e;
        }
        // use reader to process the file

    }

    public void countLine(String line){
        lineCounter++;
    }

    public void printWordCount(){
        System.out.println(lineCounter +" words");
    }
}
