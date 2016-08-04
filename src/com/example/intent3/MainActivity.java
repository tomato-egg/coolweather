package com.example.intent3;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener{
	private Button btn_one;
	private Button btn_two;
	private Button btn_three;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_one=(Button) findViewById(R.id.btn_one);
        btn_two=(Button) findViewById(R.id.btn_two);
        btn_three=(Button) findViewById(R.id.btn_three);
        btn_one.setOnClickListener(this);
        btn_two.setOnClickListener(this);
        btn_three.setOnClickListener(this);
    }
	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btn_one:
			Intent intent=new Intent();
			intent.setClass(MainActivity.this, Activity.class);
			startActivity(intent);
			
			break;
		case R.id.btn_two:
			Intent intent2=new Intent();
			intent2.setClassName(this, "com.example.intent3.Activity");
			startActivity(intent2);
			
			break;
		case R.id.btn_three:
			Intent intent3=new Intent();
			intent3.setClassName("com.example.intent3", "com.example.intent3.Activity");
			startActivity(intent3);
			
			break;

		
			
		}
		
	}


  
    
}
