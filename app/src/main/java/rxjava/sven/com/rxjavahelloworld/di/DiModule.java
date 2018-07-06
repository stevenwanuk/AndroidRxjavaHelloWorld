package rxjava.sven.com.rxjavahelloworld.di;

import dagger.Module;
import dagger.Provides;
import rxjava.sven.com.rxjavahelloworld.service.MyService;

@Module
public class DiModule {

    @Provides
    public MyService initMyService() {
        return new MyService();
    }
}
