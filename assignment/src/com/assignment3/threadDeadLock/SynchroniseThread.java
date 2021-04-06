package com.assignment3.threadDeadLock;

/*
*creating a class Synchronise thread and implementing runnable interface
 */
public class SynchroniseThread implements Runnable{

    //creating the fields of object
    private Object object1;
    private Object object2;
    public SynchroniseThread(Object o1, Object o2) {
        this.object1=o1;
        this.object2=o2;
    }
    //overriding run() method of the Thread class
    //it allows two threads are running concurrently
    public void run()
    {
        //getting the current thread name
        String name = Thread.currentThread().getName();
        System.out.println(name + " acquire lock on " + object1);
        //Synchronized() method is used to lock an object for any shared resource. When a thread invokes the synchronized() method,
        //it automatically acquires the lock for that object and releases it when the thread completes its task.
        synchronized (object1)
        {
            System.out.println(name + " acquired lock on " + object1);
            //calling work() method
            work();
        }
        System.out.println(name + " released lock of " + object1);
        System.out.println(name + " acquire lock on " + object2);
        synchronized (object2)
        {
            System.out.println(name + " acquire lock on " + object2);
            work();
        }
        System.out.println(name + " released lock of " + object2);
        System.out.println(name + " execution is completed.");
    }

    //defining method work and handling exception with the help of try and catch block
    private void work()
    {
        try
        {
            //the sleep() method suspends the execution of the current thread for 5 seconds
            Thread.sleep(5000);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
