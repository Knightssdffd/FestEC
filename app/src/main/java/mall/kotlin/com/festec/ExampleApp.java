package mall.kotlin.com.festec;

import android.app.Application;

import mall.kotlin.com.latte_core.app.Latte;

/**
 * Created by  幻忧 on  2019/5/21 16:29
 */
public class ExampleApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Latte.init(this)
                .withApiHost("http://127.0.0.1/")
                .configure();
    }
}
