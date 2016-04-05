package kr.hs.emirim.beee1004.monchicken;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText mName;
    Button mBtnShowTheChicken;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mName = (EditText)findViewById(R.id.name);
        mBtnShowTheChicken = (Button)findViewById(R.id.btn_showme_the_chicken);
        mBtnShowTheChicken.setOnClickListener(this);  //클릭했다 들리면 이벤트
    }


    @Override
    protected void onResume() {
        super.onResume();
        mName.setText("");  //사용자가 백버튼을 눌렀을 경우에 다시 남아있는 것을 방지하기 위해 공백으로 채움
    }


    @Override
    public void onClick(View view) {
        Toast.makeText(this,"먹고싶지?꺄르르",Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this, ResultActivity.class);
        startActivity(intent);
    }
}
