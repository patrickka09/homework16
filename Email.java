package edu.dmacc.codedsm.hw16;

public class Email implements TaskAssigner {
    @Override
    public void assignTasker() {
        System.out.println("Task from email");
    }
}
