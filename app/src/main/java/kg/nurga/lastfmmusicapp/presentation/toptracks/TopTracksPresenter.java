package kg.nurga.lastfmmusicapp.presentation.toptracks;

import java.util.List;

import kg.nurga.core.Logger;
import kg.nurga.core.mvp.CoreMvpPresenter;
import kg.nurga.lastfmmusicapp.data.tracks.ITracksRepository;
import kg.nurga.lastfmmusicapp.data.tracks.TracksRepository;
import kg.nurga.lastfmmusicapp.entities.TrackEntity;

public class TopTracksPresenter extends CoreMvpPresenter<TopTracksContract.View>
        implements TopTracksContract.Presenter{
    private ITracksRepository mRepository;

    public TopTracksPresenter (TracksRepository repository) {
        this.mRepository = repository;
    }

    @Override
    public void getTracks() {
        mRepository.getTracks(new ITracksRepository.TracksCallBack() {
            @Override
            public void onSuccess(List<TrackEntity> tracks) {
                Logger.d("Tracks success " + tracks.size());

                if(view !=null) {
                    view.showTracks(tracks);
                }
            }

            @Override
            public void onFailure(String message) {
                Logger.d(message);
                if(view !=null) {
                    view.showMessage(message);
                }
            }
        });
    }

    @Override
    public void onTrackClick(int position) {

    }

}
