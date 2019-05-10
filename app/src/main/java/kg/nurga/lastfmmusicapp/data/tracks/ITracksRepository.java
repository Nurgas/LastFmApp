package kg.nurga.lastfmmusicapp.data.tracks;

import android.support.annotation.Nullable;

import java.util.List;

import kg.nurga.lastfmmusicapp.entities.TrackEntity;

public interface ITracksRepository {


    @Nullable
    TrackEntity getTracks(int id);

    void getTracks(TracksCallBack callBack);

    interface TracksCallBack{

        void onSuccess(List<TrackEntity> tracks);

        void onFailure(String message);
    }

}
