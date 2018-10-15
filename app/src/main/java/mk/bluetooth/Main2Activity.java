package mk.bluetooth;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    EditText user_name,password;
    Button Go;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        user_name=findViewById(R.id.email);
        password=findViewById(R.id.password);
        Go=findViewById(R.id.enter);




        Go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(user_name.getText().toString().equals("Admin") &&
                        password.getText().toString().equals("password")){
                    Intent i=new Intent(Main2Activity.this,MainActivity.class);
                    startActivity(i);
                }else {
                    Toast.makeText(Main2Activity.this,"Incorrect Email or Password"
                    ,Toast.LENGTH_LONG).show();
                }
            }
        });




    }
}
