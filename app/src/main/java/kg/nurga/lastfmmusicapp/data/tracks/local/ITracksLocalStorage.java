package kg.nurga.lastfmmusicapp.data.tracks.local;


import java.util.List;

import kg.nurga.lastfmmusicapp.data.tracks.ITracksRepository;
import kg.nurga.lastfmmusicapp.entities.TrackEntity;

public interface ITracksLocalStorage {

    void getTracks(ITracksRepository.TracksCallBack callBack);

    void setTracks(List<TrackEntity> tracks);
}
