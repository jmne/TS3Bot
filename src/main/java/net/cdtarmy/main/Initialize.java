package net.cdtarmy.main;


import org.jmusixmatch.MusixMatchException;

import java.io.IOException;

public class Initialize{
    public static void main(String[] args) throws IOException, MusixMatchException {

        Runner run = new Runner();
        run.run();
        System.exit(0);

    }
}
