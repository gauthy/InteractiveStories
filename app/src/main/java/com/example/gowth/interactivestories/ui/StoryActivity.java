package com.example.gowth.interactivestories.ui;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.gowth.interactivestories.R;
import com.example.gowth.interactivestories.model.page;
import com.example.gowth.interactivestories.model.story;

public class StoryActivity extends AppCompatActivity {

   private ImageView mimageview;
    private TextView mtextview;
    private Button mchoice1;
    private  Button mchoice2;
    private String mname;
    private page pg;
    private story mstory=new story();
    public static  final String TAG=StoryActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);

        Intent intent=getIntent();
        mname=intent.getStringExtra(getString(R.string.key_name));

        Log.d(TAG,mname);

        mimageview= (ImageView) findViewById(R.id.storyimageView);
        mtextview= (TextView) findViewById(R.id.storytextView);
        mchoice1= (Button) findViewById(R.id.choice1);
        mchoice2= (Button) findViewById(R.id.choice2);
        loadpage(0);
    }


    private void loadpage(int choice){
         pg=mstory.getpage(choice);
       // Resources res = getResources();
        Drawable drawable = ResourcesCompat.getDrawable(getResources(),pg.getmImageid(), null);
        mimageview.setImageDrawable(drawable);

        String pagetext=pg.getMtext();
        pagetext=String.format(pagetext,mname);
        mtextview.setText(pagetext);


        if(pg.isMisfinal())
        {
           mchoice1.setVisibility(View.INVISIBLE);

           mchoice2.setText("PLAY AGAIN");
            mchoice2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    finish();
                }
            });

        }
        else {

            mchoice1.setText(pg.getMchoice1().getMtext());
            mchoice2.setText(pg.getMchoice2().getMtext());

            mchoice1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int nxtpage = pg.getMchoice1().getMnextpage();
                    loadpage(nxtpage);
                }
            });

            mchoice2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int nxtpage = pg.getMchoice1().getMnextpage();
                    loadpage(nxtpage);
                }
            });

        }

    }
}
