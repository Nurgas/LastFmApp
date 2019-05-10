package kg.nurga.lastfmmusicapp.data.tracks.remote;

import kg.nurga.lastfmmusicapp.data.tracks.ITracksRepository;
import kg.nurga.lastfmmusicapp.data.tracks.remote.model.TracksResponse;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Query;

public class RemoteTracksStorage implements ITracksRemoteStorage {
    private final static String BASE_URL = "http://ws.audioscrobbler.com";
    private final static String API_KEY = "fd9879050c0e606b547d60ec49f0ca19";

    public static Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    public static TracksNetworkClient client = retrofit.create(TracksNetworkClient.class);

    @Override
    public void getTracks(final ITracksRepository.TracksCallBack callBack) {
        Call<TracksResponse> call = client.getTracks(
                "chart.getTopTracks", API_KEY,
                "json", 1,
                100);
        call.enqueue(new Callback<TracksResponse>() {
            @Override
            public void onResponse(Call<TracksResponse> call, Response<TracksResponse> response) {

                if(response.isSuccessful()){
                    if(response.body() !=null){
                        callBack.onSuccess(response.body().getTracks().getData() );
                    }else {
                        callBack.onFailure("Body is empty " + response.code());
                    }

                }else {
                    callBack.onFailure("Response failed " + response.code());
                }
            }

            @Override
            public void onFailure(Call<TracksResponse> call, Throwable t) {
                callBack.onFailure("Top tracks  failure " + t.getMessage());

            }
        });
    }

    private interface TracksNetworkClient {
        @GET("/2.0/")
        Call<TracksResponse> getTracks(
                @Query("method") String method,
                @Query("api_key") String apiKey,
                @Query("format") String format,
                @Query("page") int page,
                @Query("limit") int limit
        );
    }
}
