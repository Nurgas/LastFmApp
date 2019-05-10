package kg.nurga.lastfmmusicapp.presentation.artist;

import android.support.annotation.Nullable;

import kg.nurga.core.mvp.CoreMvpActivity;
import kg.nurga.lastfmmusicapp.R;

public class ArtistActivity extends CoreMvpActivity<ArtistContract.Presenter>
implements ArtistContract.View{
    @Override
    protected int getLayoutId() {
       return R.layout.activity_top_tracks;
    }

    @Override
    protected void initView() {

    }

    @Nullable
    @Override
    protected ArtistContract.Presenter providePresenter() {
        return null;
    }
}
