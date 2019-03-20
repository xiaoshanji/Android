package over.shanji.com.firstandroidactivity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ButtonLifeActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.button_life_activity);
        System.out.println("onCreate");
        Button button = findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    protected void onStart()
    {
        super.onStart();
        System.out.println("onStart");
    }
    protected void onResume()
    {
        super.onResume();
        System.out.println("onResume");
    }
    protected void onPause()
    {
        super.onPause();
        System.out.println("onPause");
    }
    protected void onStop()
    {
        super.onStop();
        System.out.println("onStop");
    }
    protected void onRestart()
    {
        super.onRestart();
        System.out.println("onRestart");
    }
    protected void onDestroy()
    {
        super.onDestroy();
        System.out.println("onDestroy");
    }
}
