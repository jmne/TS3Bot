package net.cdtarmy.utils;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ReadTextFromURL {

    public static String Github() throws IOException {

        InputStream inputStream = new FileInputStream(new File(System.getProperty("user.dir") + "/TS3DoggoBot/paulaner.txt"));
        InputStreamReader streamReader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
        BufferedReader reader = new BufferedReader(streamReader);
        List<String> lines = new ArrayList<>();
        for (String line; (line = reader.readLine()) != null;) {
            lines.add(line);
        }
        Random r = new Random();
        return lines.get(r.nextInt(lines.size()));
    }

}