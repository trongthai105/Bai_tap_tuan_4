package cntt61.a61131036_bai19;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ListView lvProgram;
    String[] programName = {"Hà nội","Huế","Spa","Côn sơn","Vũng tàu","Đà nẵng"};
    int[] programImages = {R.drawable.e, R.drawable.s,R.drawable.s,R.drawable.e,R.drawable.e,R.drawable.e};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView txt=(TextView) findViewById(R.id.textview);
        // Get the handle for ListView
        lvProgram = findViewById(R.id.list);
        // Specify an adapter and pass context along with all the arrays in constructor
        ProgramAdapter programAdapter = new ProgramAdapter(this, programName, programImages);
        lvProgram.setAdapter(programAdapter);
        lvProgram.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    public void onItemClick(AdapterView<?> arg0,
                                            View arg1,
                                            int arg2,
                                            long arg3) {
                        txt.setText(programName[arg2]);
                    }
                });

    }
}