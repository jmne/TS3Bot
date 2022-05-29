package net.cdtarmy.main;


import org.jmusixmatch.MusixMatchException;

import java.io.IOException;

public class Initialize{
    public static void main(String[] args) throws IOException, MusixMatchException {

        Runner run = new Runner();
        while(!run.run()){
            System.out.println("Starte Programm.");
        }
        System.exit(0);

    }
}