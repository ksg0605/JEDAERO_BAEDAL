package com.example.bm;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class activity_SnackBarClicked extends Activity {

    private int img;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        setContentView(R.layout.snackbar_clicked);

        final Intent intent = getIntent();

        ImageView profile = (ImageView)findViewById(R.id.img_prof);
        TextView info = (TextView)findViewById(R.id.tv_info);
        TextView phone = (TextView)findViewById(R.id.tv_pn);
        TextView menu = (TextView)findViewById(R.id.tv_menu);
        menu.setMovementMethod(new ScrollingMovementMethod());

        img = Integer.parseInt(intent.getStringExtra("snackbar_profile"));
        profile.setImageResource(img);
        info.setText(intent.getStringExtra("snackbar_info"));
        phone.setText(intent.getStringExtra("snackbar_phone"));
        menu.setText(intent.getStringExtra("snackbar_menu"));

        Button btn1 = (Button) findViewById(R.id.btn_call_snackbar);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phoneNum = intent.getStringExtra("snackbar_phone");
                Intent call = new Intent(Intent.ACTION_DIAL);
                call.setData(Uri.parse("tel:"+phoneNum));
                try {
                    startActivity(call);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        });


    }
}