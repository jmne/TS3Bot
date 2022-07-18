package net.server.spotify;

import net.server.utils.ReadProperties;
import org.jmusixmatch.MusixMatch;
import org.jmusixmatch.MusixMatchException;
import org.jmusixmatch.entity.lyrics.Lyrics;
import org.jmusixmatch.entity.track.Track;
import org.jmusixmatch.entity.track.TrackData;

import java.util.Arrays;
import java.util.Random;

public class ResolveLyrics {

    private static final ReadProperties prop = new ReadProperties();
    final MusixMatch match;
    String[] lines;

    public ResolveLyrics(String songName, String songArtist) throws MusixMatchException {
        match = new MusixMatch(prop.getProperty("app.MusicMatchAPISecret"));

        lines = Arrays.stream(getLyrics(getID(songName, songArtist)).getLyricsBody().split("\\r?\\n")).filter(x -> !x.isEmpty()).toArray(String[]::new);

        System.out.println(getLyrics(getID(songName, songArtist)).getLyricsBody());
        System.out.println(getID(songName, songArtist));
    }

    public String getRandomLine() {
        Random r = new Random();
        int i = r.nextInt(lines.length - 3);
        if (i == 0) return lines[0] + "\n" + lines[1];
        if ((i + 1 & 1) == 0) {
            return lines[i - 1] + "\n" + lines[i];
        } else {
            return lines[i] + "\n" + lines[i + 1];
        }

    }

    public int getID(String songName, String songArtist) throws MusixMatchException {

        Track track = match.getMatchingTrack(songName, songArtist);
        TrackData data = track.getTrack();

        return data.getTrackId();
    }

    public Lyrics getLyrics(int iD) throws MusixMatchException {
        try {
            return match.getLyrics(iD);
        } catch (Exception e) {
            return match.getLyrics(Integer.getInteger(prop.getProperty("app.MusicMatchFallbackSong")));
        }
    }

}
