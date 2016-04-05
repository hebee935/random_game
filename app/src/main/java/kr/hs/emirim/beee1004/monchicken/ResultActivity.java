package kr.hs.emirim.beee1004.monchicken;

/**
 * Created by appcreate40 on 2016. 3. 28..
 */
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity{

    TextView mResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);  //한번만 호출됨
        setContentView(R.layout.activity_result);

        mResult = (TextView)findViewById(R.id.result);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");  //String의 경우 값이 없으면 null값이 자동으로 들어옴
        int age = intent.getIntExtra("age",-1);

        mResult.setText(name+"님 안녕하세오?");
        //mResult.setText(age+"살 이시군요!!");

    }
}
