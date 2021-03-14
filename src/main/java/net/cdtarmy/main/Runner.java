package net.cdtarmy.main;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import net.cdtarmy.utils.TS3Connection;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;


public class Runner {

    //TS3Connection con;
    public Runner() {

        //con = new TS3Connection();

    }

    public void run() throws IOException {

        String sURL = "https://api.giphy.com/v1/gifs/random?api_key=e1ZD4rTRbYsGUMd4OZOPtW6zXf4JYGCe&tag=dog&rating=g"; //just a string

        // Connect to the URL using java's native library
        URL url = new URL(sURL);
        URLConnection request = url.openConnection();
        request.connect();

        // Convert to a JSON object to print data
        JsonParser jp = new JsonParser(); //from gson
        JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent())); //Convert the input stream to a json element
        JsonObject rootobj = root.getAsJsonObject(); //May be an array, may be an object.
        String link = rootobj.toString();//just grab the link

        Gson gson = new Gson();
        Data data = gson.fromJson(link, Data.class);

        String urlString = "https://i.giphy.com/media/" + data.getData().getId() + "/giphy.gif";


        TS3Connection ts3 = new TS3Connection(urlString);

        return;

    }

}
