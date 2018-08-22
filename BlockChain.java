package com.prabhat.blockchain;


import java.util.Arrays;

public class BlockChain {

    public static void main(String[] args) {

        Transaction transaction1 = new Transaction("prabhat","atul",222L);
        Transaction transaction2 = new Transaction("atul","ranjeet",1000L);
        Transaction transaction3 = new Transaction("atul","ranjeet",10000L);
        Transaction transaction4 = new Transaction("ranjeet","anshi",100000L);
        Transaction transaction5 = new Transaction("prayag","prabhat",10L);
        Block firstBlock = new Block(0,Arrays.asList(transaction1,transaction2));
        System.out.println(firstBlock.hashCode());
        Block secondBlock = new Block(firstBlock.hashCode(),Arrays.asList(transaction3,transaction4));
        System.out.println(secondBlock.hashCode());
        Block thirdBlock = new Block(secondBlock.hashCode(),Arrays.asList(transaction4,transaction5));
        System.out.println(thirdBlock.hashCode());
        Block fourthBlock = new Block(thirdBlock.hashCode(),Arrays.asList(transaction5));
        System.out.println(fourthBlock.hashCode());


    }

}
