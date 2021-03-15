
package net.cdtarmy.utils;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Motd {

    @SerializedName("raw")
    @Expose
    private List<String> raw = null;
    @SerializedName("clean")
    @Expose
    private List<String> clean = null;
    @SerializedName("html")
    @Expose
    private List<String> html = null;

    public List<String> getRaw() {
        return raw;
    }

    public void setRaw(List<String> raw) {
        this.raw = raw;
    }

    public List<String> getClean() {
        return clean;
    }

    public void setClean(List<String> clean) {
        this.clean = clean;
    }

    public List<String> getHtml() {
        return html;
    }

    public void setHtml(List<String> html) {
        this.html = html;
    }

}
