package com.yin.permissions;

import android.Manifest;
import android.app.Activity;
import android.util.Log;

import com.yin.permission_request.AsyncPermission;

/**
 * Created by yin on 2017/8/17.
 */

public class Util {
    @AsyncPermission({Manifest.permission.CAMERA})
    public static void afterPermission(Activity activity) {
        Log.e("aaaaaaaaaaaaaa", "afterPermission");
    }
}
