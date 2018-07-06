package rxjava.sven.com.rxjavahelloworld.di;

import dagger.Component;
import rxjava.sven.com.rxjavahelloworld.DisplayDataActivity;
import rxjava.sven.com.rxjavahelloworld.MainActivity;

@Component(modules = DiModule.class)
public interface DiComponent {

    void inject(MainActivity activity);
    void inject(DisplayDataActivity activity);

}
