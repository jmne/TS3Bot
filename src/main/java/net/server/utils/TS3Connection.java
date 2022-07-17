package net.server.utils;

import com.github.theholywaffle.teamspeak3.TS3Api;
import com.github.theholywaffle.teamspeak3.TS3Config;
import com.github.theholywaffle.teamspeak3.TS3Query;
import com.github.theholywaffle.teamspeak3.api.ChannelProperty;
import net.server.json.MC;
import net.server.json.Server;

import java.util.List;

public class TS3Connection {

    private static final ReadProperties prop = new ReadProperties();
    final TS3Config config;
    final TS3Query query;
    final TS3Api api;


    public TS3Connection(String URL, List<Server> list, MC mc, String joke, String lyrics, String artists,
                         String paulaner) {
        config = new TS3Config();
        config.setHost(prop.getProperty("app.ServerDomain"));

        query = new TS3Query(config);
        query.connect();

        api = query.getApi();
        ReadProperties prop = new ReadProperties();
        api.login(prop.getProperty("app.TSUserName"), prop.getProperty("app.TSUserPassword"));
        api.selectVirtualServerById(1);
        api.setNickname("[CDT] Bot");

        String csgo = "[COLOR=#00aa00]([I]Online[/I])";
        String gmod = "[COLOR=#00aa00]([I]Online[/I])";
        String minec = mc.getOnline() ? "[COLOR=#00aa00]([I]Online[/I])" : "[COLOR=#aa0000]([I]Offline[/I])";

        if (list.isEmpty()) {
            csgo = "[COLOR=#aa0000]([I]Offline[/I])";
            gmod = "[COLOR=#aa0000]([I]Offline[/I])";
        } else if (list.get(0).getGamedir().equalsIgnoreCase("garrysmod")) {
            csgo = "[COLOR=#aa0000]([I]Offline[/I])";
        } else if (list.size() == 1) {
            gmod = "[COLOR=#aa0000]([I]Offline[/I])";
        }

        api.editChannel(151, ChannelProperty.CHANNEL_DESCRIPTION, "[center][COLOR=#00c100][size=13][B][COLOR=#ffffff" +
                "]–––––[/COLOR]  JOIN [COLOR=#ffffff]–––––[/COLOR][/B][/size][/COLOR]\n " +
                "\n" +
                "[url=steam://connect/" + prop.getProperty("app.ServerAddress") + ":" + prop.getProperty(
                "app.CSServerPort") + "/jan][B][ [COLOR=#ffaa00]CSGO Server[/COLOR] ] [/B][/url] " +
                "[color=red][B]|[/B][/color] [url=steam://connect/" + prop.getProperty("app.ServerAddress") + ":" + prop.getProperty("app.GMODServerPort") + "/jan][B] [ [COLOR=#ffaa00]GMOD Server[/COLOR] ][/B][/url]\n " +
                csgo + "[/COLOR]         [B] |[/B]            " + gmod + "[/COLOR]\n \n" +
                "[color=#55aaff][B][ [COLOR=#ffaa00]Minecraft Server[/COLOR] ] [/B][/color]\n" +
                minec + "\n" +
                "[COLOR=#ffffff]–––––––––––––––[/COLOR]\n" +
                "[hr]\n" +
                "[img]" + URL + "[/img]\n" +
                "[hr]\n" +
                "[size=13][COLOR=#c9c9c9][B]–– Line des Tages ––[/B][/COLOR][/size]\n" +
                "[COLOR=#00ff7f][I]" + lyrics + "[/I][/COLOR]\n" +
                "[COLOR=#55aaff][size=7][ " + artists + "][/size][/COLOR]\n" +
                "[hr]\n" +
                "[size=13][COLOR=#c9c9c9][B]–– Witz vom Olli ––[/B][/COLOR][/size]\n" +
                "[COLOR=#55aaff][I]" + joke + "[/I][/COLOR]\n" +
                "[hr]\n" +
                "[size=13][COLOR=#c9c9c9][B]–– Paulaner Geschichte ––[/B][/COLOR][/size]\n" +
                "[COLOR=#7a00c0][I]" + paulaner.replace("~", "\n~") + "[/I][/COLOR]\n" +
                "[hr]\n" +
                "[COLOR=#00c100][size=13][B][COLOR=#ffffff]–––––[/COLOR] SERVER STATUS " +
                "[COLOR=#ffffff]–––––[/COLOR][/B][/size][/COLOR]\n" +
                "[url=https://status." + prop.getProperty("app.ServerDomain") + "/][B][ [COLOR=#ffaa00]CLICK " +
                "HERE[/COLOR] ] [/B][/url]\n");

    }
}

