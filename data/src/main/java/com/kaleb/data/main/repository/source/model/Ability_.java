package com.kaleb.data.main.repository.source.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * @author Billy Kaleb Hananto (billy.hananto@dana.id)
 * @version Ability_, v 0.1 13/03/19 15.31 by Billy Kaleb Hananto
 */
public class Ability_ {

    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("url")
    @Expose
    private String url;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
