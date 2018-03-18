package myactivityexample.aimpoint.com.myactivityexample;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.GridView;

public class GridViewActivity extends AppCompatActivity {



    int[]flags ={R.drawable.indianflag,R.drawable.chinaflag,R.drawable.pakflag,R.drawable.indianflag,R.drawable.chinaflag,R.drawable.pakflag,R.drawable.indianflag,R.drawable.chinaflag,R.drawable.pakflag};
    GridView grdView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        grdView=(GridView)findViewById(R.id.grdView);
        ImageAdapter ia = new ImageAdapter(this,flags);
        grdView.setAdapter(ia);

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
