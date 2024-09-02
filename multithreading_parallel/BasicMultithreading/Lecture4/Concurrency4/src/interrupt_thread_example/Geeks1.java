package interrupt_thread_example;

class Geeks1 extends Thread { 
    public void run() 
    { 
        for (int i = 0; i < 5; i++) 
            System.out.println(i); 
    } 
    public static void main(String args[]) 
    { 
    	Geeks1 t1 = new Geeks1(); 
        t1.start(); 
        t1.interrupt(); 
    } 
}
