package github1_threads;

public class Github1_Threads extends Thread {

    private final String name;
    private int time;

    public Github1_Threads(String name, int time) {
        this.name = name;
        this.time = time;
        start();
    }

    @Override
    public void run() {
        System.out.println("Executando thread...");
        try {
            for (int i = 0; i < 7; i++) {
                System.out.println(name + " contador " + i);
                Thread.sleep(time);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + " terminou a execução.");
    }
}
