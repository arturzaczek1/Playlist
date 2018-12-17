import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;



class PlayListTest {

   @RepeatedTest(100)
//    @Test
    void test1() {
        PlayList playList = new PlayList();
        PlayList playList1 = new PlayList();
        playList.addPlayAble(Music.builder().title("1no.Music").build());
        playList.addPlayAble(Music.builder().title("2no.Music").build());
        playList.addPlayAble(Music.builder().title("3no.Music").build());
        playList1.addPlayAble(Movie.builder().title("Casablanca").build());
        playList1.addPlayAble(Music.builder().title("Rolling Stones").build());
        playList1.setPlayMode(PlayMode.SEQUENTIAL);
        playList.addPlayAble(playList1);
        playList.setPlayMode(PlayMode.SEQUENTIAL);
//        System.out.println(playList.play());
        assertEquals(" Music: 1no.Music Music: 2no.Music Music: 3no.Music Movie: Casablanca Music: Rolling Stones", playList.play());
    }

    //    @RepeatedTest(100)
    @Test
    void ShuffleTest() {
        PlayList playList = new PlayList();
        PlayList playList1 = new PlayList();
        playList.addPlayAble(Music.builder().title("1no.Music").build());
        playList.addPlayAble(Music.builder().title("2no.Music").build());
        playList.addPlayAble(Music.builder().title("3no.Music").build());
        playList1.addPlayAble(Movie.builder().title("Casablanca").build());
        playList1.addPlayAble(Music.builder().title("Rolling Stones").build());
        playList1.setPlayMode(PlayMode.SHUFFLE);
        playList.addPlayAble(playList1);
        playList.setPlayMode(PlayMode.SHUFFLE);
//        System.out.println(playList.play());
        assertNotEquals(" Music: 1no.Music Music: 2no.Music Music: 3no.Music Movie: Casablanca Music: Rolling Stones", playList.play());
    }
    @Test
    void ShuffleTest2() {
        PlayList playList = new PlayList();
        PlayList playList1 = new PlayList();
        playList.addPlayAble(Music.builder().title("1no.Music").build());
        playList.addPlayAble(Music.builder().title("2no.Music").build());
        playList.addPlayAble(Music.builder().title("3no.Music").build());
        playList1.addPlayAble(Movie.builder().title("Casablanca").build());
        playList1.addPlayAble(Music.builder().title("Rolling Stones").build());
        playList1.setPlayMode(PlayMode.SHUFFLE);
        playList.addPlayAble(playList1);
        playList.setPlayMode(PlayMode.SEQUENTIAL);
        System.out.println(playList.play());
//        assertNotEquals(" Music: 1no.Music Music: 2no.Music Music: 3no.Music Movie: Casablanca Music: Rolling Stones", playList.play());
    }
    @Test
    void ShuffleTest3() {
        PlayList playList = new PlayList();
        PlayList playList1 = new PlayList();
        playList.addPlayAble(Music.builder().title("1no.Music").build());
        playList.addPlayAble(Music.builder().title("2no.Music").build());
        playList.addPlayAble(Music.builder().title("3no.Music").build());
        playList1.addPlayAble(Movie.builder().title("Casablanca").build());
        playList1.addPlayAble(Music.builder().title("Rolling Stones").build());
        playList1.setPlayMode(PlayMode.SEQUENTIAL);
        playList.addPlayAble(playList1);
        playList.setPlayMode(PlayMode.SHUFFLE);
        System.out.println(playList.play());
//        assertNotEquals(" Music: 1no.Music Music: 2no.Music Music: 3no.Music Movie: Casablanca Music: Rolling Stones", playList.play());
    }
    @Test
    void testOfStream(){
        PlayList playList = new PlayList();
        PlayList playList1 = new PlayList();
        playList.addPlayAble(Music.builder().title("1no.Music").build());
        playList.addPlayAble(Music.builder().title("2no.Music").build());
        playList.addPlayAble(Music.builder().title("3no.Music").build());
        playList1.addPlayAble(Movie.builder().title("Casablanca").build());
        playList1.addPlayAble(Music.builder().title("Rolling Stones").build());
        playList1.setPlayMode(PlayMode.SEQUENTIAL);
        playList.setPlayMode(PlayMode.SEQUENTIAL);
        System.out.println(playList.play());
    }
}