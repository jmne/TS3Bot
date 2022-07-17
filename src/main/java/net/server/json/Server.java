package net.server.json;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Server {

    @SerializedName("addr")
    @Expose
    private String addr;
    @SerializedName("gmsindex")
    @Expose
    private Integer gmsindex;
    @SerializedName("appid")
    @Expose
    private Integer appid;
    @SerializedName("gamedir")
    @Expose
    private String gamedir;
    @SerializedName("region")
    @Expose
    private Integer region;
    @SerializedName("secure")
    @Expose
    private Boolean secure;
    @SerializedName("lan")
    @Expose
    private Boolean lan;
    @SerializedName("gameport")
    @Expose
    private Integer gameport;
    @SerializedName("specport")
    @Expose
    private Integer specport;

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public Integer getGmsindex() {
        return gmsindex;
    }

    public void setGmsindex(Integer gmsindex) {
        this.gmsindex = gmsindex;
    }

    public Integer getAppid() {
        return appid;
    }

    public void setAppid(Integer appid) {
        this.appid = appid;
    }

    public String getGamedir() {
        return gamedir;
    }

    public void setGamedir(String gamedir) {
        this.gamedir = gamedir;
    }

    public Integer getRegion() {
        return region;
    }

    public void setRegion(Integer region) {
        this.region = region;
    }

    public Boolean getSecure() {
        return secure;
    }

    public void setSecure(Boolean secure) {
        this.secure = secure;
    }

    public Boolean getLan() {
        return lan;
    }

    public void setLan(Boolean lan) {
        this.lan = lan;
    }

    public Integer getGameport() {
        return gameport;
    }

    public void setGameport(Integer gameport) {
        this.gameport = gameport;
    }

    public Integer getSpecport() {
        return specport;
    }

    public void setSpecport(Integer specport) {
        this.specport = specport;
    }

}
