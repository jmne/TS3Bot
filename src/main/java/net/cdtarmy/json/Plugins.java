package net.cdtarmy.json;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Plugins {

    @SerializedName("names")
    @Expose
    private List<String> names = null;
    @SerializedName("raw")
    @Expose
    private List<String> raw = null;

    public List<String> getNames() {
        return names;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }

    public List<String> getRaw() {
        return raw;
    }

    public void setRaw(List<String> raw) {
        this.raw = raw;
    }

}
