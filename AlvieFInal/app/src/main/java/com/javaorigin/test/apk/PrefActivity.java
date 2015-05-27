package com.javaorigin.test.apk;

import android.app.ActionBar;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.CheckBoxPreference;
import android.preference.Preference;
import android.preference.PreferenceActivity;
import android.provider.MediaStore;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;


public class PrefActivity extends Activity implements  android.view.View.OnClickListener{
    CheckBox check;
    Button btn;
    String blocked;
    @Override

    public void onCreate(Bundle savedInstanceState) {
        //final EditText edittext = (EditText) findViewById(R.id.edittext);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        check = (CheckBox)findViewById(R.id.checkBox);
        btn = (Button)findViewById(R.id.button);


        btn.setOnClickListener(this);

    }

    @Override

    public void onClick(View v){

        if(check.isChecked()){
            Toast toast = Toast.makeText(this, "Please Uncheck The Radio Button", Toast.LENGTH_LONG);
            toast.show();
        }
        else {

            Intent intent = new Intent(this, BlockSepcific.class);
            intent.putExtra("Radio", blocked);
            startActivity(intent);
        }



    }


    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


    /*protected void onStart() {
        super.onStart();

        //getPrefs();
    }

    /*private void getPrefs() {
        // we need to show the user's existing prefs, this isn't done
        // automatically by the activity
        SharedPreferences myprefs = getSharedPreferences("myBlocker", 0);

        ((CheckBoxPreference) findPreference("blockCalls")).setChecked(myprefs.getBoolean("blockCalls", false));


    }*/
}
