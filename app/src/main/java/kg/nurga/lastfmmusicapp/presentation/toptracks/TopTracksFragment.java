package kg.nurga.lastfmmusicapp.presentation.toptracks;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import kg.nurga.core.Logger;
import kg.nurga.core.mvp.CoreMvpFragment;
import kg.nurga.lastfmmusicapp.R;
import kg.nurga.lastfmmusicapp.entities.TrackEntity;
import kg.nurga.lastfmmusicapp.presentation.toptracks.recycler.TopTrackViewHolder;
import kg.nurga.lastfmmusicapp.presentation.toptracks.recycler.TopTracksAdapter;

public class TopTracksFragment extends CoreMvpFragment<TopTracksContract.Presenter>
        implements TopTracksContract.View,TopTrackViewHolder.TopTrackClickListener {
    private TopTracksAdapter mAdapter;


    public static TopTracksFragment newInstance() {

        TopTracksFragment fragment = new TopTracksFragment();
        return fragment;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_top_tracks;
    }

    @Override
    protected void initView(View view) {
        mAdapter = new TopTracksAdapter(this, new ArrayList<>());

    }



    @Override
    public void showTracks(List<TrackEntity> tracks) {

        for(TrackEntity track : tracks) {

            Logger.d(track.toString());
        }
    }
    @Override
    public void openTrack(TrackEntity track) {

    }

    @Override
    public void onTrackClick(int position) {

    }

    @Override
    public void onShareClick(int position) {

    }

    @Override
    public void onBookmarkClick(int position) {

    }
}
