package atividade2_threads;

public class Atividade2_Threads extends Thread {

    private final String name;
    private int time;

    public Atividade2_Threads(String name, int time) {
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


/*a) Implemente a interface Runnable;

b) Faça um exemplo usando o método sleep nas Threads;

c) Faça um exemplo do método join da Thread;

d) (TURMA 2ª feira) Faça um exemplo de uma Thread interrompendo outra com o interrupt();*/
