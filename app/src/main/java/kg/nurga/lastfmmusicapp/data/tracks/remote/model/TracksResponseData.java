package kg.nurga.lastfmmusicapp.data.tracks.remote.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import kg.nurga.lastfmmusicapp.entities.TrackEntity;

public class TracksResponseData {
    @SerializedName("track")
    private List<TrackEntity> data;

    //TODO: Add attributes

    public TracksResponseData(List<TrackEntity> data) {
        this.data = data;
    }

    public List<TrackEntity> getData() {
        return data;
    }

    public void setData(List<TrackEntity> data) {
        this.data = data;
    }

}
