package IO_test;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
public class TestFile {
    public static  void main(String[] args){
        File f = new File ("/home/sxx");
        File[] fs = f.listFiles();
        File min = fs[0];
        File max = fs[0];
        for(int i=0;i<fs.length;i++)
        {
            if(fs[i].length() > min.length())
                max = fs[i];
            if(fs[i].length() < max.length())
                min = fs[i];
        }
        System.out.println("最短的文件:"+min);
        System.out.println("最长的文件:"+max);

    }
}

