package com.maotai.testweb;

/**
 *  * Hello world!
 *   *
 *    */
public class App
{


 public static void main (String[] args) throws InterruptedException {
        System.out.println("Jenkins-demo");
        for (int i=1000;i>0;i--){

            Thread.sleep(1000);
            System.out.println("运行倒计时"+i);
        }
        System.out.println("demo is over");

    }
}
