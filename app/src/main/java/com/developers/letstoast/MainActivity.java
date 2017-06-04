package com.developers.letstoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.developers.smartytoast.SmartyToast;

public class MainActivity extends AppCompatActivity {

    private Button doneButton,errorButton,warningButton,savedButton,connectedButton,updatingButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        doneButton= (Button) findViewById(R.id.done);
        errorButton= (Button) findViewById(R.id.error);
        warningButton= (Button) findViewById(R.id.warning);
        savedButton= (Button) findViewById(R.id.saved);
        connectedButton= (Button) findViewById(R.id.connected);
        updatingButton= (Button) findViewById(R.id.update);
        doneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SmartyToast.makeText(getApplicationContext(),"Done!!",SmartyToast.LENGTH_SHORT,SmartyToast.DONE);
            }
        });
        errorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SmartyToast.makeText(getApplicationContext(),"Error!!",SmartyToast.LENGTH_SHORT,SmartyToast.ERROR);
            }
        });
        warningButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SmartyToast.makeText(getApplicationContext(),"Warning!!",SmartyToast.LENGTH_SHORT,SmartyToast.WARNING);
            }
        });
        savedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SmartyToast.makeText(getApplicationContext(),"Saved..!!",SmartyToast.LENGTH_SHORT,SmartyToast.SAVED);
            }
        });
        connectedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SmartyToast.makeText(getApplicationContext(),"Connection Established!!",SmartyToast.LENGTH_SHORT,SmartyToast.CONNECTED);
            }
        });
        updatingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SmartyToast.makeText(getApplicationContext(),"Updating...",SmartyToast.LENGTH_SHORT,SmartyToast.UPDATE);
            }
        });

    }
}
