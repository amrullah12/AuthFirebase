package com.example.dell.alfachatt;

import android.app.Service;
import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by DELL on 19/07/2018.
 */

public class MyFirebaseInstanceIDService extends FirebaseInstanceIdService {
    private static final String TAG = "MyFirebaseInsIDService";

    @Override
    public void onTokenRefresh() {
        //get Update token
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        Log.d(TAG, "New Token: " + refreshedToken);

    }
}
