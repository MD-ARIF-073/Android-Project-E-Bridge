package com.tracking.ebridge;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Viewdoubt extends Activity {

    TextView doubtTextView;
    Button replayButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewdoubt);

        String getdesc=getIntent().getStringExtra("description");

        doubtTextView= (TextView) findViewById(R.id.doubttext);
        replayButton= (Button) findViewById(R.id.doubtrepaly);

        replayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Viewdoubt.this,AddNotification.class);
                startActivity(in);
            }
        });

        doubtTextView.setText(getdesc);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_viewdoubt, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();


        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
