package kr.hs.emirim.beee1004.monchicken;

/**
 * Created by appcreate40 on 2016. 3. 28..
 */
import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class ResultActivity extends AppCompatActivity{
    static String TAG="먼치킨:ResultActivity";
    TextView mResult;
    ImageView chickenView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);  //한번만 호출됨
        setContentView(R.layout.activity_result);
        Log.d(TAG, "결과 액티비티 시작!");

        mResult = (TextView)findViewById(R.id.result);
        chickenView = (ImageView)findViewById(R.id.imageView);
        Log.d(TAG, "텍스트뷰, 이미지뷰 연결 성공!");

        Intent intent = getIntent();

        Random r = new Random();
        int result = r.nextInt(5);
        Log.d(TAG, "랜덤값 생성! : "+result);

        /*if(result == 0){
            chickenView.setImageResource(R.drawable.c01);
        }else if(result == 1){
            chickenView.setImageResource(R.drawable.c02);
        }else if(result ==2){
            chickenView.setImageResource(R.drawable.c03);
        }
        switch (result){
            case 1:chickenView.setImageResource(R.drawable.c01);break;
            case 2:chickenView.setImageResource(R.drawable.c02);break;
            case 3:chickenView.setImageResource(R.drawable.c03);break;
        }*/

        chickenView.setImageResource(R.drawable.c01+result);


        String name = intent.getStringExtra("name");  //String의 경우 값이 없으면 null값이 자동으로 들어옴
        Log.d(TAG, "인텐트값 읽기<name> : "+name);

        int age = intent.getIntExtra("age",-1);
        Log.d(TAG, "인텐트값 읽기<age> : "+age);

        mResult.setText(name+"님 안녕하세오? 맛있게 드세효~");
        //mResult.setText(age+"살 이시군요!!");

    }
}
