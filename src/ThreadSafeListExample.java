import java.util.concurrent.CopyOnWriteArrayList;

public class ThreadSafeListExample  {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> threadSafeList = new CopyOnWriteArrayList<>();

        // Criando threads para inserção paralela
        int numThreads = 5;
        Thread[] threads = new Thread[numThreads];

        for (int i = 0; i < numThreads; i++) {
            final int threadIndex = i;
            threads[i] = new Thread(() -> {
                for (int j = 0; j < 10; j++) {
                    int value = threadIndex * 10 + j;
                    threadSafeList.add(value);
                    System.out.println("Thread " + threadIndex + " inseriu: " + value);
                }
            });
        }

        // Iniciando as threads
        for (Thread thread : threads) {
            thread.start();
        }

        // Aguardando as threads terminarem
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Imprimindo a lista completa
        System.out.println("Elementos na lista:");
        for (Integer value : threadSafeList) {
            System.out.println(value);
        }
    }
}
