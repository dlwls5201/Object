package object.chapter10.billing.step05.playlist.step01;

public class PersonalPlaylist extends Playlist {
    public void remove(Song song) {
        getTracks().remove(song);
    }
}