package net.server.main;


import net.server.utils.ReadProperties;

public class Initialize {
    public static void main(String[] args) {

        Runner run = new Runner();
        ReadProperties prop = new ReadProperties();
        System.out.println("Name: " + prop.getProperty("ArtifactId"));
        System.out.println("Version: " + prop.getProperty("Version"));

        while (!run.run()) {
            System.out.println("Start programm..");
        }
        System.exit(0);

    }
}