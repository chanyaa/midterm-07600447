package th.ac.su.speed_calculator;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    String n = "0";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button calcutate = findViewById(R.id.calcutate);
        calcutate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText nummeter = findViewById(R.id.meter);
                String meterText = nummeter.getText().toString();

                EditText numsecond = findViewById(R.id.second);
                String secondText = numsecond.getText().toString();


                if(meterText.isEmpty() || secondText.isEmpty()){
                    Toast t = Toast.makeText(MainActivity.this,
                            "Distance and time are required.",
                            Toast.LENGTH_LONG);
                    t.show();
                } else if(secondText.equals(n)){
                    Toast t = Toast.makeText(MainActivity.this,
                            "Time must be greater then zero.",
                            Toast.LENGTH_LONG);
                    t.show();
                }
                else{
                    double answer = calcutate(Double.parseDouble(nummeter.getText().toString()),(Double.parseDouble(numsecond.getText().toString()));
                    ans.setText(String.format("%.2f",answer));
                        if(answer>80.0){
                            AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
                            dialog.setTitle("SPEED CALCULATOR");
                            dialog.setMessage("Speed is over limit");
                            dialog.setNegativeButton("OK", null);
                            dialog.show();
                        }
                }

            }
        });
    }
}