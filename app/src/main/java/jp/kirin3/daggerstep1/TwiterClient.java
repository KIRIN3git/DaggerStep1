package jp.kirin3.daggerstep1;

import android.util.Log;

public class TwiterClient {


    public TwiterClient(){
    }

    public boolean postTwitter(String fortune){

        // Twitterに通信処理
        Log.w("DEBUG_DATA","postTwitter " + fortune);

        return true;
    }
}
