package cntt61.a61131036_bai17;

import java.util.ArrayList;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends Activity {
    EditText edTen;
    TextView tvXem;
    Button btn;
    ListView lv;
    ArrayList<String>arrList=null;
    ArrayAdapter<String> adapter=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edTen=(EditText) findViewById(R.id.edTen);
        tvXem=(TextView) findViewById(R.id.tvXem);

        lv=(ListView) findViewById(R.id.listview);
        // Tạo ArrayList
        arrList=new ArrayList<String>();
        // Gán dữ liệu của ArrayList object vào ArrayAdapter
        adapter=new ArrayAdapter<String>
                (this,
                        android.R.layout.simple_list_item_1,
                        arrList);
        lv.setAdapter(adapter);

        btn=(Button) findViewById(R.id.btnNhap);
        // sự kiện nhấn nút Nhập
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                arrList.add(edTen.getText()+"");
                adapter.notifyDataSetChanged();
            }
        });
        // sự kiện chọn tên trong listview
        lv.setOnItemClickListener(new AdapterView
                .OnItemClickListener() {
            public void onItemClick(
                    AdapterView<?> arg0,View arg1,
                    int arg2,long arg3) {
                tvXem.setText("position : "+ arg2+
                        "; value ="+arrList.get(arg2));
            }
        });
    }
}