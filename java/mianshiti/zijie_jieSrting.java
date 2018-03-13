package mianshiti;

//按照字节  截取字符串
/*
 * 知识点：java中String 类中的subString(）截取的下标  没法截取 字节
 * String类中 getBytes() 方法可以把字符串 转变成 字节数组
 * 并且，每个字符占两个字节，单第一个为0 ，每个汉字 占两个字节，都不为 0
 */

import java.io.UnsupportedEncodingException;

/**
 * Created by zhangheng on 2018/1/9.
 */
public class zijie_jieSrting {
    public static void zijie_JieString(String str,int len) throws UnsupportedEncodingException
    {
        //bytes[0]  bytes[1]   是标志位，bytes[0] = -2  bytes[0] = -1
        byte[] bytes = str.getBytes("Unicode");
        int n = 0;   // 表示当前字节数
        int i = 2;
        System.out.println(bytes.length);
        for(; i<bytes.length && n <len;i++)
        {
            if(i%2 == 1){//表示一个字符中两个字节的  第二位
                n++;
            }else{
                if(bytes[i] !=0)
                {
                    n++;
                }
            }

        }

        System.out.println(" *************************************  ");
        System.out.println(i+"   "+n);
        //运行完 之后 i 比 n 快一步，当i 为奇数时，判断
       i = i-1;

        if(i%2 ==0)
        {
            if(bytes[i]!= 0)
            {
                i = i+1;
            }else{
                i = i-1;
            }
        }
        //第三个  字段截取的是，长度，并不是下标 ，所以，i 要 加一
        String ss = new String(bytes,0,i+1,"Unicode");
        System.out.println(ss);
    }
    public static void main(String[] args) throws UnsupportedEncodingException
    {
        String str = "a加b等于c";
        byte[] bytes = str.getBytes("Unicode");
        String ss1 = new String(bytes,0,8,"Unicode");
        System.out.println(ss1);

        String ss = str.substring(0,6);
        System.out.println(ss);
        zijie_JieString(str,6);

       /* byte[] b = new byte[]{'a','b','c','d','e','f'};
        String s = new String(b,0,5);
        System.out.println(s);*/
    }
}
