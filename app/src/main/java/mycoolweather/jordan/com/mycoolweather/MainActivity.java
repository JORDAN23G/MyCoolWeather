package mycoolweather.jordan.com.mycoolweather;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;


public class MainActivity extends AppCompatActivity {
    @BindView(R.id.et_content)
    EditText etContent;
    @BindView(R.id.btn_click)
    Button btnClick;

//    @OnClick(R.id.btn_click)
//    public void showMsg() {
//        Toast.makeText(this, "btn_click", Toast.LENGTH_SHORT).show();
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //绑定activity
        ButterKnife.bind(this);
    }
}
