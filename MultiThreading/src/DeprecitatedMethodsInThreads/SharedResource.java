package DeprecitatedMethodsInThreads;

public class SharedResource {
    boolean isAvailable = false;

    public synchronized void produce(){
        System.out.println("Called produce() Lock Acquired by Thread : " + Thread.currentThread().getName());
        isAvailable = true;
        try{
            Thread.sleep(8000);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println("Lock Released");
    }
}
