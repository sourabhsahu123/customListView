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

public class MyList extends AppCompatActivity {

    ListView lv;
    String []countries = {"India","China","Pakistan"};
    int[]flags ={R.drawable.indianflag,R.drawable.chinaflag,R.drawable.pakflag};

    String []countryDesc={"Country of rivers","testing data","helo "};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_list);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        lv =(ListView)findViewById(R.id.myList);

       // ArrayAdapter<String>ar = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,countries);

        CountryFlagAdapter cf =new CountryFlagAdapter(this,countries,flags,countryDesc);
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
