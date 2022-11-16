package atividade2_threads;

import java.util.logging.Level;
import java.util.logging.Logger;

public class RunnableTest {

    public static void main(String[] args) {

        MyRunnableThread runnable_thread1 = new MyRunnableThread("Thread #1", 750);
        MyRunnableThread runnable_thread2 = new MyRunnableThread("Thread #2", 810);
        MyRunnableThread runnable_thread3 = new MyRunnableThread("Thread #3", 920);
        MyRunnableThread runnable_thread4 = new MyRunnableThread("Thread #4", 950);

        Thread t1 = new Thread(runnable_thread1);
        Thread t2 = new Thread(runnable_thread2);
        Thread t3 = new Thread(runnable_thread3);
        Thread t4 = new Thread(runnable_thread4);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
            t3.start();

            //Thread 4 interrompendo a Thread 3
            if (t3.isAlive()) {
                try {
                    t3.interrupt();
                    t4.start();
                    t4.join();
                    System.out.println("Thread #3 foi interrompida pela Thread #4");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Programa encerrado.");
    }
}
