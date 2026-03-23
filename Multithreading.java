
class Queue
{
    
    void checkD(int a)
    {
        int c=a;
        int k=0;
        while(c!=0)
        {
            int r=c%10;
            if(r==0)
            {
                k=1;
                break;
            }
            c=c/10;
        }

        for(int i=2;i<a;i++)
        {
            if(a%i==0)
            k=0;
        }
        if(k==1)
        System.out.println("Duck prime");
        else
        System.out.println("Not duck prime");
    }
    void checkP(int a)
    {
        int k=1;
        for(int i=2;i<a;i++)
        {
            if(a%i==0)
            k=0;
        }
        if(k==1)
        System.out.println(" prime");
        else
        System.out.println(" prime");
    }
    
    public synchronized void display(String name)
    {
        System.out.println(name+"printing");
       
            try
            {
                Thread.sleep(1000);
            }
            catch(Exception e)
            {

            }

        
        System.out.println(" ");
    }
}

class mythread implements Runnable
{
    Queue q;
    Thread t;
    String name;
    mythread(Queue q, String name)
    {
        this.q=q;
        t=new Thread(this);
        t.setName(name);
        t.start();

    }
    public void run()
    {
        q.checkD(303);
        q.checkP(3);
        q.display(name);
    }
}
public class Multithreading
{
    public static void main(String args[])
    {
        Queue q=new Queue();
        new mythread(q, "THR1");
        new mythread(q, "THR2");
        new mythread(q, "THR3");

    }
}
