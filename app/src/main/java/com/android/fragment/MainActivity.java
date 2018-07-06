package com.android.fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.android.fragment.interfaces.ICommunication;
import com.android.fragment.uidesign.FragmentA;
import com.android.fragment.uidesign.FragmentB;
import com.android.fragment.utils.Constants;

public class MainActivity extends AppCompatActivity implements ICommunication{

    private final String TAG = "MainActivity";
    FragmentA fragmentA;
    FragmentB fragmentB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG,"onCreate");
        if(savedInstanceState == null) {
            attachFrag();
        }
    }

    public void attachFrag(){
        attachFragA();
        attachFragB();
    }

    private void attachFragA() {
        fragmentA = new FragmentA();
        getSupportFragmentManager().beginTransaction().replace(R.id.frame1,fragmentA,"Fragment1").commitAllowingStateLoss();

    }

    private void attachFragB() {
        fragmentB = new FragmentB();
        getSupportFragmentManager().beginTransaction().replace(R.id.frame2,fragmentB,"Fragment2").commitAllowingStateLoss();

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG,"onRestart");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"onStart");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d(TAG, "onRestoreInstanceState");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"onPause");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d(TAG, "onSaveInstanceState");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"onDestroy");
    }

    @Override
    public void respond(String text) {
        Log.d(TAG," Communication From Fragment");
        Bundle bundle = new Bundle();
        bundle.putString(Constants.TEXT,text);

        FragmentB fragmentB = new FragmentB();
        fragmentB.setArguments(bundle);
        getSupportFragmentManager().beginTransaction().replace(R.id.frame2,fragmentB,"Fragment2").commitAllowingStateLoss();


    }
}
