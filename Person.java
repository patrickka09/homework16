package edu.dmacc.codedsm.hw16;

public class Person implements TaskAssigner {
    @Override
    public void assignTasker() {
        System.out.println(" task from Person");
    }
}
