package kg.nurga.lastfmmusicapp.presentation.artist;

import kg.nurga.core.mvp.ICoreMVPContract;

public interface ArtistContract {

    interface View extends ICoreMVPContract.View<Presenter> {

    }

    interface Presenter extends ICoreMVPContract.Presenter<View> {

        }


}
