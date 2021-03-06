package kg.nurga.lastfmmusicapp.presentation.toptracks.recycler;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import kg.nurga.lastfmmusicapp.entities.TrackEntity;


public class TopTracksAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private TopTrackViewHolder.TopTrackClickListener mListener;
    private ArrayList<TrackEntity> mTracks;

    public TopTracksAdapter(
            TopTrackViewHolder.TopTrackClickListener listener,
            ArrayList<TrackEntity> tracks
    ) {
        mListener = listener;
        mTracks = tracks;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int type) {

        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return mTracks.size();
    }

    public void setTracks(List<TrackEntity> tracks) {
        mTracks.clear();
        mTracks.addAll(tracks);
        notifyDataSetChanged();
    }
}
