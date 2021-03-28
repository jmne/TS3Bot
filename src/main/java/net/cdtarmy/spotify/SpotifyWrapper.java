package net.cdtarmy.spotify;

import com.wrapper.spotify.SpotifyApi;
import com.wrapper.spotify.exceptions.SpotifyWebApiException;
import com.wrapper.spotify.model_objects.specification.ArtistSimplified;
import com.wrapper.spotify.model_objects.specification.Playlist;
import com.wrapper.spotify.model_objects.specification.PlaylistTrack;
import com.wrapper.spotify.model_objects.specification.Track;
import com.wrapper.spotify.requests.data.playlists.GetPlaylistRequest;
import org.apache.hc.core5.http.ParseException;

import java.io.IOException;
import java.util.Random;

public class SpotifyWrapper {

    private static final String accessToken = SpotifyClientCredentials.clientCredentials();
    private static final String playlistId = "37i9dQZF1DX4TiN7pMwV0Z";
    private final PlaylistTrack[] tracks;


    private static final SpotifyApi spotifyApi = new SpotifyApi.Builder()
            .setAccessToken(accessToken)
            .build();
    private static final GetPlaylistRequest getPlaylistRequest = spotifyApi.getPlaylist(playlistId)
//          .fields("description")
//          .market(CountryCode.SE)
//          .additionalTypes("track,episode")
            .build();

    public SpotifyWrapper() {
        tracks = getRandomSongOfPlaylist().getTracks().getItems();
    }

    public String[] getRandomSong() {

        Random r = new Random();
        int i = r.nextInt(tracks.length);
        Track t = (Track) tracks[i].getTrack();
        ArtistSimplified[] a = t.getArtists();
        System.out.println(t.getName() + " x " + a[0].getName());
        return new String[]{t.getName(),a[0].getName()};
    }

    public Playlist getRandomSongOfPlaylist() {
        try {
            return getPlaylistRequest.execute();
        } catch (IOException | SpotifyWebApiException | ParseException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return null;
    }

}
