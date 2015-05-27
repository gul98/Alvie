package com.javaorigin.test.apk;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by gul on 5/27/15.
 */
public class BlockSepcific extends Activity implements android.view.View.OnClickListener {
    EditText edit;
    Button ok;
    Button button;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        //final EditText edittext = (EditText) findViewById(R.id.edittext);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.block_specific_contact);


        edit=(EditText)findViewById(R.id.editText);
        button=(Button)findViewById(R.id.button2);
        ok=(Button)findViewById(R.id.button3);
        button.setOnClickListener( this);
        ok.setOnClickListener(this);
    }

    public void onClick(View v){
        if(v.getId()==R.id.button2){}
        if(v.getId()==R.id.button3){
            String number=edit.getText().toString();
            Anonymous c1= new Anonymous(number);
            Log.d("Approach","Approaching database");
            DatabaseHandler db=new DatabaseHandler(this);
            db.addContact(c1);
            Log.d("New contact", c1.getName() +  c1.getPhoneNumber());
            finish();



        }
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


}
