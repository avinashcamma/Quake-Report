package com.example.android.quakereport;

import android.content.AsyncTaskLoader;
import android.content.Context;
import android.util.Log;

import java.util.List;

/**
 * Created by Ankit on 1/2/2017.
 */
/*Loads the list of earthquakes by using AsyncTask To Perform
        Netork Request to the given Url on background Thread
 */
public class EarthquakeLoader extends AsyncTaskLoader<List<Earthquake>> {

    /*Log Tag for Messages*/
    private static final String LOG_TAG = EarthquakeLoader.class.getName();


    /**
     * Query Url
     */
    private String mUrl = null;


    /**
     * Constructs a new {@link EarthquakeLoader}
     *
     * @param context of the activity
     * @param url     to load data
     */
    public EarthquakeLoader(Context context, String url) {
        super(context);
        this.mUrl = url;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }


    /**
     * This is on a background thread.
     */
    @Override
    public List<Earthquake> loadInBackground() {
        if (mUrl == null) {
            return null;
        }
        Log.d(LOG_TAG,"Loader InBackground");

        //Perform the network request, parse the response, and extract a list of earthquakes.
        List<Earthquake> earthquakeList = QueryUtils.fetchEarthquakeData(mUrl);
        return earthquakeList;
    }


}
