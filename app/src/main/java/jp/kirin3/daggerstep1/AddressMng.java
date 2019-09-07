package jp.kirin3.daggerstep1;

import android.util.Log;

import java.util.Random;

public class AddressMng {
    PostClient postClient;

    String office;

    Integer post_no[] = {101,102,103};

    public AddressMng(){

    }

    public String getPostOffice(){
        postClient = new PostClient();
        office = postClient.GetPostOffice(post_no[getRandomNo()]);
        Log.w( "DEBUG_DATA", "office=" + office);
        return office;
    }

    public int getRandomNo(){
        Random r = new Random();
        int n = r.nextInt(3);

        return n;
    }
}
