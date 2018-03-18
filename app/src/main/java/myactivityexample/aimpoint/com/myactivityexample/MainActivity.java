package myactivityexample.aimpoint.com.myactivityexample;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText firstNo,secondNo;
    Button showMyContentBtn,showMyGrdBtn;
    Button addBtn,showMyListBtn;
    TextView res,welcomeTV;
    LinearLayout ll;
    Context con;
    AutoCompleteTextView countryNameACTV;
    String []countryNames={"Australia","Austria","India","Pakistan"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        con=this;

        String name =getIntent().getStringExtra("USERNAME");

        firstNo=(EditText) findViewById(R.id.firstNumber);
        secondNo=(EditText)findViewById(R.id.secondNumber);
        addBtn=(Button)findViewById(R.id.addBtn);
        res=(TextView)findViewById(R.id.res);
        ll=(LinearLayout)findViewById(R.id.ll);
        showMyContentBtn=(Button)findViewById(R.id.showMyContentBtn);
        showMyListBtn=(Button)findViewById(R.id.showMyListBtn);
        Button showMySpnBtn=(Button)findViewById(R.id.showMySpnBtn);
        welcomeTV=(TextView)findViewById(R.id.welcomeTV);
        welcomeTV.setText("Welcome "+name+"!!!!!!!");
        showMySpnBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,SpinnerExample.class);
                startActivity(i);
            }
        });
        showMyGrdBtn=(Button)findViewById(R.id.grdViewBtn);
        showMyGrdBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,GridViewActivity.class);
                startActivity(i);
            }
        });
        showMyListBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,MyList.class);
                startActivity(i);
            }
        });
        showMyContentBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,ShowMyContent.class);
                startActivity(i);
            }
        });

        countryNameACTV=(AutoCompleteTextView)findViewById(R.id.countryNameACTV);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(con,android.R.layout.simple_list_item_1,countryNames);

        countryNameACTV.setAdapter(adapter);
        countryNameACTV.setThreshold(1);

//
//        ll.setOnTouchListener(new View.OnTouchListener() {
//            @Override
//            public boolean onTouch(View view, MotionEvent motionEvent) {
//            float x=    motionEvent.getRawX();
//            float y=    motionEvent.getRawY();
//            Toast.makeText(con,"X coord:"+x+"Y coord:"+y,Toast.LENGTH_LONG).show();
//                return false;
//            }
//        });





      //  ll.setBackgroundColor(Color.BLUE);
        //ll.setBackgroundColor(new Color(255,0,0));

        Log.i("MainActivity","I am in onCreate");



        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int no1=Integer.parseInt(firstNo.getText().toString());
                int no2=Integer.parseInt(secondNo.getText().toString());
                int result =no1+no2;
                Log.i("main activity",result+"");
                res.setText(result+"");
            }
        });
        addBtn.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                Toast.makeText(con,"Hi You have long pressed",Toast.LENGTH_LONG).show();
                return false;
            }
        });



    }


      @Override
    public void onStart(){
        super.onStart();
        Log.i("MainActivity","I am in onStart");
      }

    @Override
    public void onResume(){
        super.onResume();
        Log.i("MainActivity","I am in on Resume");
    }
    @Override
    public void onStop(){
        super.onStop();
        Log.i("MainActivity","I am in on Stop");
    }

    @Override
    public void onPause(){
        super.onPause();
        Log.i("MainActivity","I am in on Pause");
    }
    @Override
    public void onRestart(){
        super.onRestart();
        Log.i("MainActivity","I am in on Restart");
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
        Log.i("MainActivity","I am in on Destroy");
    }
}
