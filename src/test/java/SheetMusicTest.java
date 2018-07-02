import Items.SheetMusic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {

    SheetMusic sheetMusic;

    @Before
    public void setUp(){
        sheetMusic = new SheetMusic("Rock", 12.00, 14.00, "The Beatles", "Play like The Beatles", "1966");
    }

    @Test
    public void hasType() {
        assertEquals("Rock", sheetMusic.getType());
    }

    @Test
    public void hasBuyingPrice() {
        assertEquals(12.00, sheetMusic.getBuyingPrice(), 0.01);
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(14.00, sheetMusic.getSellingPrice(), 0.01);
    }

    @Test
    public void hasAuthor(){
        assertEquals("The Beatles", sheetMusic.getAuthor());
    }

    @Test
    public void hasTitle() {
        assertEquals("Play like The Beatles", sheetMusic.getTitle());
    }

    @Test
    public void hasPublishingYear() {
        assertEquals("1966", sheetMusic.getPublishingYear());
    }

    @Test
    public void canCalculateMarkUp() {
        assertEquals(2.00, sheetMusic.calculateMarkUp(), 0.01);
    }
}
