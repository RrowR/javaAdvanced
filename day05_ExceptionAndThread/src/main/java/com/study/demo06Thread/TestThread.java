package com.study.demo06Thread;

public class TestThread extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 19; i++) {
            System.out.println("这是第1个方法 "+i);
        }
    }
}
