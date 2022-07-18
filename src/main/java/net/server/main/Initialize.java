package net.server.main;


public class Initialize {
    public static void main(String[] args) {

        Runner run = new Runner();
        while (!run.run()) {
            System.out.println("Start programm..");
        }
        System.exit(0);

    }
}