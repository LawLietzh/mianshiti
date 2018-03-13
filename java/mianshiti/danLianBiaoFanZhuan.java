package mianshiti;
//java 实现单链表 翻转
/**
 * Created by zhangheng on 2018/1/11.
 * h -> h1 —> h2 ->h3
 * h <- h1    h2->h3
 * h <- h1 <- h2   h3
 * h <- h1 <- h2  <- h3
 *
 *
 *
 */
class Node{
    private  int Data;//数据域
    private Node Next;// 指针域
    public Node(int Data)
    {
        this.Data = Data;
    }

    public int getData() {
        return Data;
    }

    public Node getNext() {
        return Next;
    }

    public void setData(int data) {
        Data = data;
    }

    public void setNext(Node next) {
        Next = next;
    }
}
public class danLianBiaoFanZhuan {


    public static Node reverse(Node head)
    {
        System.out.println(" ****** ");
        if(head == null)
            return head;
        Node pre = head;  //上一节点
        Node cur = head.getNext();//当前 节点
        Node tem;  //临时节点，用于保存 当前节点的指针域
        while(cur != null)
        {
            tem = cur.getNext();
            cur.setNext(pre);
            //
            pre = cur;
            cur = tem;




        }
        head.setNext(null);

        return pre;
    }

    public static void main(String[] args)
    {
        Node head = new Node(0);
        Node head1 = new Node(1);
        Node head2 = new Node(2);
        Node head3 = new Node(3);
        head.setNext(head1);
        head1.setNext(head2);
        head2.setNext(head3);


        Node cur = head.getNext();
        while(null != cur)
        {

            System.out.print(cur.getData()+"  ");
            cur = cur.getNext();
        }
        System.out.println("                ");


        //打印 翻转前的 链表
        Node h = head;
        while(null != h)
        {
            System.out.print(h.getData()+"  ");
            h = h.getNext();
        }

        System.out.println("  ");

        Node pre = reverse(head);
        while(null != pre)
        {

            System.out.print(pre.getData()+"  ");
            pre = pre.getNext();
        }

    }
}
