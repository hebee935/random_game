package kr.hs.emirim.beee1004.monchicken;

/**
 * Created by appcreate40 on 2016. 3. 28..
 */
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity{

    TextView mResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mResult = (TextView)findViewById(R.id.result);
        mResult.setText("결과");
    }
}
