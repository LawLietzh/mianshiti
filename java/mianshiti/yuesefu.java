package mianshiti;
//约瑟夫问题
/**
 * Created by zhangheng on 2018/1/9.
 */
public class yuesefu {
    //m 是人数，n 是出圈号
    public static void yueSeFu(int m,int n)
    {
        int[] a = new int[m];
        int len = m;
        //代表第几个人
        for(int i = 0;i<m;i++)
        {
            a[i] = i+1;
        }
        //i 表示 下标， j 表示 改报的数
        int i = 0;
        int j = 1;
        while(len>0)
        {
            if(a[i%m] != -1)
            {
                if(j%n == 0)
                {
                    System.out.print(a[i%m]+"    ");
                    a[i%m] = -1;
                    j = 1;
                    i++;
                    len--;
                }else{
                    i++;
                    j++;

                }
            }else{
                i++;
            }
        }


    }
    public static void main(String[] args)
    {
        yueSeFu(10,3);

    }
}
