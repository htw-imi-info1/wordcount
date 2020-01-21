public class WordCount{

    public static void main(String[] args){

        if (args.length < 1){
            System.out.println("usage: java WordCount <filename>");
        }
    }

    public void readFileStuff(){
        Charset charset =  Charset.forName("UTF-8");
        Path path = Paths.get("file");
        try(BufferedReader reader = 
            Files.newBufferedReader(path, charset)) {
            // use reader to process the file
        }
    }
}
