package com.example.set3;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){
    	switch(item.getItemId()){
    	case R.id.e_copy:
    		Toast.makeText(getApplicationContext(), "Edit -> Copy Selected", Toast.LENGTH_SHORT).show();
    		return true;
    	case R.id.e_cut:
    		Toast.makeText(getApplicationContext(), "Edit -> Cut Selected", Toast.LENGTH_SHORT).show();
    		return true;
    	case R.id.e_paste:
    		Toast.makeText(getApplicationContext(), "Edit -> Paste Selected", Toast.LENGTH_SHORT).show();
    		return true;
    	case R.id.f_new:
    		Toast.makeText(getApplicationContext(), "File -> New Selected", Toast.LENGTH_SHORT).show();
    		return true;
    	case R.id.f_open:
    		Toast.makeText(getApplicationContext(), "File ->Open Selected", Toast.LENGTH_SHORT).show();
    		return true;
    	case R.id.file:
    		Toast.makeText(getApplicationContext(), "File Selected", Toast.LENGTH_SHORT).show();
    		return true;
    	case R.id.edit:
    		Toast.makeText(getApplicationContext(), "Edit Selected", Toast.LENGTH_SHORT).show();
    		return true;
    	default:
    		Toast.makeText(getApplicationContext(), "Nothing Selected", Toast.LENGTH_SHORT).show();
    		return true;
    	}
    }
    
}
