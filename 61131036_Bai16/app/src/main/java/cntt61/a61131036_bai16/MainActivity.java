package cntt61.a61131036_bai16;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //tạo dữ liệu mảng arr
        final String arr[]=getResources().getStringArray(R.array.myarray);
        //lấy đối tượng trong listview
        ListView lv=(ListView) findViewById(R.id.listview);
        ArrayAdapter<String>adapter=new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, arr);
        // đưa dữ liệu vào listview
        lv.setAdapter(adapter);
        final TextView txt=(TextView) findViewById(R.id.textview);
        //tạo sự kiện khi nhấn vào
        lv.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    public void onItemClick(AdapterView<?> arg0,
                                            View arg1,
                                            int arg2,
                                            long arg3) {
                        txt.setText("position :"+arg2+" ; value ="+arr[arg2]);
                    }
                });
    }
}