package com.example.myviewholder;

import android.preference.PreferenceActivity;

abstract class AsyncHttpResponseHandler {
    public abstract void onSuccess(int statusCode, PreferenceActivity.Header[] headers, byte[] responseBody);

    public abstract void onFailure(int statusCode, PreferenceActivity.Header[] headers, byte[] responseBody, Throwable error);
}
