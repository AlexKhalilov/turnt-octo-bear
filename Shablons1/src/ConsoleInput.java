
import java.io.*;public class ConsoleInput
{
    public static void main(String args[]) throws IOException{
        
    Console c=System.console();
    
    if (c==null){
        System.err.println("No console.");
        System.exit(1);
    }
}
}
