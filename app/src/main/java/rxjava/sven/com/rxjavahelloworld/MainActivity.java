package rxjava.sven.com.rxjavahelloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import javax.inject.Inject;

import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import rxjava.sven.com.rxjavahelloworld.di.DaggerDiComponent;
import rxjava.sven.com.rxjavahelloworld.di.DiComponent;
import rxjava.sven.com.rxjavahelloworld.service.MyService;


public class MainActivity extends AppCompatActivity {

    @Inject
    MyService myService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DaggerDiComponent.create().inject(this);
    }

    public void doSomething(View view) {

        Observable.fromArray(myService.getRemoteData())
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(s -> {

                    TextView textView = this.findViewById(R.id.logContainer);
                    textView.append("\n");
                    textView.append(s);
                });
    }
}
