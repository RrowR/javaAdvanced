package com.study.demo06TicketSell;

public class Demo01Ticket implements Runnable{
    //设置票的总数
    private int ticket = 100;
    @Override
    public void run() {
        //这里必须要进行循环，不循环程序就只会执行一次
        while (ticket > 0){
            if (ticket > 0){
                System.out.println(Thread.currentThread().getName()+"出售第"+ticket+"张票");
                ticket--;
            }
        }
    }
}