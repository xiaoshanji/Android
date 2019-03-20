package over.shanji.com.firstandroidactivity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.RatingBar;
import android.widget.TextView;

public class RatingBarActivity extends AppCompatActivity
{
    private RatingBar ratingBar;
    private TextView textView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ratingbar_activity);
        ratingBar = (RatingBar) findViewById(R.id.ratingbar1);
        textView = (TextView)findViewById(R.id.textview1);
        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                textView.setText("受欢迎度为：" + rating + "颗星");
            }
        });
    }
}
