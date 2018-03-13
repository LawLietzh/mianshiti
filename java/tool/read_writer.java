package tool;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangheng on 2018/2/7.
 */
public class read_writer {
    public static void main(String[] args) throws IOException
    {
        //文本存储地址
        String pathw = "D://woshi.txt";
        FileOutputStream fos = new FileOutputStream(pathw);
        OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");

        //读
        String paths1 = "D://woshini.txt";
        InputStreamReader reads1 = new InputStreamReader(new FileInputStream(paths1),"GBK");
        BufferedReader bufferedReaders1 = new BufferedReader(reads1);
        String line= null;
        List<String> lists1 = new ArrayList<String>();
        int s1 = 0;
        while((line = bufferedReaders1.readLine() ) != null)
        {

        }
    }
}
