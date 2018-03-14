package mianshiti;

/**（1）
 * Created by zhangheng on 2018/1/16.
 * 求数组的子数组之和的 最大值
 * 明题意：1，子数组是连续的，
 *         2，题目自需求和，并不需要返回子数组的具体位置
 *         3，数组元素，是整数，所以数组可能包含有 + - 0
 *正无穷大：Double.POSITIVE_INFINITY
 负无穷大：Double.NEGATIVE_INFINITY


 （2） 连续子序列乘积问题
 http://shmilyaw-hotmail-com.iteye.com/blog/1616632
 前面的这个问题概括起来不就是max(a) = max(max(a, i, i), max(a, i, i+1), ...,max(a, i, j)) 这样的一个等式吗？我们这里max(a, i, j)表示从数组i开始到j结束的范围内，包含j作为结尾的最大连续子序列乘积。
 概括起来就是说包含第k+1个元素为结尾的序列最大乘积应该取自上述三种情况之一：
 max(k+1) = max(maxk * a[k+1], mink * a[k+1], a[k+1])。
 　　按照同样的道理，我们求得的包含k+1在内结尾的最小乘积序列为：
 min(k+1) = min(mink * a[k+1], maxk * a[k+1], a[k+1])
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
    public static int maxProduct(int[] a)
    {
        int maxCur = 1;
        int minCur = 1;
        int maxTmp = maxCur;
        int minTmp = minCur;
        int result = 0;
        for(int i = 0; i < a.length ;i++)
        {
            maxTmp = Math.max(a[i],Math.max(maxCur*a[i],minCur*a[i]));
            minTmp = Math.min(a[i],Math.max(maxCur*a[i],minCur*a[i]));
            maxCur = maxTmp;
            minCur = minTmp;
            result = Math.max(result,maxCur);
        }
        return result;

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
