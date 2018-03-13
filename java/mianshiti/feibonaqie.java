package mianshiti;

/**
 * Created by zhangheng on 2018/2/5.
 * 现要求 输入一个整数 n
 * 请你输出斐波那契列的第 n 项
 */
public class feibonaqie {
    public static int Feibonacci(int n)
    {
        // n 代表 从1 开始
        if(n<1)
        {
            return n;
        }
        int[] record = new int[n+1];
        record[0] = 1;
        record[1] = 1;
        for(int i = 2;i<=n;i++)
        {
            record[i] = record[i-1]  + record[i-2] ;

        }

        return record[n];

    }
    public static void main(String[] args)
    {
        //
        int n = Feibonacci(1);
        System.out.print(n);
    }
}
