package com.example.gowth.interactivestories.model;

/**
 * Created by gowth on 12/10/2016.
 */

public class page {


    private int mImageid;
    private String  mtext;
    private choice mchoice1;
    private choice mchoice2;
    private boolean misfinal=false;

    public page(int imageid,String text,choice choice1,choice choice2)
    {
        mImageid=imageid;
        mtext=text;
        mchoice1=choice1;
        mchoice2=choice2;

    }
    public page(int imageid,String text)
    {
        mImageid=imageid;
        mtext=text;
        mchoice1=null;
        mchoice2=null;
       misfinal=true;
    }



    public int getmImageid() {
        return mImageid;
    }

    public void setmImageid(int mImageid) {
        this.mImageid = mImageid;
    }

    public String getMtext() {
        return mtext;
    }

    public void setMtext(String mtext) {
        this.mtext = mtext;
    }

    public choice getMchoice1() {
        return mchoice1;
    }

    public void setMchoice1(choice mchoice1) {
        this.mchoice1 = mchoice1;
    }

    public choice getMchoice2() {
        return mchoice2;
    }

    public boolean isMisfinal() {
        return misfinal;
    }

    public void setMisfinal(boolean misfinal) {
        this.misfinal = misfinal;
    }

    public void setMchoice2(choice mchoice2) {
        this.mchoice2 = mchoice2;
    }
}
