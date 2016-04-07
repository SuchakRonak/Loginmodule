package nf.co.phycho.loginmodule;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.RelativeLayout;

public class VerificationActivity extends AppCompatActivity {
EditText mCode;
    RelativeLayout rl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verification);
        rl= (RelativeLayout) findViewById(R.id.layout_verify);
        rl.setBackgroundResource(R.drawable.bg_login_wall);

    }
}
