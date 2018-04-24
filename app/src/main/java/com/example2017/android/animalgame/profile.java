package com.example2017.android.animalgame;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class profile extends AppCompatActivity {
int images[];
    int selectOfImages;
    SharedPreferences sh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);



        sh=getSharedPreferences("plz",MODE_PRIVATE);
        selectOfImages= sh.getInt("select",0);
        Toast.makeText(getApplicationContext(),String.valueOf(selectOfImages),Toast.LENGTH_LONG).show();


        /*
        images= new int[]{R.drawable.donkey, R.drawable.monkey, R.drawable.cat,
                R.drawable.hen, R.drawable.hourse,R.drawable.elephant
                , R.drawable.crocodile, R.drawable.dog, R.drawable.rabbit
                , R.drawable.rat, R.drawable.cheap, R.drawable.cow
                , R.drawable.lion, R.drawable.graiff, R.drawable.bird

        };
*/





    }
}
