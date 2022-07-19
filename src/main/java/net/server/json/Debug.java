package net.server.json;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Debug {

    @SerializedName("ping")
    @Expose
    private Boolean ping;
    @SerializedName("query")
    @Expose
    private Boolean query;
    @SerializedName("srv")
    @Expose
    private Boolean srv;
    @SerializedName("querymismatch")
    @Expose
    private Boolean querymismatch;
    @SerializedName("ipinsrv")
    @Expose
    private Boolean ipinsrv;
    @SerializedName("cnameinsrv")
    @Expose
    private Boolean cnameinsrv;
    @SerializedName("animatedmotd")
    @Expose
    private Boolean animatedmotd;
    @SerializedName("cachetime")
    @Expose
    private Integer cachetime;
    @SerializedName("apiversion")
    @Expose
    private Integer apiversion;

    public Boolean getPing() {
        return ping;
    }

    public void setPing(Boolean ping) {
        this.ping = ping;
    }

    public Boolean getQuery() {
        return query;
    }

    public void setQuery(Boolean query) {
        this.query = query;
    }

    public Boolean getSrv() {
        return srv;
    }

    public void setSrv(Boolean srv) {
        this.srv = srv;
    }

    public Boolean getQuerymismatch() {
        return querymismatch;
    }

    public void setQuerymismatch(Boolean querymismatch) {
        this.querymismatch = querymismatch;
    }

    public Boolean getIpinsrv() {
        return ipinsrv;
    }

    public void setIpinsrv(Boolean ipinsrv) {
        this.ipinsrv = ipinsrv;
    }

    public Boolean getCnameinsrv() {
        return cnameinsrv;
    }

    public void setCnameinsrv(Boolean cnameinsrv) {
        this.cnameinsrv = cnameinsrv;
    }

    public Boolean getAnimatedmotd() {
        return animatedmotd;
    }

    public void setAnimatedmotd(Boolean animatedmotd) {
        this.animatedmotd = animatedmotd;
    }

    public Integer getCachetime() {
        return cachetime;
    }

    public void setCachetime(Integer cachetime) {
        this.cachetime = cachetime;
    }

    public Integer getApiversion() {
        return apiversion;
    }

    public void setApiversion(Integer apiversion) {
        this.apiversion = apiversion;
    }

}
