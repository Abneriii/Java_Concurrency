package com.producerConsumer;

/**
 * Author:
 * Created at:2022/8/28
 * Updated at:
 **/
public class ProducerConsumerExample {
    public static void main(String[] args) {
        Drop drop = new Drop();
        (new Thread(new Producer(drop))).start();
        (new Thread(new Consumer(drop))).start();
    }
}