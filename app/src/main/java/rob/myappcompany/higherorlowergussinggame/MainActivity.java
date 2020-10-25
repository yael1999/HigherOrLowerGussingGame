package rob.myappcompany.higherorlowergussinggame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

        public class MainActivity extends AppCompatActivity {
        int random;


        public void startAll(View view){
        EditText e=(EditText)findViewById(R.id.inputNumber);
        int inputNum=Integer.parseInt(e.getText().toString());
        if(random==inputNum){
        Toast.makeText(getApplicationContext(),"Correct!Try again!" , Toast.LENGTH_LONG).show();
            Random r=new Random();
            random = r.nextInt(21);
        }
        else{
            if(inputNum>random){
                Toast.makeText(getApplicationContext(),"Lower!" , Toast.LENGTH_LONG).show();
            }
            else{
                Toast.makeText(getApplicationContext(),"Higher!" , Toast.LENGTH_LONG).show();
            }
            }
        }




    @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random r=new Random();
        random = r.nextInt(21);
    }
}