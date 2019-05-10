package kg.nurga.lastfmmusicapp.presentation.toptracks;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import kg.nurga.lastfmmusicapp.App;
import kg.nurga.lastfmmusicapp.data.tracks.TracksRepository;

public class TopTracksActivity extends AppCompatActivity {

    private TopTracksContract.Presenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TopTracksFragment fragment = TopTracksFragment.newInstance();

        getSupportFragmentManager()
                .beginTransaction()
                .add(android.R.id.content, fragment)
                .commit();

        mPresenter = new TopTracksPresenter((TracksRepository) App.tracksRepository);
        mPresenter.attachView(fragment);
        mPresenter.getTracks();

    }

}
