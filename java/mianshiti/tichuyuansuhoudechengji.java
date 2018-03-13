package mianshiti;

/**
 * Created by zhangheng on 2018/2/7.
 *
 *求一个数组，剔除某个元素后的 乘积
 *
 */
public class tichuyuansuhoudechengji {
    public static int[] chengji(int[] A ,int n)
    {
        if(A==null   || n == 0)
        {
            return null;
        }
        int cj[] = new int[n];
        int[] left = new int[n];//存 i 前面的所有元素的乘积
        int[] right = new int[n];//存 i 后面所有元素的乘积
        left[0] = 1;
        right[n-1] = 1;

        for(int i = 1;i<n;i++)
        {
            left[i] = left[i-1]*A[i-1];
        }

        for(int j = n-2;j>=0;j--)
        {
            right[j] = right[j+1]*A[j+1];
        }

        for(int k=0;k<n;k++)
        {
            cj[k] = left[k]*right[k];
        }
        return  cj;


    }

    public  static void  main(String[] args)
    {
        int [] a = {1,2,3,4,5};
        int[] b = chengji(a,5);
        for(int k=0;k<5;k++)
        {
            System.out.println(b[k]);
        }


    }

}
