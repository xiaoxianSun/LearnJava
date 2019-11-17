package IO_test;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class TestStream {
    public static void main(String[] args){
        try{
            File f = new File("/home/sxx/LearnJava/LearJava/src/IO_test/lol.txt");
            System.out.println(f.getAbsolutePath());
            FileInputStream fis = new FileInputStream(f);
            byte[] all = new byte[(int) f.length()];
            fis.read(all);
//            System.out.println(f.length());
            for(byte b:all){
                System.out.println(b);
            }
            fis.close();
//            File f_o = new File("out.txt");
//            FileOutputStream fout = new FileOutputStream(f_o);
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
