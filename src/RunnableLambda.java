public class RunnableLambda {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Runables inside an Anonymous Class");
        Runnable runnable = new Runnable() {

            @Override
            public void run() {
                for (int i = 0; i<3; i++) {
                    System.out.println("Allo my dear cousin. We are awailable on thread [" +
                            Thread.currentThread().getName() + "]");
                }
            }
        };

        Thread t = new Thread(runnable);
        t.start();
        t.join();

        System.out.println("\nRunning inside Lambdas");
        Runnable runnableLambda = () -> {

            for (int i = 0; i<3; i++) {
                System.out.println("Allo my dear cousin. We are awailable on thread [" +
                        Thread.currentThread().getName() + "]");
            }
        };

        t = new Thread(runnableLambda);
        t.start();
        t.join();
    }
}
