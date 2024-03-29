package net.server.json;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Players {

    @SerializedName("online")
    @Expose
    private Integer online;
    @SerializedName("max")
    @Expose
    private Integer max;
    @SerializedName("list")
    @Expose
    private List<String> list = null;

    public Integer getOnline() {
        return online;
    }

    public void setOnline(Integer online) {
        this.online = online;
    }

    public Integer getMax() {
        return max;
    }

    public void setMax(Integer max) {
        this.max = max;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }


}
