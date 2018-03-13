package paixu;

/**
 * Created by zhangheng on 2018/3/9.
 */
public class KuaiSuPaiXu {
    public static void main(String[] args){
        int[] in = {54,45,87,12,95,56,32,15,0,25};
        int count = in.length;
        int low=0;
        int high=count-1;
        QKSort(in,low,high);
        for(int i=0;i<count;i++){
            System.out.print(in[i]+" ");
        }
    }
    public static void QKSort(int[] in,int low,int high){
        int pos;
        if(low<high){
           //int i=(int)(Math.random()*100);
             int i = low + (int)(Math.random()*(high - low));
            System.out.println("    "+i);
             swap(in,i,high);
            pos = QKpass1(in,low,high);
            QKSort(in,low,pos-1);
            QKSort(in,pos+1,high);
        }
    }

    public static int QKpass1(int[] a,int left,int right)
    {
        int pivot = left -1;
        int index = left;
        while(index <= right)
        {
            if(a[index] <= a[right])
            {
                swap(a,++pivot,index);
            }
            index++;
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" @ ");
        }
        System.out.println();
        return  pivot;


    }
    public static void swap(int[] a,int left,int right)
    {
        int ss = a[left];
        a[left] = a[right];
        a[right] = ss;
    }

    public static int QKpass(int[] in,int low,int high){
        int temp = in[low];
        while(low<high){
            while(low<high && in[high]>=temp){
                high--;
            }
            in[low] = in[high];
            // System.out.println(in[low]);
            //low++;
            while(low<high && in[low]<=temp){
                low++;
            }
            in[high] = in[low];
            // System.out.println(in[high]+"FF");
            // high--;
        }

        in[low] = temp;
        for(int i=0;i<in.length;i++){
            System.out.print(in[i]+" ");
        }
        System.out.println();
        return low;
    }

}
