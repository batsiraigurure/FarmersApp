package gapps.com.farmersapp.Weather;

/**
 * Created by Dell on 6/6/2017.
 */

public class Day {
    private String mSummary;
    private double mTemperatureMax;
    private String mIcon;

    public String getSummary() {
        return mSummary;
    }

    public void setSummary(String summary) {
        mSummary = summary;
    }

    public double getTemperatureMax() {
        return mTemperatureMax;
    }

    public void setTemperatureMax(double temperatureMax) {
        mTemperatureMax = temperatureMax;
    }

    public String getIcon() {
        return mIcon;
    }

    public void setIcon(String icon) {
        mIcon = icon;
    }


}
