package myactivityexample.aimpoint.com.myactivityexample;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by pc on 17-03-2018.
 */

public class CountryFlagAdapter extends BaseAdapter {

    String[]countries;
    int[]flags;
    Context con;
    public CountryFlagAdapter(Context c ,String[]coun,int[]f)
    {
        con=c;
        countries=coun;
        flags=f;
    }

    @Override
    public int getCount() {
        return countries.length;
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

        LayoutInflater li =LayoutInflater.from(con);

        View v = li.inflate(R.layout.row_view,null);
        ImageView iv =v.findViewById(R.id.myFlagImageView);
        TextView counTV = v.findViewById(R.id.countryTV);
        iv.setImageDrawable(con.getResources().getDrawable(flags[i]));
        counTV.setText(countries[i]);

        return v;
    }
}
