class MyThread extends Thread {
    public void run() {
        System.out.println("Thread running");
    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

        Thread myRunnable = new Thread(new MyRunnable());
        myRunnable.start();
    }
}

class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Runnable running");
    }
}
