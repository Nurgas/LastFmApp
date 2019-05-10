package kg.nurga.lastfmmusicapp;

import android.app.Application;

import kg.nurga.lastfmmusicapp.data.tracks.ITracksRepository;
import kg.nurga.lastfmmusicapp.data.tracks.TracksRepository;
import kg.nurga.lastfmmusicapp.data.tracks.local.LocalTracksStorage;
import kg.nurga.lastfmmusicapp.data.tracks.remote.RemoteTracksStorage;

public class App extends Application {

    public static ITracksRepository tracksRepository;

    @Override
    public void onCreate() {
        super.onCreate();

        tracksRepository = new TracksRepository(
                new LocalTracksStorage(),
                new RemoteTracksStorage()
        );
    }
}
