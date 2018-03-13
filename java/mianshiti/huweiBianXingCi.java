package mianshiti;
//判断两个字符串 是否互为变形词
//给定两个字符串 s1  s2 ，如果 二者出现的字符种类一样，且
//每种字符出现的次数也一样 那么s1  s2 互为变形词，
//请事先一个函数  判断两个字符串是否互为变形词


//java 中字符 char 有256 个 ， java中字符的定义，字母，数字 和特殊字符
/**
 * Created by zhangheng on 2018/1/9.
 */
public class huweiBianXingCi {

    public boolean isDeformation(String str1,String str2)
    {
        if(str1 == null || str2 == null || str1.length()!=str2.length())
        {
            return false;
        }
        int[] map = new int[256];
        char[] char1 = str1.toCharArray();
        char[] char2 = str2.toCharArray();

        for(int i = 0;i<char1.length;i++)
        {
            map[char1[1]]++;
        }
        for(int j = 0;j<char2.length;j++)
        {

            map[char1[1]] = map[char1[1]]-1;
            if(map[char2[j]] < 0){
                System.out.println(char2[j]);
                return  false;
            }


        }
        return true;
    }



    public static boolean bXC(String str1,String str2)
    {
        if(str1 == null || str2 == null || str1.length() != str2.length())
        {
            return false;
        }
        int[] map = new int[256];
        char[] char1 = str1.toCharArray();
        char[] char2 = str2.toCharArray();
        for (int i =0;i <char1.length;i++)
        {
            map[char1[i]]++;
        }
        for (int j =0;j<char2.length;j++){
            map[char2[j]] = map[char2[j]]-1;
            if(map[char2[j]] < 0){
                System.out.println(char2[j]);
                return  false;
            }
        }
        return true;
    }
    public static void main(String[] args)
    {
        String str1 = "aa";
        char[] char1 = str1.toCharArray();
        String str2 = "ab";
        boolean bX =bXC(str1,str2);
        System.out.println(bX);

    }

}
