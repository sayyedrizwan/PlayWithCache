package com.sayyedrizwan.playwithcache;

/*
Copyright 202 Rizwan Sayyed(sayyed rizwan)
 */
import android.content.Context;
import android.util.Log;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.File;
import java.io.IOException;
import java.net.CacheRequest;

import static android.content.ContentValues.TAG;

public class PlayCache {


    public static CacheRequest cleanCache(Context context) {
        try {
            File dir = context.getCacheDir();
            cleandirectory(dir);
        } catch (Exception e) {
            Log.i(TAG, "cleanCache: " + e.getMessage());
        }

        return null;
    }


    public static CacheRequest cleanCachewithMessage(Context context, String message) {
        try {
            File dir = context.getCacheDir();
            cleandirectory(dir);

            if (message.isEmpty()) {
                message = "Cache clean successfully";
            }

            Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
        } catch (Exception e) {
            Log.i(TAG, "cleanCache: " + e.getMessage());
        }

        return null;
    }

    public static CacheRequest clearAppData(Context context) {
        File cache = context.getCacheDir();
        File appDir = new File(cache.getParent());
        if (appDir.exists()) {
            String[] children = appDir.list();
            for (String s : children) {
                if (!s.equals("lib")) {
                    cleandirectory(new File(appDir, s));
                    Log.i("TAG", "File /data/data/APP_PACKAGE/" + s + " DELETED");
                }
            }
        }
        return null;
    }

    public static CacheRequest clearAppDatawithToast(Context context, String message) {
        File cache = context.getCacheDir();
        File appDir = new File(cache.getParent());
        if (appDir.exists()) {
            String[] children = appDir.list();
            for (String s : children) {
                if (!s.equals("lib")) {
                    cleandirectory(new File(appDir, s));
                    if (message.isEmpty()) {
                        message = "App data clear successfully";
                    }
                    Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
                    Log.i("TAG", "File /data/data/APP_PACKAGE/" + s + " DELETED");
                }
            }
        }
        return null;
    }

    public static boolean cleandirectory(File dir) {
        if (dir != null && dir.isDirectory()) {
            String[] children = dir.list();
            for (int i = 0; i < children.length; i++) {
                boolean success = cleandirectory(new File(dir, children[i]));
                if (!success) {
                    return false;
                }
            }
            return dir.delete();
        } else if (dir != null && dir.isFile())
            return dir.delete();
        else {
            return false;
        }
    }



}
