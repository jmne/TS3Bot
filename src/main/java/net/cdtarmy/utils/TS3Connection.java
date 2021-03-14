package net.cdtarmy.utils;

import com.github.theholywaffle.teamspeak3.TS3Api;
import com.github.theholywaffle.teamspeak3.TS3Config;
import com.github.theholywaffle.teamspeak3.TS3Query;
import com.github.theholywaffle.teamspeak3.api.ChannelProperty;

import java.util.List;

public class TS3Connection {

    final TS3Config config;
    final TS3Query query;
    final TS3Api api;

    public TS3Connection(String URL, List<Server> list) {
        config = new TS3Config();
        config.setHost("cdtarmy.net");

        query = new TS3Query(config);
        query.connect();

        api = query.getApi();
        api.login("serveradmin", "TFxzx$%GehYv");
        api.selectVirtualServerById(1);
        api.setNickname("[CDT] Doggo-Bot");

        String csgo = "[COLOR=#00aa00]([I]Online[/I])";
        String gmod = "[COLOR=#00aa00]([I]Online[/I])";

        if (list.isEmpty()) {
            csgo = "[COLOR=#aa0000]([I]Offline[/I])";
            gmod = "[COLOR=#aa0000]([I]Offline[/I])";
        } else if (list.get(0).getGamedir().equalsIgnoreCase("garrysmod")) {
            csgo = "[COLOR=#aa0000]([I]Offline[/I])";
        } else if (list.size() == 1) {
            gmod = "[COLOR=#aa0000]([I]Offline[/I])";
        }

        api.editChannel(151, ChannelProperty.CHANNEL_DESCRIPTION, "[center][COLOR=#00c100][size=13][B][COLOR=#ffffff]–––––[/COLOR]  JOIN [COLOR=#ffffff]–––––[/COLOR][/B][/size][/COLOR]\n " +
                "\n" +
                "[url=steam://connect/185.216.178.7:27015/jan][B][ [COLOR=#ffaa00]CSGO Server[/COLOR] ] [/B][/url] [color=red][B]|[/B][/color] [url=steam://connect/185.216.178.7:27016/jan][B] [ [COLOR=#ffaa00]GMOD Server[/COLOR] ][/B][/url]\n " +
                csgo + "[/COLOR]        [B] |[/B]          " + gmod + "[/COLOR]\n" +
                "\n" +
                "[COLOR=#ffffff]–––––––––––––––[/COLOR]\n" +
                "[hr]\n" +
                "[img]" + URL + "[/img]\n" +
                "[hr]\n" +
                "[url=https://wwums-my.sharepoint.com/:f:/g/personal/jmenne_on_wwu_de/EuHgblxPbH1GqE9lmmVPy8QBWW6PQlpyrrYL7PNAvmwxMQ?e=PWMlN0][[COLOR=#909090]Gartic Phone[/COLOR]]\n" +
                "[COLOR=#ffffff]Passwort = jan[/COLOR][/url]");


    }
}

