package com.mycompany.bmi;

import android.app.*;
import android.os.*;
import android.widget.*;
import android.view.View.*;
import android.view.*;

public class MainActivity extends Activity 
{private EditText et1,et2;
private Button btn;
private TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
  
		et1=(EditText)findViewById(R.id.edittext1);
		et2=(EditText)findViewById(R.id.edittext2);
		btn=(Button)findViewById(R.id.Button);
		tv=(TextView)findViewById(R.id.textview);

		btn.setOnClickListener(new View.OnClickListener(){

				@Override
				public void onClick(View  view)
				{
				      double a=Double.parseDouble(et1.getText().toString());
					  double b=Double.parseDouble(et2.getText().toString());
					  double ans=a/(b*b);
					  tv.setText(String.valueOf(ans));
					}
			});
		}

}
