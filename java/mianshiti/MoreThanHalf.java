package mianshiti;

/**
 * Created by zhangheng on 2018/3/14.
 * 另外一种就是进行标号的遍历数组，因为某个元素超过一半，保存数组中的数字和其出现次数
 如果下一个相同则次数加1，不同减1，如果次数变为0则保存数字为下一个数,最终情况是出现次数最多的元素
 最终保存下来，然后检查是否超过半数

 这种方法，并不是完全之策，
 还要进行验证，看看是不是得到的结果就是
 */
public class MoreThanHalf
{
    //假设必存在，可以这样写，不确定的话，就要对得到的结果进行验证
    public static int  MoreThanHalf(int[] array)
    {
        int result =0,time = 0;
        for(int i = 0;i<array.length;i++)
        {
            if(time ==0)
            {
                result = array[i];
                time = 1;
            }else if(array[i] == result)
            {
                time++;
            }else {
                time--;
            }
        }
        return result;
    }
    public static void main(String[] args)
    {
        int[] a = {1,1,1,1,2,2,2,4,4,4,4,4,1,1,1,1,1,1,1,1,11,1,1};
        int result = MoreThanHalf(a);
        System.out.println("fffff:"+result);


    }
}
