package mycoolweather.jordan.com.mycoolweather;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ToggleButton;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by JORDAN23G on 2017/11/28.
 */

public class TestGit extends AppCompatActivity {


    @BindView(R.id.et_receipt_name)
    EditText etReceiptName;
    @BindView(R.id.et_receipt_tel)
    EditText etReceiptTel;
    @BindView(R.id.et_receipt_address)
    EditText etReceiptAddress;
    @BindView(R.id.btn_setting_msg)
    ToggleButton btnSettingMsg;
    @BindView(R.id.ll_commit)
    LinearLayout llCommit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_address);
        //绑定activity
        ButterKnife.bind(this);
    }


}
