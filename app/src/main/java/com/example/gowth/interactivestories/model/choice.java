package com.example.gowth.interactivestories.model;

/**
 * Created by gowth on 12/10/2016.
 */

public class choice {


    private String mtext;
    private int mnextpage;

    public choice(String text,int nextpage){
        mtext=text;
        mnextpage=nextpage;

    }

    public String getMtext() {
        return mtext;
    }

    public void setMtext(String mtext) {
        this.mtext = mtext;
    }

    public int getMnextpage() {
        return mnextpage;
    }

    public void setMnextpage(int mnextpage) {
        this.mnextpage = mnextpage;
    }
}
