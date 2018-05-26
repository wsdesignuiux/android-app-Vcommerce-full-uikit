package ws.wolfsoft.mobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Screen_list extends AppCompatActivity {

    public TextView screen1,screen2,screen3,screen4,screen5,screen6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_list);
        init();init1();init2();init3();init4();init5();
    }

    private void init5() {

        screen6 =(TextView)findViewById(R.id.screen6);
        screen6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent View = new Intent(Screen_list.this, V_Commerce_subcategory.class);
                startActivity(View);

            }
        });
    }

    private void init4() {

        screen5 =(TextView)findViewById(R.id.screen5);
        screen5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent View = new Intent(Screen_list.this, V_Commerce_walkthrough.class);
                startActivity(View);

            }
        });

    }

    private void init3() {

        screen4 =(TextView)findViewById(R.id.screen4);
        screen4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent View = new Intent(Screen_list.this, V_Commerce_category.class);
                startActivity(View);

            }
        });
    }

    private void init2() {

        screen3 =(TextView)findViewById(R.id.screen3);
        screen3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent View = new Intent(Screen_list.this, V_Commerce_otp.class);
                startActivity(View);

            }
        });
    }

    private void init1() {

        screen2 =(TextView)findViewById(R.id.screen2);
        screen2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent View = new Intent(Screen_list.this, V_Commerce_mobile.class);
                startActivity(View);

            }
        });

    }

    private void init() {


        screen1 =(TextView)findViewById(R.id.screen1);
        screen1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent View = new Intent(Screen_list.this, MainActivity.class);
                startActivity(View);

            }
        });


    }
}
