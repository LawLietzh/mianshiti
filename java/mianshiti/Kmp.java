package mianshiti;

/**
 * Created by zhangheng on 2018/3/13.
 * KMP算法可以以O(M+N)的复杂度找到子串在str的位置。
 */
public class Kmp {
    public static void pattern(String str,String sub,int[] next) {
        char[] ch1 = str.toCharArray();
        char[] ch2 = sub.toCharArray();
        int i = 0,j = 0;  //i控制ch1,j控制ch2;
        for(;i<ch1.length; )
        {
            if(ch1[i]==ch2[j])
            {//匹配就自动递增，往后匹配。
                if(j==ch2.length-1)
                {
                    System.out.println(i-ch2.length+1);
                    break;
                }
                j++;
                i++;
            }
            else if(j==0) {
                i++;
            }
            else {
                j = next[j-1]+1;
            }
        }
    }
    public static int[] next(String sub) {
        int length=sub.length();
        int[] a = new int[length];
        char[] c = sub.toCharArray();
        int i,j;
        a[0] = -1;
        i = 0;
        for(j=1;j<length;j++) {
            i = a[j - 1];
            while(i>=0&&c[j]!=c[i+1]) {
                i = a[i];
            }
            if(c[j]==c[i+1]) {
                a[j] = i+1;
            }
            else {
                a[j] = -1;
            }
        }
        return a;
    }

    public static void main(String[] args)
    {
        String str = "BBC ABCDAB ABCDABCDABDE";
        String sub = "ABCDABCDA";
        int[] next = next(sub);
        pattern(str,sub,next);


    }
}
