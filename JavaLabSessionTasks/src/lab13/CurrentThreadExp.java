package lab13;

public class CurrentThreadExp extends Thread  
{    
    public void run()  
    {    
        // print currently executing thread   
        System.out.println(Thread.currentThread().getName().hashCode());    
    }    
    public static void main(String args[])  
    {    
        // creating two thread  
        CurrentThreadExp t1=new CurrentThreadExp();    
        CurrentThreadExp t2=new CurrentThreadExp();    
        // this will call the run() method  
        t1.start();    
        t2.start();    
    }    
}  
