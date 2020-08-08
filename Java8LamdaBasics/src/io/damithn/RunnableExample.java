package io.damithn;

/**
 * @author DAMITH SAMARAKOON on 8/8/2020
 */
public class RunnableExample {
    public static void main(String[] args) {
        //uisng inner class
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("printed inside Runnable");
            }
        });

        thread.run();

        // using lamda
        Thread myLamda = new Thread(() -> System.out.println("printed inside Lamda"));
        myLamda.run();
    }
}
