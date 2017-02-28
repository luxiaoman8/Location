package com.example.xiaoman;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by luxia on 2017/2/10.
 */

public class Util {
    private static Toast toast;

    public static void showToast(Context context, String content) {
        if (toast == null) {
            toast = Toast.makeText(context, content, Toast.LENGTH_SHORT);
        } else {
            toast.setText(content);
            toast.show();
        }
    }
}
