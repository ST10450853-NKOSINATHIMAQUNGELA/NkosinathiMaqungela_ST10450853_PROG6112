package nkosinathimaqungela_st10450853_prog6112_practical.assignment;


public class Capture {
      //declared variables
    public Capture(String seriesID1, String seriesName1, String seriesAge1, String seriesNumberOfEpisodes) {
    }
    public String seriesID;
    public String seriesName;
    public int seriesAge;
    public int numberOfEpisodes;
    
    public void capturedData(String seriesID, String seriesName, int seriesAge,
            int numberOfEpisodes){
        //stores the users input into variables in the array
        this.seriesID = seriesID;
        this.seriesName = seriesName;
        this.seriesAge = seriesAge;
        this.numberOfEpisodes = numberOfEpisodes;
        
    }
    //set parameters on what can be enetered in the array
    public String getSeriesId() {     
        return seriesID;
    }

    public String getSeriesName() {
        return seriesName;
    }

    public int getSeriesAge() {
        return seriesAge;
    }

    public int getNumberOfEpisodes() {
        return numberOfEpisodes;
    }
    
    public void setSeriesId(String seriesId) {
        this.seriesID = seriesId;
    }

    public void setSeriesName(String seriesName) {
        this.seriesName = seriesName;
    }

    public void setSeriesAge(int seriesAge) {
        this.seriesAge = seriesAge;
    }

    public void setSeriesNumberOfEpisodes(int numberOfEpisodes) {
        this.numberOfEpisodes = numberOfEpisodes;
    }
    
        
        
    
}
