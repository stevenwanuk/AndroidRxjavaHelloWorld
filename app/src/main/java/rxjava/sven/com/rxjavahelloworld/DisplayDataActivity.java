package rxjava.sven.com.rxjavahelloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import javax.inject.Inject;

import rxjava.sven.com.rxjavahelloworld.di.DaggerDiComponent;
import rxjava.sven.com.rxjavahelloworld.service.MyService;

public class DisplayDataActivity extends AppCompatActivity {

    @Inject
    MyService myService;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_data);

        DaggerDiComponent.create().inject(this);
    }
}
