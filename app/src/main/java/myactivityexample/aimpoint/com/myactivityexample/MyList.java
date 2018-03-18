package myactivityexample.aimpoint.com.myactivityexample;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MyList extends AppCompatActivity {

    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_list);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        lv =(ListView)findViewById(R.id.myList);

       // ArrayAdapter<String>ar = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,countries);

        ArrayList<Country>cList = new ArrayList<Country>();
        Country c1 = new Country();
        c1.setName("India");
        c1.setFlag(R.drawable.indianflag);
        c1.setDescription("Country of Rivers");
        c1.setPopulation(1250000000);

        Country c2 = new Country();
        c2.setName("Pakistan");
        c2.setFlag(R.drawable.pakflag);
        c2.setDescription("Country of Mosque");
        c2.setPopulation(1250000000);

        Country c3 = new Country();
        c3.setName("Aus");
        c3.setFlag(R.drawable.indianflag);
        c3.setDescription("Countinent");
        c3.setPopulation(1250000000);

        cList.add(c1);
        cList.add(c2);
        cList.add(c3);
        CountryFlagAdapter cf =new CountryFlagAdapter(this,cList);
        lv.setAdapter(cf);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

}
