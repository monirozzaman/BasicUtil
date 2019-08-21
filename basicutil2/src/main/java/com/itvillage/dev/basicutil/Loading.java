package com.itvillage.dev.basicutil;

import android.app.ProgressDialog;
import android.content.Context;

/**
 * Created by monirozzamanroni on 8/21/2019.
 */

public class Loading {
    ProgressDialog dialog;
    public void start(Context context,String message){
        dialog = new ProgressDialog(context);
        dialog.setMessage(message);
        dialog.setIndeterminate(true);
        dialog.show();
    }
    public void stop(){
        dialog.dismiss();
    }
}
