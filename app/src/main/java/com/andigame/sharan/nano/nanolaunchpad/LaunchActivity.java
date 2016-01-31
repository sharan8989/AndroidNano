package com.andigame.sharan.nano.nanolaunchpad;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class LaunchActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_launch, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void launchSportifySummer(View v){
        showToast("This button will launch my sportify summer app!");
    }

    public void launchScoresApp(View v){
        showToast("This button will launch my scores app!");
    }

    public void launchLibraryApp(View v){
        showToast("This button will launch my library app!");
    }

    public void launchBuildItBigger(View v){
        showToast("This button will launch my build it bigger app!");
    }

    public void launchXYZReader(View v){
        showToast("This button will launch my xyz reader app!");
    }

    public void launchCapStone(View v){
        showToast("This button will launch my capstone app!");
    }

    private void showToast(CharSequence message){

        Context ctx = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(ctx, message, duration);
        toast.show();
    }
}
