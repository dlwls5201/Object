package object.chapter09.billing.step05.playlist.step02;

public class PersonalPlaylist extends Playlist {
    public void remove(Song song) {
        getTracks().remove(song);
        getSingers().remove(song.getSinger());
    }
}