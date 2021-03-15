
package net.cdtarmy.utils;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

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
    @SerializedName("uuid")
    @Expose
    private Uuid uuid;

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

    public Uuid getUuid() {
        return uuid;
    }

    public void setUuid(Uuid uuid) {
        this.uuid = uuid;
    }

}
