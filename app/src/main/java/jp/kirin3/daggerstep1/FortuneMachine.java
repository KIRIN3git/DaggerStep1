package jp.kirin3.daggerstep1;

import java.util.Random;

public class FortuneMachine {
    TwitterClient twitterClient;

    String[] fortunes = {"大吉","中吉","小吉","凶","大凶"};

    public FortuneMachine(){
        // TwiterClientのインスタンスを生成
        twitterClient = new TwitterClient();
    }

    public String checkFortune(){
        int no = getRandomNo();
        twitterClient.postData(fortunes[no]);
        return fortunes[no];
    }

    public int getRandomNo(){
        Random r = new Random();
        int n = r.nextInt(fortunes.length);

        return n;
    }
}
