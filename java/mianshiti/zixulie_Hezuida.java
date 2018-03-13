package mianshiti;

/**
 * Created by zhangheng on 2018/1/16.
 * 求数组的子数组之和的 最大值
 * 明题意：1，子数组是连续的，
 *         2，题目自需求和，并不需要返回子数组的具体位置
 *         3，数组元素，是整数，所以数组可能包含有 + - 0
 *正无穷大：Double.POSITIVE_INFINITY
 负无穷大：Double.NEGATIVE_INFINITY
 */
public class zixulie_Hezuida {
    //最简单的方法 ，两次循环，找到所有的子序列的和，找到最大的
    public static int MaxSum(int[] A,int n)
    {
         int maxsum = (int)Double.NEGATIVE_INFINITY;
        for(int i = 0;i<n;i++)
        {
            int sum = 0;
            for(int j = i;j<n;j++)
            {
                sum = sum + A[j];
                if(sum > maxsum)
                {
                    maxsum = sum;
                }
            }

        }
        return maxsum;

    }

    public static  int maxsum(int[] A,int n)
    {
        int start = A[0];
        int sum = A[0];
        for(int i = 1;i<n;i++)
        {
            if(start < 0)
            {
                start = 0;
            }
            start = start + A[i];
            if(start > sum)
            {
                sum = start;
            }

        }

        return  sum ;

    }

    public static void  main(String[] args)
    {
        int[] A = {-4,-2,-7,-8,-10,-1,-8,-9};
        int n = 8;
        int t1 = MaxSum(A,8);
        int t2 = maxsum(A,8);
        System.out.print(t1+"        "+t2);

    }
}
