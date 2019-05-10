package kg.nurga.lastfmmusicapp.entities;

import com.google.gson.annotations.SerializedName;

public class TrackImage {
    @SerializedName("#text")
    private String url;

    @SerializedName("size")
    private String size;

    public TrackImage(String url, String size) {
        this.url = url;
        this.size = size;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return url + " " + size;
    }
}