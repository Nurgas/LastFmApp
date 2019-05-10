package kg.nurga.lastfmmusicapp.data.tracks;

import android.support.annotation.Nullable;

import java.util.List;

import kg.nurga.lastfmmusicapp.data.tracks.local.ITracksLocalStorage;
import kg.nurga.lastfmmusicapp.data.tracks.remote.ITracksRemoteStorage;
import kg.nurga.lastfmmusicapp.entities.TrackEntity;

public class TracksRepository implements ITracksRepository {

    @Nullable
    private ITracksLocalStorage mLocal;
    @Nullable
    private ITracksRemoteStorage mRemote;

    public TracksRepository(
            @Nullable ITracksLocalStorage local,
            @Nullable ITracksRemoteStorage remote) {
        this.mLocal = local;
        this.mRemote = remote;
    }

    @Nullable
    @Override
    public TrackEntity getTracks(int id) {
        return null;
    }

    @Override
    public void getTracks(final TracksCallBack callBack) {

        if (mLocal !=null) {

            mLocal.getTracks(callBack);
        }

        if(mRemote!=null) {

            mRemote.getTracks(new TracksCallBack() {
                @Override
                public void onSuccess(List<TrackEntity> tracks) {
                    mLocal.setTracks(tracks);
                    callBack.onSuccess(tracks);
                }

                @Override
                public void onFailure(String message) {
                    callBack.onFailure(message);

                }
            });
        }
    }
}
