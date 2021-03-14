package net.cdtarmy.utils;

import com.github.theholywaffle.teamspeak3.TS3Api;
import com.github.theholywaffle.teamspeak3.TS3Config;
import com.github.theholywaffle.teamspeak3.TS3Query;
import com.github.theholywaffle.teamspeak3.api.ChannelProperty;

public class TS3Connection {

    final TS3Config config;
    final TS3Query query;
    final TS3Api api;

    public TS3Connection() {
        config = new TS3Config();
        config.setHost("cdtarmy.net");

        query = new TS3Query(config);
        query.connect();

        api = query.getApi();
        api.login("serveradmin", "serveradminpassword");
        api.selectVirtualServerById(1);
        api.setNickname("Dog Bot");
        api.sendChannelMessage("Dog Bot is online!");

        api.editChannel(1, ChannelProperty.CHANNEL_DESCRIPTION, "Test: [img]");

    }
}

