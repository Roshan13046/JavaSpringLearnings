package LockFreeConcurrency;

public class Main {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        Thread thread1 = new Thread(()->{
            for(int i=0; i<400;i++)
//                sharedResource.increment();
                sharedResource.incrementAtomic();
        });

        Thread thread2 = new Thread(()->{
            for(int i=0; i<400; i++){
//                sharedResource.increment();
                sharedResource.incrementAtomic();
            }
        });

        thread1.start();
        thread2.start();

        try{
            thread1.join();
            thread2.join();
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println("counter : " + sharedResource.getCounter() + " , Atomic Counter : "
                + sharedResource.getAtomicCounter() );
    }
}
