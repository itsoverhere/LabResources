package edu.mobidev.labviews;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button buttonChange;
    TextView tvLabel;
    ImageView ivPicture;

    // the boolean isFlipped will help us check if the views have changed
    boolean isFlipped = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonChange = (Button) findViewById(R.id.button_change);
        tvLabel = (TextView) findViewById(R.id.city_textview);
        ivPicture = (ImageView) findViewById(R.id.city_imageview);

        buttonChange.setOnClickListener(changeViews);
    }

    View.OnClickListener changeViews = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(!isFlipped) {
                tvLabel.setText(R.string.label_eiffel);
                ivPicture.setImageResource(R.drawable.eiffel);
            }else{
                tvLabel.setText(R.string.label_airport);
                ivPicture.setImageResource(R.drawable.airport);
            }
            isFlipped = !isFlipped;
        }
    };

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
