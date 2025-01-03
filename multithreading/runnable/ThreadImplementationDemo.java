package multithreading.runnable;

// thread creating by extending the Thread class

class MyThread implements Runnable{
    public void run(){
        try{
            //Displaying the thread that is running
            System.out.println("Thread " + Thread.currentThread().getId() + "is running");
        } catch(Exception e){
            //Throwing an exception
            System.out.println("Exception is caught: " + e.getMessage());
        }
    }
}

// main class
public class ThreadImplementationDemo {
    public static void main(String[] args) {
        System.out.println("Demonstration of threads by implementing runnable starts here: ");
        int noOfThreads = 10;  // number of threads
        for (int i = 0; i < noOfThreads; i++){
            Thread thread = new Thread(new MyThread());
            thread.start();
        }
    }
}
