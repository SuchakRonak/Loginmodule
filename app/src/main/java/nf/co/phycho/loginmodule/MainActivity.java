package nf.co.phycho.loginmodule;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
EditText mEtEmail,mEtPassword;
    Button mSignIn,mOnData,mOnWIFI;
    RelativeLayout rl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Dialog d = new Dialog(MainActivity.this);

        d.setContentView(R.layout.activity_connection_failed_dilog);
        d.setTitle("Connection Failed");
        mOnData = (Button) findViewById(R.id.BTN_on_DATA);
        mOnWIFI = (Button) findViewById(R.id.BTN_on_WIFI);
        d.show();

        rl = (RelativeLayout) findViewById(R.id.mainLayout);
        rl.setBackgroundResource(R.drawable.bg_login_wall);

    }
    public  boolean isNetworkAvail(){
        Log.d("nf.co.phycho.loginmodul","in isNetworkAvail");
        ConnectivityManager connMgr = (ConnectivityManager)
                getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();
        if (networkInfo != null && networkInfo.isConnected()) {
            Log.d("nf.co.phycho.loginmodul","Connection is Availble");
            return true;
        } else {
            Log.d("nf.co.phycho.loginmodul", "IN else Conn failed");


            return false;
        }
    }
    public void onSignIn(View v){

        if(isNetworkAvail()){
            // TODO: 4/1/2016  Asynk task and Database user fatch with PHP
            Intent intent_verify = new Intent(MainActivity.this,VerificationActivity.class);
            startActivity(intent_verify);
        }

    }
    public void onNewAccount(View v){
        if(isNetworkAvail()){
            // TODO: 4/1/2016  Asynk task and Database user create with PHP
            Intent intent_new = new Intent(MainActivity.this,NewAccountActivity.class);
            startActivity(intent_new);
        }
    }
}
