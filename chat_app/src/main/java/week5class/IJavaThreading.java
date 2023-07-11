package week5class;

public class IJavaThreading implements  Runnable{
//    Reduce --> Threads & Async (CompletableFuture)
//    CompletableFuture, Future
    private String food;

// Long Running Task
    public void printName() {
//        1000ms --> 1 second
        try {
            System.out.println("Thread don start o!!");
            Thread.sleep(3000);
            System.out.println("Running inside a thread");
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }

    }

    @Override
    public void run() {
        printName();
    }

    public static void main(String[] args) throws InterruptedException {
        IJavaThreading interfaceTest = new IJavaThreading();
//        new Thread()
//        new Thread(String name)
//        new Thread(Runnable, name)
//        new Thread(Runnable)

        Thread thread = new Thread(interfaceTest,"Java 15");
        thread.start();

        Thread.sleep(1000);
        System.out.println("inside main thread");
    }

}
