package in.androidmate.anujgupta.debugutil;

import android.util.Log;

/**
 * Created by anujgupta on 29/12/17.
 */

public class LogDebug {

    private static String TAG = "Awesome-App";

    public static void d(String str){
        Log.d(TAG,str);
    }
}
