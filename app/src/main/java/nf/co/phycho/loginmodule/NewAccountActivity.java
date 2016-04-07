package nf.co.phycho.loginmodule;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;

public class NewAccountActivity extends AppCompatActivity {
EditText metName,metPassword,metconfPassword,metEmail,metPhone;
    Button mBtnCreate;
    RelativeLayout rl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_account);
    }
}
