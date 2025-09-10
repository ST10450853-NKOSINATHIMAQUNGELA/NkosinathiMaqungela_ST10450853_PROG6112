package SectionA;

import java.util.ArrayList;


public class Capture {
      //declared variables
    public Capture(String SeriesID1, String SeriesName1, String SeriesAge1,
            String SeriesNumberOfEpisodes1, Object par4) {
    }
    public String SeriesID;
    public String SeriesName;
    public String SeriesAge;
    public String SeriesNumberOfEpisodes;

    Capture(String SeriesID, String SeriesName, String SeriesAge, String
            SeriesNumberOfEpisodes) {
       ArrayList<Capture> seriesList = new ArrayList<>();
    }
    
    public void capturedData(){
        //stores the users input into variables in the array
        this.SeriesID = SeriesID;
        this.SeriesName = SeriesName;
        this.SeriesAge = SeriesAge;
        this.SeriesNumberOfEpisodes = SeriesNumberOfEpisodes;
        
    }
    //set parameters on what can be enetered in the array
    public String getSeriesId() {     
        return SeriesID;
    }

    public String getSeriesName() {
        return SeriesName;
    }

    public String getSeriesAge() {
        return SeriesAge;
    }

    public String getNumberOfEpisodes() {
        return SeriesNumberOfEpisodes;
    }
    
    public void setSeriesId(String seriesId) {
        this.SeriesID = SeriesID;
    }

    public void setSeriesName(String seriesName) {
        this.SeriesName = SeriesName;
    }

    public void setSeriesAge(String seriesAge) {
        this.SeriesAge = SeriesAge;
    }

    public void setSeriesNumberOfEpisodes(String numberOfEpisodes) {
        this.SeriesNumberOfEpisodes = SeriesNumberOfEpisodes;
    }
    
        
        
    
}
