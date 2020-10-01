package datnguyen.ute.chodocu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ProfileAccount extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_account);
    }

    public void backLogin(View view) {
        Intent intent = new Intent(this,LoginActivity.class);
        startActivity(intent);
    }
}