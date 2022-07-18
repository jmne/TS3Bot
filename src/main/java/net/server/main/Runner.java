package net.server.main;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import net.server.json.Data;
import net.server.json.MC;
import net.server.json.Server;
import net.server.json.Steam;
import net.server.spotify.ResolveLyrics;
import net.server.spotify.SpotifyWrapper;
import net.server.utils.ReadProperties;
import net.server.utils.ReadTextFromURL;
import net.server.utils.TS3Connection;
import org.jmusixmatch.MusixMatchException;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Properties;

import static net.server.utils.ReadTextFromURL.getString;


public class Runner {

    private static final ReadProperties prop = new ReadProperties();

    //TS3Connection con;
    public Runner() {

        //con = new TS3Connection();

    }

    public boolean run() {

        try {
            SpotifyWrapper w = new SpotifyWrapper();
            String[] rs = w.getRandomSong();
            ResolveLyrics r = new ResolveLyrics(rs[0], rs[1]);

            String userDirectory = System.getProperty("user.dir");
            System.out.println(userDirectory);

            new TS3Connection(getUrlString(), onlineStatus(), onlineStatusMC(), getJoke(),
                    r.getRandomLine(), w.getArtists(), ReadTextFromURL.Github());
        } catch (MusixMatchException | IOException e) {
            e.printStackTrace();
            return false;
        }

        return true;


    }

    private String getLink(String sURL) throws IOException {
        // Connect to the URL using java's native library
        URL url = new URL(sURL);
        URLConnection request = url.openConnection();
        request.connect();

        JsonObject jsonObject =
                JsonParser.parseReader(new InputStreamReader((InputStream) request.getContent())).getAsJsonObject();

        return jsonObject.toString(); //grab the link


    }

    private String getUrlString() throws IOException {

        String link =
                getLink("https://api.giphy.com/v1/gifs/random?api_key=" + prop.getProperty("app.GiphyAPIKey") + "&tag" +
                        "=dog&rating=g"); //grab the link

        Gson gson = new Gson();
        Data data = gson.fromJson(link, Data.class);

        return "https://i.giphy.com/media/" + data.getData().getId() + "/giphy.gif";

    }

    private List<Server> onlineStatus() throws IOException {

        String link =
                getLink("http://api.steampowered.com/ISteamApps/GetServersAtAddress/v0001?addr=" + prop.getProperty(
                        "app.ServerAddress")); //grab the link

        Gson gson = new Gson();
        Steam data = gson.fromJson(link, Steam.class);

        return data.getResponse().getServers();

    }

    private MC onlineStatusMC() throws IOException {

        String link = getLink("https://api.mcsrvstat.us/2/" + prop.getProperty("app.ServerAddress")); //grab the link

        Gson gson = new Gson();

        return gson.fromJson(link, MC.class);

    }

    private String getJoke() throws IOException {

        InputStream inputStream = null;

        try {
            File jokeFile = new File(System.getProperty("user.dir") + "/TS3Bot/jokes.txt");
            File jokeDefFile = new File(System.getProperty("user.dir") + "/TS3Bot/jokes.default.txt");
            if (jokeFile.exists()) {
                inputStream = new FileInputStream(System.getProperty("user.dir") + "/TS3Bot/jokes.txt");
            } else if (jokeDefFile.exists()) {
                inputStream = new FileInputStream(System.getProperty("user.dir") + "/TS3Bot/jokes.default.txt");
            } else {
                System.out.println("No Jokes file found!");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return getString(inputStream);
    }

}
