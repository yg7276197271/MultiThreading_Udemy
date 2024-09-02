package interrupt_thread_example;
//Java Program to illustrate the 
//concept of interrupt() method 
//while a thread stops working 
class Geeks extends Thread { 
    public void run() 
    { 
        try { 
            System.out.println("Geeksforgeeks"); 
            Thread.sleep(2000); 
        } 
        catch (InterruptedException e) { 
            throw new RuntimeException("Thread " + 
                                    "interrupted"); 
        } 
    } 
    public static void main(String args[]) 
    { 
        Geeks t1 = new Geeks(); 
        t1.start(); 
        try { 
            t1.interrupt(); 
        } 
        catch (Exception e) { 
            System.out.println("Exception handled"); 
        } 
    } 
}