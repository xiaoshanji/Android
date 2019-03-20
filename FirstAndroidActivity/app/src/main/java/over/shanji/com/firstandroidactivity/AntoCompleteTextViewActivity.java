package over.shanji.com.firstandroidactivity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class AntoCompleteTextViewActivity  extends AppCompatActivity
{
    private AutoCompleteTextView autoCompleteTextViewActivity;
    private String [] str = new String[]{"ww","uux","wwy"};
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.antocompletetextview_activity);
        autoCompleteTextViewActivity = (AutoCompleteTextView)findViewById(R.id.autoaompletetextview1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.antocompletetextview_activity,str);
        autoCompleteTextViewActivity.setAdapter(adapter);
    }
}
