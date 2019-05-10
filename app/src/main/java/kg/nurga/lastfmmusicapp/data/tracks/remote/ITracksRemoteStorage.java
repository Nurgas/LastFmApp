package kg.nurga.lastfmmusicapp.data.tracks.remote;

import kg.nurga.lastfmmusicapp.data.tracks.ITracksRepository;

public interface ITracksRemoteStorage {

    void getTracks(ITracksRepository.TracksCallBack callBack);

}
