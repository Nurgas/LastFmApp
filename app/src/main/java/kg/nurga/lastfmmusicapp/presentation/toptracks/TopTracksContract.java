package kg.nurga.lastfmmusicapp.presentation.toptracks;

import java.util.List;

import kg.nurga.core.mvp.ICoreMVPContract;
import kg.nurga.lastfmmusicapp.entities.TrackEntity;

public interface TopTracksContract {

    interface View extends ICoreMVPContract.View<Presenter> {
        void showTracks(List<TrackEntity> tracks);


        void openTrack(TrackEntity track);
    }

    interface Presenter extends ICoreMVPContract.Presenter<View>{

        void getTracks();

        void onTrackClick(int position);

    }
}
