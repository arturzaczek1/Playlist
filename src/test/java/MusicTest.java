import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class MusicTest {
    @Test
    public void shouldPrintMusicName() {
        System.out.println(Music.builder().title("Rolling Stones").build().play());
    }

    @Test
    public void musicTest() {
        assertEquals(" Music: Rolling Stones", Music.builder().title("Rolling Stones").build().play());
    }
}