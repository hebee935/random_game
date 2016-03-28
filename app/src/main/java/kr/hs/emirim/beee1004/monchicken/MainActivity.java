package kr.hs.emirim.beee1004.monchicken;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText mName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mName = (EditText)findViewById(R.id.name);
    }

    @Override
    protected void onResume() {
        super.onResume();
        mName.setText("");  //사용자가 백버튼을 눌렀을 경우에 다시 남아있는 것을 방지하기 위해 공백으로 채움
    }
}
