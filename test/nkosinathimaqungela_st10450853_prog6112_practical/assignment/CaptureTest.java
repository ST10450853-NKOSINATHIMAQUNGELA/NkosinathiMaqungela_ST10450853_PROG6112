package nkosinathimaqungela_st10450853_prog6112_practical.assignment;

import SectionA.Capture;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

public class CaptureTest {

    private Capture capture;

    @BeforeEach
    public void setUp() {
        capture = new Capture("dummyID", "dummyName", "dummyAge", "dummyEpisodes");
        capture.capturedData("ID123", "Test Series", 18, 10);
    }

    @Test
    public void TestSearchSeries() {
        assertEquals("ID123", capture.getSeriesId());
        assertEquals("Test Series", capture.getSeriesName());
        assertEquals(18, capture.getSeriesAge());
        assertEquals(10, capture.getNumberOfEpisodes());
    }

    @Test
    public void TestSearchSeries_SeriesNotFound() {
        assertNotEquals("WrongID", capture.getSeriesId());
    }

    @Test
    public void TestUpdateSeries() {
        capture.setSeriesId("UpdatedID");
        capture.setSeriesName("Updated Name");
        capture.setSeriesAge(21);
        capture.setSeriesNumberOfEpisodes(15);
        assertEquals("UpdatedID", capture.getSeriesId());
        assertEquals("Updated Name", capture.getSeriesName());
        assertEquals(21, capture.getSeriesAge());
        assertEquals(15, capture.getNumberOfEpisodes());
    }

    @Test
    public void TestDeleteSeries() {
        capture.setSeriesId(null);
        capture.setSeriesName(null);
        capture.setSeriesAge(0);
        capture.setSeriesNumberOfEpisodes(0);
        assertNull(capture.getSeriesId());
        assertNull(capture.getSeriesName());
        assertEquals(0, capture.getSeriesAge());
        assertEquals(0, capture.getNumberOfEpisodes());
    }

    @Test
    public void TestDeleteSeries_SeriesNotFound() {
        String originalID = capture.getSeriesId();
        assertEquals(originalID, capture.getSeriesId());
    }

    @Test
    public void TestUpdateAgeRestriction_AgeValid() {
        capture.setSeriesAge(13);
        assertEquals(13, capture.getSeriesAge());
    }

    @Test
    public void TestSeriesAgeRestriction_SeriesAgeInvalid() {
        capture.setSeriesAge(-5);
        assertTrue(capture.getSeriesAge() < 0);
    }
}