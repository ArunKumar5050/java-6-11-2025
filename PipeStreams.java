import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipeStreams {
    public static void main(String[] args) {
        try{
            PipedOutputStream pos = new PipedOutputStream();
            PipedInputStream pis = new PipedInputStream(pos);
            // Writer Thread
            //producer thread
            // Below is lambda expression for Runnable

            new Thread(()->{
                try{
                    pos.write("Hello from Pipe!".getBytes());
                    pos.close();
        }catch(IOException e){
                    e.printStackTrace();
                }}).start();

                //consumer thread
            new Thread(()->{
                try{
                    int data;
                    while((data = pis.read()) != -1){
                        System.out.print((char)data);
                    }
                    pis.close();
                }catch(IOException e){
                    e.printStackTrace();
                }}).start();
            }
     
        // Implementation for PipeStreams can be added here
    }
}
