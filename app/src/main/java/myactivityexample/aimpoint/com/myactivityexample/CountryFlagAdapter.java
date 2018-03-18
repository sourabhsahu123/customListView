package myactivityexample.aimpoint.com.myactivityexample;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by pc on 17-03-2018.
 */

public class CountryFlagAdapter extends BaseAdapter {

    Context con;
    ArrayList<Country> countryList;
    public CountryFlagAdapter(Context c ,ArrayList<Country>cList)
    {
        con=c;
        countryList=cList;
    }

    @Override
    public int getCount() {
        return countryList.size();
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
        TextView counDTV =v.findViewById(R.id.txtDescTV);
        TextView popTV =v.findViewById(R.id.popTV);
        Country c = countryList.get(i);
        counDTV.setText(c.getDescription());
        iv.setImageDrawable(con.getResources().getDrawable(c.getFlag()));
        counTV.setText(c.getName());
        popTV.setText(c.getPopulation()+"");
        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(con,"You have clicked list view item",Toast.LENGTH_LONG).show();
            }
        });

        return v;
    }
}
