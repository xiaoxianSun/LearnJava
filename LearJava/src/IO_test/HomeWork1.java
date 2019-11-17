package IO_test;
//参考了习题下的回答
import java.io.File;
import java.util.LinkedList;
import java.util.Queue;
public class HomeWork1 {
    //深度搜索
    private static long maxx = Integer.MIN_VALUE;
    private static long minn = Integer.MAX_VALUE;

    public static void DFS(File path){
        File[] flist = new File[2];
        long max = Integer.MIN_VALUE;
        long min = Integer.MAX_VALUE;
        DFS(path,flist);
        System.out.println(flist[0]+":"+flist[0].length());
        System.out.println(flist[1]+":"+flist[1].length());
    }
    private static void DFS(File path,File[] flist){
        if(path == null)
            return;
        if(path.isFile()){
            if(path.length() < minn)
            {
                flist[0] = path;
                minn = path.length();
            }
            if(path.length() > maxx)
            {
                flist[1] = path;
                maxx = path.length();
            }
        }
        if(path.isDirectory())
        {
            File[] fs = path.listFiles();
            for(File e:fs){
                DFS(e,flist);
            }
        }

    }

    //广度搜索
    public static void BFS(File path){
       Queue <File> queue = new LinkedList<File>();
       long min = Integer.MAX_VALUE;
       long max = Integer.MIN_VALUE;
       File minF = null;
       File maxF = null;//????可以直接初始化为空指针,然后就不分配空间???
        queue.add(path);
        while(!queue.isEmpty()){
            File cur = queue.remove();
            if(cur.isDirectory())
            {
                for(File e:cur.listFiles())
                {
                    queue.add(e);
                }
            }
            if(cur.isFile())
            {
                if (cur.length()>max)
                {
                    max = cur.length();
                    maxF = cur;
                }
                if(cur.length()<min)
                {
                    min = cur.length();
                    minF = cur;
                }
            }
        }
        System.out.println(maxF+":"+max);
        System.out.println(minF+":"+min);


    }




    public static void main(String[] args){
        File f = new File ("/home/sxx");
//        DFS(f);
        BFS(f);
    }
}
