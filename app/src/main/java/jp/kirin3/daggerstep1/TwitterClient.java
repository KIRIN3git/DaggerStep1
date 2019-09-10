package jp.kirin3.daggerstep1;

import android.util.Log;

public class TwitterClient {


    public TwitterClient(){
    }

    public boolean postData(String fortune){

        // Twitterに通信処理
        Log.w("DEBUG_DATA","postData " + fortune);

        return true;
    }
}
