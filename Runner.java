package edu.dmacc.codedsm.hw16;

public class Runner {
    public static void main(String[] args) {

        System.out.println("Starting runner...");
        Email email1 = new Email();
        email1.assignTasker();
        Phone phone1 = new Phone();
        phone1.assignTasker();
        Person person1 = new Person();
        person1.assignTasker();
    }
}
