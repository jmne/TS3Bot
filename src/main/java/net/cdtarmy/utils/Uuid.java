
package net.cdtarmy.utils;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Uuid {

    @SerializedName("JuppN")
    @Expose
    private String juppN;

    public String getJuppN() {
        return juppN;
    }

    public void setJuppN(String juppN) {
        this.juppN = juppN;
    }

}
