package com.example2017.android.animalgame;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button donkey,monkey,cat,hen,hourse,elephant,crocodile,dog,rabbit,rat,cheap,cow,lion,graiff,bird;
    public  int select;
    SharedPreferences sh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
/*

        donkey=(Button)findViewById(R.id.donkey);
        monkey=(Button)findViewById(R.id.monkey);
        cat=(Button)findViewById(R.id.cat);
        hen=(Button)findViewById(R.id.hen);
        hourse=(Button)findViewById(R.id.hourse);
        elephant=(Button)findViewById(R.id.elephant);
        crocodile=(Button)findViewById(R.id.crocodile);
        dog=(Button)findViewById(R.id.dog);
        rabbit=(Button)findViewById(R.id.rabbit);
        rat=(Button)findViewById(R.id.rat);
        cheap=(Button)findViewById(R.id.cheap);
        cow=(Button)findViewById(R.id.cow);
        lion=(Button)findViewById(R.id.lion);
        graiff=(Button)findViewById(R.id.graiff);
        bird=(Button)findViewById(R.id.bird);



        donkey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                select=1;

                sh=getSharedPreferences("plz",MODE_PRIVATE);
                SharedPreferences.Editor mydata=sh.edit();
                mydata.putInt("select",select);
                mydata.commit();

                Intent intent=new Intent(MainActivity.this,profile.class);
                startActivity(intent);


            }
        });













*/
    }
}
