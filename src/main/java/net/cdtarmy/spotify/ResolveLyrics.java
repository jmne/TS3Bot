package net.cdtarmy.spotify;

import org.jmusixmatch.MusixMatch;
import org.jmusixmatch.MusixMatchException;
import org.jmusixmatch.entity.lyrics.Lyrics;
import org.jmusixmatch.entity.track.Track;
import org.jmusixmatch.entity.track.TrackData;

import java.util.Random;

public class ResolveLyrics {

    MusixMatch match;
    String[] lines;

    public ResolveLyrics(String songName, String songArtist) throws MusixMatchException {
        match = new MusixMatch("44848e90e6e0e22696010187d51d2ad2");
        lines = getLyrics(getID(songName, songArtist)).getLyricsBody().split("\\r?\\n");
    }

    public String getRandomLine() {
        Random r = new Random();
        int i = r.nextInt((int) Math.floor(lines.length / 2));
        return lines[i * 2 - 1] + "\n" + lines[i * 2];
    }

    public int getID(String songName, String songArtist) throws MusixMatchException {

        Track track = match.getMatchingTrack(songName, songArtist);
        TrackData data = track.getTrack();

        return data.getTrackId();
    }

    public Lyrics getLyrics(int iD) throws MusixMatchException {
        return match.getLyrics(iD);
    }

}
