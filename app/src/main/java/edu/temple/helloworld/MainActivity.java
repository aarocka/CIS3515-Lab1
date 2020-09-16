package edu.temple.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView NewText;
    Button ChangeText;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        NewText = findViewById(R.id.textView);
        ChangeText = findViewById(R.id.button);

        ChangeText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NewText.setText(R.string.newText);
            }
        });


    }

}