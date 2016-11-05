package embedded.edu.dongguk.cse.crimenotifier;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import embedded.edu.dongguk.cse.crimenotifier.BaseActivity;

public class AlertActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert);
    }
}
