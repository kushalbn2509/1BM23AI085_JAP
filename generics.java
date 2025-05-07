import java.util.Arrays;
public class generics <T>{
    T[] que;
    int size;
    public generics()
    {
        que=(T[])new Object[2];
        size=0;
    }

    public void enqueue(T element)
    {
        if(size==que.length) {
            int new_capacity = que.length * 2;
            que= Arrays.copyOf(que,new_capacity);

        }
        que[size++]=element;
    }

    public T dequeue(){
        if(size==0)
        {
            System.out.println("QUEUE IS EMPTY");

        }
        T del_element=que[0];
        System.arraycopy(que,1,que,0,size-1);
        que[--size]=null;
        return del_element;
    }

    public void display(){
        for(T element : que){
            System.out.println(element);
        }
    }

    public static void main(String args[]){
        generics<Integer>a=new generics<>();
        a.enqueue(10);
        a.enqueue(20);
        a.enqueue(30);
        System.out.println("THE ELEMENTS IN QUEUE ARE :");
        a.display();
        int dequeued_element = a.dequeue();
        System.out.println("THE DEQUEUED ELEMENT IS : "+dequeued_element);


    }
}
