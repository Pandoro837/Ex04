package com.javaex.ex04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    //필드
    private EditText edtDisplay;
    private TextView textTitle;
    private Button btnSet;
    private Button btnGet;
    private Button btnVisible;
    private Button btnInVisible;
    private Button btnGone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //btnSet 버튼을 자바로 사용할 수 있게, 자바 객체로 만들어야 한다
        btnSet = (Button)findViewById(R.id.btnSet);
        btnGet = (Button)findViewById(R.id.btnGet);
        btnVisible = (Button)findViewById(R.id.btnVisible);
        btnInVisible = (Button)findViewById(R.id.btnInVisible);
        btnGone = (Button)findViewById(R.id.btnGone);
        edtDisplay = (EditText)findViewById(R.id.edtDisplay);
        textTitle = (TextView)findViewById(R.id.textTitle);
        //btnSet을 클릭 했을 때
        btnSet.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Log.d("javaStudy","set 버튼 클릭");

                //해야될 일 - edtDisplay에 777출력
                edtDisplay.setText("777");
            }

        });

        //btnGet을 클릭했을 때
        btnGet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("javaStudy"," get 버튼 클릭");
               
                //edtDisplay의 텍스트 가져오기
                String result = edtDisplay.getText().toString();
                
                //Log.d로 확인
                Log.d("javaStudy",result);

                Toast.makeText(getApplicationContext(), result, Toast.LENGTH_LONG).show();

            }
        });

        //btnVisible을 클릭했을 때
        btnVisible.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //이벤트 확인
                Log.d("javaStudy", "onClick: Visible");
                //textTitle VISIBLE
                textTitle.setVisibility(View.VISIBLE);

                String result = textTitle.getText().toString();
                Toast.makeText(getApplicationContext(), result, Toast.LENGTH_LONG).show();

            }
        });

        //btnInVisible을 클릭했을 때
        btnInVisible.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //이벤트 확인
                Log.d("javaStudy", "onClick: InVisible");
                //textTitle INVISIBLE
                textTitle.setVisibility(View.INVISIBLE);

            }
        });
        //btnGone을 클릭했을 때
        btnGone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //이벤트 확인
                Log.d("javaStudy", "onClick: Gone");
                //textTitle GONE
                textTitle.setVisibility(View.GONE);

            }
        });
    }
}