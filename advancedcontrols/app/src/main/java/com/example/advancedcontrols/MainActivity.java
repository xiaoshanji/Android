package com.example.advancedcontrols;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.MultiAutoCompleteTextView;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    Button increase,reduce;
    ProgressBar progress;
    TextView textView,textview2;
    SeekBar seekBar;
    RatingBar ratingBar;
    AutoCompleteTextView autoCompleteTextView;
    MultiAutoCompleteTextView multiAutoCompleteTextView;

    String[] str = {"ww","uux","wwy"};
    String[] strs = {"oob","ooc","ccc"};

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        increase = findViewById(R.id.button1);
        reduce = findViewById(R.id.button2);
        progress = findViewById(R.id.progress1);
        textView = findViewById(R.id.textview1);
        seekBar = findViewById(R.id.seek1);
        textview2 = findViewById(R.id.textview2);
        ratingBar = findViewById(R.id.ratingbar1);


        autoCompleteTextView = findViewById(R.id.autocomplete1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_activated_1,str);
        autoCompleteTextView.setAdapter(adapter);

        multiAutoCompleteTextView = findViewById(R.id.multiauto1);
        ArrayAdapter<String> adapters = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_activated_1,strs);
        multiAutoCompleteTextView.setAdapter(adapters);
        multiAutoCompleteTextView.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());


        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                textview2.setText("当前值：" + rating);
            }
        });

        increase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                progress.incrementProgressBy(1);

            }
        });
        reduce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progress.incrementProgressBy(-1);
            }
        });

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                textView.setText("当前值：" + progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}
