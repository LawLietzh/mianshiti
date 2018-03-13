package mianshiti;
/*
   如何 不用 额外的变量 交换两个整数的值

 */
/**
 * Created by zhangheng on 2018/1/10.
 */
public class jiaohuan_shu {
    public static int[] exchangeWei(int a ,int b)
    {
        int[] n = new int[2];
        a = a^b;
        b = a^b;
        a = a^b;
        n[0] = a;
        n[1] = b;
        return n;
    }
    public static void main(String[] args)
    {
        int  a = 123;
        int  b = 456;
        a = a+b;
        b = a-b;
        a = a -b;










    }
}
