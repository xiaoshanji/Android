package over.shanji.com.firstandroidactivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity
{
    Button button;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        System.out.println("2onCreate");
        setContentView(R.layout.second_activity);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(SecondActivity.this,FirstActivity.class);
                startActivity(intent);
            }
        });
    }
    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("2onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("2onPause");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("2onDestroy");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("2onStop");
    }

    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("2onStart");
    }
}
