package cntt61.a61131036_bai19;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

public class ProgramAdapter extends ArrayAdapter<String> {
    Context context;
    int[] images;
    String[] programName;


    //String[] urls;

    public ProgramAdapter(Context context, String[] programName, int[] images) {
        super(context, R.layout.mylist, R.id.textView1, programName);
        this.context = context;
        this.images = images;
        this.programName = programName;

    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        View singleItem = convertView;

        ProgramViewHolder holder = null;

        if(singleItem == null){
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            singleItem = layoutInflater.inflate(R.layout.mylist, parent, false);

            holder = new ProgramViewHolder(singleItem);

            singleItem.setTag(holder);
        }

        else{

            holder = (ProgramViewHolder) singleItem.getTag();
        }
        // Set the values for your views in your item by accessing them through the holder
        holder.itemImage.setImageResource(images[position]);
        holder.programTitle.setText(programName[position]);
        return singleItem;
    }
}