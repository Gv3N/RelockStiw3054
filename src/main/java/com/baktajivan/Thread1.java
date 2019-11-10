package com.baktajivan;
//imports

import java.util.concurrent.locks.ReentrantLock;

public class Thread1 extends Thread{
    public void run(){
        ReentrantLock relock = new ReentrantLock();

        try{

            for (int i = 1;i<=10; i++){
                if(i == 5){
                    relock.lock();
                    for (i = 5; i<8; i++){
                        System.out.println("Thread 1 is Lock: "+i);
                        //prints is thread is lock
                    }//for print 5-7
                    relock.unlock();
                    System.out.println("Thread 1 is UnLock");
                }//if
                else if(i <= 4 || i >= 8){
                    System.out.println("Thread 1 : "+i);
                    //prints as usual [should interleave]
                }//else
            }//for
        }finally {
            System.out.println("Thread 1 is Done");
            //prints is unlock a thread
        }//finally
    }
}

