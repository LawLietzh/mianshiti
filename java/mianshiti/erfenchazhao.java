package mianshiti;
// 二分查找
// 二分查找 要求 要排序的序列，是递增的。

/**
 * Created by zhangheng on 2018/1/11.
 */
public class erfenchazhao
{
    public static int biSearch(int[] A ,int b,int e ,int v)
    {
        int minIndex = b;
        int maxIndex = e;
        int midIndex = -1 ;
        while (minIndex < maxIndex)
        {
            midIndex = minIndex + (maxIndex - midIndex)/2;
            if(A[midIndex] == v)
            {
                return midIndex;
            }else if (A[midIndex] < v)
            {
                minIndex = midIndex+1;
            }else if (A[midIndex] > v)
            {
                maxIndex = midIndex-1;
            }

        }
        return -1;
    }
    public static void main(String[] args)
    {

    }
}
