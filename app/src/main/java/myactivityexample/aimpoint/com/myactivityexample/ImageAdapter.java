package myactivityexample.aimpoint.com.myactivityexample;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * Created by pc on 18-03-2018.
 */

public class ImageAdapter extends BaseAdapter {

    int []myImages;
    Context con;
    public ImageAdapter(Context c,int []imgs)
    {
        myImages=imgs;
        con=c;
    }

    @Override
    public int getCount() {
        return myImages.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        ImageView iv = new ImageView(con);
        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(con,"You have clicked the flag",Toast.LENGTH_LONG).show();
            }
        });
        iv.setImageDrawable(con.getResources().getDrawable(myImages[i]));

        return iv;
    }
}
