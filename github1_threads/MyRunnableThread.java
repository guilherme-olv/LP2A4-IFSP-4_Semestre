package github1_threads;

public class MyRunnableThread implements Runnable {

    private String name;
    private int time;

    public MyRunnableThread(String name, int time) {
        this.name = name;
        this.time = time;
        //Thread t = new Thread(this);
        //t.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 8; i++) {
                System.out.println(name + " contador " + i);
                Thread.sleep(time);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrompida!");
        }
        System.out.println(name + " terminou a execução");
    }
}
