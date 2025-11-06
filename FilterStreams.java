//Filter Streams are the decoder streams that adds functionality to the underlying streams, such as data transmission or formatting . They "filter" data as it passes through .
// types of Filter Streams are-
// a.Byte Based : FilterInputSteream, FilterOutputStream(bases).
// b. Primitive-based: DataInput , DataOutput
// c. Character-based: BufferedReader, BufferedWriter, PrintWriter, PushbackReader, PushbackWriter, LineNumberReader.
import java.io.IOException;
import java.io.PrintWriter;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;




public class FilterStreams {
    public static void main(String[] args) {
        System.out.println("This is a placeholder for FilterStreams.java");
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("data.bin"))) {
            dos.writeInt(42);
            dos.writeDouble(3.14);
            dos.writeUTF("Hello, Filter Streams!");
        } catch (IOException e) {
            e.printStackTrace();
            
        }

        try(DataInputStream dis = new DataInputStream(new FileInputStream("data2.bin"))){
            System.out.println(dis.readInt());
            System.out.println(dis.readDouble());
            System.out.println(dis.readUTF());
        } catch (IOException e) {
            e.printStackTrace();
        }


        try(PrintWriter pw = new PrintWriter(new FileOutputStream("data3.txt"))){            pw.println(line1);
            pw.println(line2);
            pw.println(line3);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

       
