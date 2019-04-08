package edu.dmacc.codedsm.hw16;

public class Phone implements TaskAssigner {
    @Override
    public void assignTasker() {
        System.out.println("Task from phone");
    }
}
