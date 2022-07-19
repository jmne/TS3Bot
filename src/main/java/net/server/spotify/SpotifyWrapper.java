package net.server.spotify;

import net.server.utils.ReadProperties;
import org.apache.hc.core5.http.ParseException;
import se.michaelthelin.spotify.SpotifyApi;
import se.michaelthelin.spotify.exceptions.SpotifyWebApiException;
import se.michaelthelin.spotify.model_objects.specification.ArtistSimplified;
import se.michaelthelin.spotify.model_objects.specification.Playlist;
import se.michaelthelin.spotify.model_objects.specification.PlaylistTrack;
import se.michaelthelin.spotify.model_objects.specification.Track;
import se.michaelthelin.spotify.requests.data.playlists.GetPlaylistRequest;

import java.io.IOException;
import java.util.Random;

public class SpotifyWrapper {

    private static final String accessToken = SpotifyClientCredentials.clientCredentials();
    private static final String playlistId = new ReadProperties().getProperty("app.SpotifyPlaylistId");
    private static final SpotifyApi spotifyApi = new SpotifyApi.Builder()
            .setAccessToken(accessToken)
            .build();
    private static final GetPlaylistRequest getPlaylistRequest = spotifyApi.getPlaylist(playlistId)
//          .fields("description")
//          .market(CountryCode.SE)
//          .additionalTypes("track,episode")
            .build();
    private final PlaylistTrack[] tracks;
    private String artists;

    public SpotifyWrapper() {
        tracks = getRandomSongOfPlaylist().getTracks().getItems();
    }

    public String[] getRandomSong() {

        Random r = new Random();
        int i = r.nextInt(tracks.length);
        Track t = (Track) tracks[i].getTrack();
        ArtistSimplified[] a = t.getArtists();
        setArtists(a);
        System.out.println(t.getName() + " x " + a[0].getName());
        return new String[]{t.getName(), a[0].getName()};
    }

    public String getArtists() {
        return artists;
    }

    public void setArtists(ArtistSimplified[] a) {
        StringBuilder stringBuilder = new StringBuilder();
        for (ArtistSimplified art : a) {
            stringBuilder.append(art.getName()).append(" x ");
        }
        artists = stringBuilder.deleteCharAt(stringBuilder.length() - 2).toString();
        artists = artists.substring(0, artists.length() - 1);
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
