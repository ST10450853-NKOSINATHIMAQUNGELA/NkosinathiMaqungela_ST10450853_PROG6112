/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package nkosinathimaqungela_st10450853_prog6112_practical.assignment;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author maqun
 */
public class CaptureTest {
    
    public CaptureTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of capturedData method, of class Capture.
     */
    @Test
    public void testCapturedData() {
        System.out.println("capturedData");
        String seriesID = "";
        String seriesName = "";
        int seriesAge = 0;
        int numberOfEpisodes = 0;
        Capture instance = null;
        instance.capturedData(seriesID, seriesName, seriesAge, numberOfEpisodes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSeriesId method, of class Capture.
     */
    @Test
    public void testGetSeriesId() {
        System.out.println("getSeriesId");
        Capture instance = null;
        String expResult = "";
        String result = instance.getSeriesId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSeriesName method, of class Capture.
     */
    @Test
    public void testGetSeriesName() {
        System.out.println("getSeriesName");
        Capture instance = null;
        String expResult = "";
        String result = instance.getSeriesName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSeriesAge method, of class Capture.
     */
    @Test
    public void testGetSeriesAge() {
        System.out.println("getSeriesAge");
        Capture instance = null;
        int expResult = 0;
        int result = instance.getSeriesAge();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumberOfEpisodes method, of class Capture.
     */
    @Test
    public void testGetNumberOfEpisodes() {
        System.out.println("getNumberOfEpisodes");
        Capture instance = null;
        int expResult = 0;
        int result = instance.getNumberOfEpisodes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSeriesId method, of class Capture.
     */
    @Test
    public void testSetSeriesId() {
        System.out.println("setSeriesId");
        String seriesId = "";
        Capture instance = null;
        instance.setSeriesId(seriesId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSeriesName method, of class Capture.
     */
    @Test
    public void testSetSeriesName() {
        System.out.println("setSeriesName");
        String seriesName = "";
        Capture instance = null;
        instance.setSeriesName(seriesName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSeriesAge method, of class Capture.
     */
    @Test
    public void testSetSeriesAge() {
        System.out.println("setSeriesAge");
        int seriesAge = 0;
        Capture instance = null;
        instance.setSeriesAge(seriesAge);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSeriesNumberOfEpisodes method, of class Capture.
     */
    @Test
    public void testSetSeriesNumberOfEpisodes() {
        System.out.println("setSeriesNumberOfEpisodes");
        int numberOfEpisodes = 0;
        Capture instance = null;
        instance.setSeriesNumberOfEpisodes(numberOfEpisodes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
