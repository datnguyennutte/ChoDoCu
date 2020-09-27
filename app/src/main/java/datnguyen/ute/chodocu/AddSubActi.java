package datnguyen.ute.chodocu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.*;
import android.widget.*;

import java.util.ArrayList;

public class AddSubActi extends AppCompatActivity {
    ArrayList<String> Subject;
    ListView lvSubject;
    Button btnAdd;
    EditText eAdd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_sub);
        ArrayList Subject = new ArrayList<>();
        anhXa();
        loadSubject();
        addToListview();

    }
    public void anhXa(){
        lvSubject = (ListView) findViewById(R.id.lvSubject);
        btnAdd = (Button) findViewById(R.id.btnAdd);
        eAdd = (EditText) findViewById(R.id.eAdd);


    }

    public void loadSubject(){
        Subject.add("Toán");
        Subject.add("Tiếng Việt");
        Subject.add("Đạo đức");
        Subject.add("Tự nhiên và Xã hội");
        Subject.add("Lịch sử");
        Subject.add("Địa lý");
        Subject.add("Tiếng Anh");
    }
    public void addSubject(){

    }
    public void addToListview(){
        addSubject();
        ArrayAdapter adapter = new ArrayAdapter(AddSubActi.this, android.R.layout.simple_list_item_1, Subject);
        lvSubject.setAdapter(adapter);
    }

}