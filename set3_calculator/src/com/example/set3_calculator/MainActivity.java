package com.example.set3_calculator;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	Button add,sub,mul,div;
	EditText ed1,ed2;
	TextView tvv;
	float a,b;
	String cc,c,d;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        add= (Button) findViewById(R.id.b_add);
        sub= (Button) findViewById(R.id.b_sub);
        mul= (Button) findViewById(R.id.b_mul);
        div= (Button) findViewById(R.id.b_div);
        ed1=(EditText) findViewById(R.id.editText1);
        ed2=(EditText) findViewById(R.id.editText2);
        tvv= (TextView) findViewById(R.id.textView); 
        
        Toast.makeText(getApplicationContext(),""+a+b, Toast.LENGTH_SHORT).show();
        add.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				c=ed1.getText().toString();
		        d=ed2.getText().toString();
		        
		        try{
		        
		        a=Float.valueOf(c);
		        b=Float.valueOf(d);}catch (NumberFormatException e) {
		            // Handle the exception when the string cannot be parsed as an integer
		            //System.out.println("Error: Unable to parse the string as an integer");
		            e.printStackTrace();
		        }
				float sum=a+b;
				cc=String.valueOf(sum);
				tvv.setText(cc);
			}
		});
sub.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				c=ed1.getText().toString();
		        d=ed2.getText().toString();
		        
		        try{
		        
		        a=Float.valueOf(c);
		        b=Float.valueOf(d);}catch (NumberFormatException e) {
		            // Handle the exception when the string cannot be parsed as an integer
		            //System.out.println("Error: Unable to parse the string as an integer");
		            e.printStackTrace();
		        }
				float sum=a-b;
				cc=String.valueOf(sum);
				tvv.setText(cc);
			}
		});
mul.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		c=ed1.getText().toString();
        d=ed2.getText().toString();
        
        try{
        
        a=Float.valueOf(c);
        b=Float.valueOf(d);}catch (NumberFormatException e) {
            // Handle the exception when the string cannot be parsed as an integer
            //System.out.println("Error: Unable to parse the string as an integer");
            e.printStackTrace();
        }
		float sum=a*b;
		cc=String.valueOf(sum);
		tvv.setText(cc);
	}
});
div.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		c=ed1.getText().toString();
        d=ed2.getText().toString();
        
        try{
        
        a=Float.valueOf(c);
        b=Float.valueOf(d);}catch (NumberFormatException e) {
            // Handle the exception when the string cannot be parsed as an integer
            //System.out.println("Error: Unable to parse the string as an integer");
            e.printStackTrace();
        }
		float sum=a/b;
		cc=String.valueOf(sum);
		tvv.setText(cc);
	}
});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
