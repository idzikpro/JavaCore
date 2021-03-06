package pl.idzikpro.thread;

import java.util.stream.IntStream;

public class MyThread extends Thread {
    @Override
    public void run(){
        IntStream.rangeClosed(0,100)
                .forEach(i->System.out.println(i+" running "+MyThread.currentThread().getName()));
    }

    public MyThread(String name) {
        super(name);
    }
}
