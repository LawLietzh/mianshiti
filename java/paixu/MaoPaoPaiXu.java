package paixu;

/**
 * Created by zhangheng on 2018/3/9.
 */
public class MaoPaoPaiXu
{
    public static void maoPaoPaiXu(int[] A,int n)
    {
        int swap;
        for(int i = 0; i<n ; i++)
        {
            for(int j = 0 ; j<n-i-1;j++)
            {
                if(A[j]>A[j+1])
                {
                    swap = A[j];
                    A[j] = A[j+1];
                    A[j+1] = swap;
                }
            }
        }

    }


    public static void main(String[] args)
    {
        int[] A = {1,4,56,8,3,5};
        maoPaoPaiXu(A,6);
        for(int i = 0;i<A.length;i++)
        {
            System.out.print(A[i]+"  ");
        }

    }
}
