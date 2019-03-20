package over.shanji.com.firstandroidactivity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class RadioClickActivity extends AppCompatActivity
{
    RadioGroup radioGroup;
    TextView textView;
    RadioButton radioButton1,radioButton2;
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.radio_click_activity);

        radioGroup = (RadioGroup)findViewById(R.id.rg1);
        radioButton1 = (RadioButton)findViewById(R.id.rb1);
        radioButton2 = (RadioButton)findViewById(R.id.rb2);
        textView = (TextView)findViewById(R.id.tv2);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if( checkedId == R.id.rb1)
                {
                    textView.setText("你选择的是：" + radioButton1.getText());
                }
                else
                {
                    textView.setText("你选择的是：" + radioButton2.getText());
                }
            }
        });
    }
}
