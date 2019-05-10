package kg.nurga.lastfmmusicapp.data.tracks.local;

import java.util.List;

import kg.nurga.lastfmmusicapp.data.tracks.ITracksRepository;
import kg.nurga.lastfmmusicapp.entities.TrackEntity;

public class LocalTracksStorage implements ITracksLocalStorage {

    @Override
    public void getTracks(ITracksRepository.TracksCallBack callBack) {
        // TODO: Fetch from database

    }

    @Override
    public void setTracks(List<TrackEntity> tracks) {
        //TODO; Save to DB

    }
}
