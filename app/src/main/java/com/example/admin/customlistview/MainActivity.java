package com.example.admin.customlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    public String playerName[]={"Android","Art","Tree","Toy Story","Five","Kool"};
    public String playerDetail[]={"This is how Android toy looks like",
            "Different Mystique art",
            "A Symetric Tree",
            "The Toy Story 4 ",
            "That's how 5 looks on a Graphical scale",
            "I'll let you decide what it is.."};
    public int playerImg[]={
            R.drawable.a,
            R.drawable.b,
            R.drawable.c,
            R.drawable.d,
            R.drawable.e,
            R.drawable.f
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView list=(ListView) findViewById(R.id.listPlayers);
        CustomAdapter customAdapter = new CustomAdapter(this,playerName,playerDetail,playerImg);
        //Toast.makeText(this, "Below Values", Toast.LENGTH_SHORT).show();
        list.setAdapter(customAdapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                // TODO Auto-generated method stub
                String Slecteditem= playerName[+position];
                Toast.makeText(getApplicationContext(), Slecteditem, Toast.LENGTH_SHORT).show();

            }
        });

    }
}
