package net.cdtarmy.json;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MC {

    @SerializedName("ip")
    @Expose
    private String ip;
    @SerializedName("port")
    @Expose
    private Integer port;
    @SerializedName("debug")
    @Expose
    private Debug debug;
    @SerializedName("motd")
    @Expose
    private Motd motd;
    @SerializedName("players")
    @Expose
    private Players players;
    @SerializedName("version")
    @Expose
    private String version;
    @SerializedName("online")
    @Expose
    private Boolean online;
    @SerializedName("protocol")
    @Expose
    private Integer protocol;
    @SerializedName("icon")
    @Expose
    private String icon;
    @SerializedName("software")
    @Expose
    private String software;
    @SerializedName("map")
    @Expose
    private String map;
    @SerializedName("plugins")
    @Expose
    private Plugins plugins;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public Debug getDebug() {
        return debug;
    }

    public void setDebug(Debug debug) {
        this.debug = debug;
    }

    public Motd getMotd() {
        return motd;
    }

    public void setMotd(Motd motd) {
        this.motd = motd;
    }

    public Players getPlayers() {
        return players;
    }

    public void setPlayers(Players players) {
        this.players = players;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Boolean getOnline() {
        return online;
    }

    public void setOnline(Boolean online) {
        this.online = online;
    }

    public Integer getProtocol() {
        return protocol;
    }

    public void setProtocol(Integer protocol) {
        this.protocol = protocol;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getSoftware() {
        return software;
    }

    public void setSoftware(String software) {
        this.software = software;
    }

    public String getMap() {
        return map;
    }

    public void setMap(String map) {
        this.map = map;
    }

    public Plugins getPlugins() {
        return plugins;
    }

    public void setPlugins(Plugins plugins) {
        this.plugins = plugins;
    }

}
