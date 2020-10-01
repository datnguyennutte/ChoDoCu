package datnguyen.ute.chodocu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class SignUp extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

    }

    public void login(View view) {
    }

    public void backLogin(View view) {
        Intent intent = new Intent(this,LoginActivity.class);
        startActivity(intent);
    }
}