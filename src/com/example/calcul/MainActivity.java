package com.example.calcul;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
 Button b1 = ((Button)findViewById(R.id.b1));
 final TextView T = ((TextView)findViewById(R.id.T2));
 b1.setOnClickListener(new View.OnClickListener() {
	    public void onClick(View v) {
	        EditText texte = ((EditText) findViewById(R.id.E1));
	        EditText texte1 = ((EditText) findViewById(R.id.E2));
	        RadioGroup G1 = (RadioGroup)findViewById(R.id.G);
	        String T1 = texte.getText().toString();
	        String T2 = texte1.getText().toString();

	        try {
	            double v1 = Double.parseDouble(T1);
	            double v2 = Double.parseDouble(T2);

	            int choix = G1.getCheckedRadioButtonId();
	            double result = 0;
	            
	            if (choix == R.id.btn) {
	                result = v1 + v2;
	            } else if (choix == R.id.btn1) {
	                result = (v1 - v2);
	            } else if (choix == R.id.btn2) {
	                if (v2 != 0) {
	                    result = v1 / v2;
	                } else {
	                    Toast.makeText(getApplicationContext(), "Division par zéro", Toast.LENGTH_SHORT).show();
	                    return; 
	                }
	            } else {
	                result = v1 * v2;
	            }

	            T.setText(String.valueOf(result));

	        } catch (Exception e) {
	            Toast.makeText(getApplicationContext(), "entrer des nombres valide", Toast.LENGTH_SHORT).show();
	        }
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
