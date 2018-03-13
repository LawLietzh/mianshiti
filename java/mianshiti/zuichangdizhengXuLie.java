package mianshiti;

/**
 * Created by zhangheng on 2018/1/25.
 * 求 一个一维数组中最长递增子序列
 *
 */
public class zuichangdizhengXuLie {
    public static  int LIS(int[] array)
    {
        int max = 1;
        int[] LIS = new int[array.length];
        for(int i = 0;i<array.length;i++)
        {
            LIS[i] = 1;//初始化 默认长度
            for(int j = 0;j<i;j++)
            {
                if(array[i]>array[j] && LIS[j]+1 > LIS[i])
                {
                    LIS[i] = LIS[j]+1;
                    if(LIS[i]>max)
                    {
                        max = LIS[i];
                    }
                }
            }
        }

        return  max;

    }
    public static  void main(String[] args)
    {
        int[] A = {-4,-2,-7,-8,-10,-1,-8,-9};
        int t1 = LIS(A);

        System.out.print(t1);

    }
}
