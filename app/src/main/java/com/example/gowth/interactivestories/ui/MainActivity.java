package com.example.gowth.interactivestories.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.gowth.interactivestories.R;

public class MainActivity extends AppCompatActivity {

    private EditText medittext;
    private Button mshowbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        medittext= (EditText) findViewById(R.id.nameedittext);
        mshowbutton= (Button) findViewById(R.id.showbutton);


        mshowbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name=medittext.getText().toString();
           /*     Toast.makeText(MainActivity.this,name,Toast.LENGTH_LONG).show();*/

                StoryBoard(name);

            }
        });

    }
    private void StoryBoard(String name)
    {
        Intent i=new Intent(this,StoryActivity.class);

        i.putExtra(getString(R.string.key_name),name);
        startActivity(i);
    }

    @Override
    protected void onResume() {
        super.onResume();
        medittext.setText("");

    }
}
