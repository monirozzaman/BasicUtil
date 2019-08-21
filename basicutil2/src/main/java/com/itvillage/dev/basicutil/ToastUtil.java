package com.itvillage.dev.basicutil;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by monirozzamanroni on 8/21/2019.
 */

public class ToastUtil {
    public static void show(Context context,String message)
    {
        Toast.makeText(context,message,Toast.LENGTH_SHORT).show();
    }

}
