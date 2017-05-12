package com.example.hemaladani.photogallery;

import android.content.Context;
import android.preference.PreferenceManager;

/**
 * Created by hemaladani on 5/5/17.
 */

public class QueryPreferences {
    private static final String PREF_SEARCH_QUERY="searchQuery";
    private static final String PREF_LAST_RESULT_ID="lastResultId";

    public static void setLastResultId(Context context, String lastResultId) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putString(PREF_LAST_RESULT_ID,lastResultId).apply();

    }

    public static String getPrefLastResultId(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getString(PREF_LAST_RESULT_ID,null);
    }

    public static String getStoredQuery(Context context){
        return PreferenceManager.getDefaultSharedPreferences(context).getString(PREF_SEARCH_QUERY,null);
    }
    public static void setStoredQuery(Context context,String query){
        PreferenceManager.getDefaultSharedPreferences(context).edit().putString(PREF_SEARCH_QUERY,query).apply();

    }

}
