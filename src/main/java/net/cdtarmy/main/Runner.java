package net.cdtarmy.main;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import net.cdtarmy.json.Data;
import net.cdtarmy.json.MC;
import net.cdtarmy.json.Server;
import net.cdtarmy.json.Steam;
import net.cdtarmy.utils.*;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;


public class Runner {

    //TS3Connection con;
    public Runner() {

        //con = new TS3Connection();

    }

    public void run() throws IOException {

        String urlString = getUrlString();


        TS3Connection ts3 = new TS3Connection(urlString, onlineStatus(), onlineStatusMC(), dadJoke());


    }

    private String getUrlString() throws IOException {

        String sURL = "https://api.giphy.com/v1/gifs/random?api_key=e1ZD4rTRbYsGUMd4OZOPtW6zXf4JYGCe&tag=dog&rating=g"; //just a string

        // Connect to the URL using java's native library
        URL url = new URL(sURL);
        URLConnection request = url.openConnection();
        request.connect();

        // Convert to a JSON object to print data
        JsonParser jp = new JsonParser(); //from gson
        JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent())); //Convert the input stream to a json element
        String link = root.getAsJsonObject().toString();//just grab the link

        Gson gson = new Gson();
        Data data = gson.fromJson(link, Data.class);

        return "https://i.giphy.com/media/" + data.getData().getId() + "/giphy.gif";

    }

    private List<Server> onlineStatus() throws IOException {

        String sURL = "http://api.steampowered.com/ISteamApps/GetServersAtAddress/v0001?addr=185.216.178.7"; //just a string

        // Connect to the URL using java's native library
        URL url = new URL(sURL);
        URLConnection request = url.openConnection();
        request.connect();

        // Convert to a JSON object to print data
        JsonParser jp = new JsonParser(); //from gson
        JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent())); //Convert the input stream to a json element
        String link = root.getAsJsonObject().toString();//just grab the link

        Gson gson = new Gson();
        Steam data = gson.fromJson(link, Steam.class);

        return data.getResponse().getServers();

    }

    private MC onlineStatusMC() throws IOException {

        String sURL = "https://api.mcsrvstat.us/2/185.216.178.7"; //just a string

        // Connect to the URL using java's native library
        URL url = new URL(sURL);
        URLConnection request = url.openConnection();
        request.connect();

        // Convert to a JSON object to print data
        JsonParser jp = new JsonParser(); //from gson
        JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent())); //Convert the input stream to a json element
        String link = root.getAsJsonObject().toString();//just grab the link

        Gson gson = new Gson();

        return gson.fromJson(link, MC.class);

    }

     private String dadJoke() throws IOException {

         List<String> lines = Files.readAllLines(Paths.get("src/main/java/net/cdtarmy/jokes.txt"));
         Random r = new Random();
        return lines.get(r.nextInt(lines.size()));
    }

}
