package com.developers.smartytoast;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.developers.smartytoast.R;

/**
 * Created by Amanjeet Singh on 09-May-17.
 */

public class SmartyToast {
    public static final int LENGTH_SHORT=0;
    public static final int LENGTH_LONG=1;

    public static final int DONE=0;
    public static final int WARNING=1;
    public static final int ERROR=2;
    public static final int SAVED=3;
    public static final int CONNECTED=4;
    public static final int UPDATE=5;

    public static Toast makeText(Context context,String msg,int length,int type) {
        Toast toast = new Toast(context);

        switch (type) {
            case 0:{
                View layout = LayoutInflater.from(context).inflate(R.layout.done_layout, null, false);
                TextView text = (TextView) layout.findViewById(R.id.done_message);
                text.setText(msg);
                toast.setView(layout);
                break;
            }
            case 1:{
                View layout=LayoutInflater.from(context).inflate(R.layout.warning_layout,null,false);
                TextView textView= (TextView) layout.findViewById(R.id.warning_message);
                textView.setText(msg);
                toast.setView(layout);
                break;
            }
            case 2:{
                View layout=LayoutInflater.from(context).inflate(R.layout.error_layout,null,false);
                TextView textView= (TextView) layout.findViewById(R.id.error_message);
                textView.setText(msg);
                toast.setView(layout);
                break;
            }
            case 3:{
                View layout=LayoutInflater.from(context).inflate(R.layout.saved_layout,null,false);
                TextView textView= (TextView) layout.findViewById(R.id.saved_message);
                textView.setText(msg);
                toast.setView(layout);
                break;
            }
            case 4:{
                View layout=LayoutInflater.from(context).inflate(R.layout.connected_layout,null,false);
                TextView textView= (TextView) layout.findViewById(R.id.connected_message);
                textView.setText(msg);
                toast.setView(layout);
                break;
            }
            case 5:{
                View layout=LayoutInflater.from(context).inflate(R.layout.updating_layout,null,false);
                TextView textView= (TextView) layout.findViewById(R.id.updating_message);
                textView.setText(msg);
                toast.setView(layout);
                break;
            }
        }
        toast.setDuration(length);
        toast.show();
        return toast;
    }
}
