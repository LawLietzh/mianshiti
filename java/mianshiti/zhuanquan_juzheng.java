package mianshiti;
/*
给定一个整型矩阵 ，请按照转圈的方式打印它

 */
/**
 * Created by zhangheng on 2018/1/9.
 */
public class zhuanquan_juzheng {
    public  static void circleMat(int[][] mat)
    {
        int time = 0;
        int row = mat.length;     //m 是行
        int col = mat[0].length ;//n 是列


        for(int n = 0;;n++)
        {
            //正着输出行
            for(int i = n;i<col-n;i++)
            {
                System.out.print(mat[n][i]+"   ");
                time = time + 1;
            }
            if(time == row*col)
            {
                break;
            }
            //正着输出列
            for(int j = n+1;j<row-n;j++)
            {
                System.out.print(mat[j][col-n-1]+"   ");
                time = time + 1;
            }
            if(time == row*col)
            {
                break;
            }
            //倒着输出行
            for(int m = col-n-2;m>=n;m--)
            {
                System.out.print(mat[row-n-1][m]+"   ");
                time = time + 1;
            }
            if(time == row*col)
            {
                break;
            }
            //倒着输出列
            for(int k = row-2-n;k>n;k--)
            {
                System.out.print(mat[k][n]+"   ");
                time = time + 1;

            }
            if(time == row*col)
            {
                break;
            }
        }



    }
    public static void main(String[] args)
    {
        int[][] mat = new int[3][4];
        mat[0] = new int[]{1,2,3,4};
        mat[1] = new int[]{5,6,7,8};
        mat[2] = new int[]{9,10,11,12};
        //mat[3] = new int[]{13,14,15,16};

        /*for(int i = 0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.print(mat[i][j]+"   ");
            }
        }*/
        System.out.print("  ************************* ");
        circleMat(mat);

    }
}
