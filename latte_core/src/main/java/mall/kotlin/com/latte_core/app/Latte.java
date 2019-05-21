package mall.kotlin.com.latte_core.app;

import android.content.Context;

import java.util.WeakHashMap;

/**
 * Created by  幻忧 on  2019/5/21 16:28
 */
public final class Latte  {

    public static Configurator init(Context context) {
        getConfigurations().put(ConfigType.APPLICATION_CONTEXT.name(), context.getApplicationContext());
        return Configurator.getInstance();
    }
    private static WeakHashMap<String, Object> getConfigurations() {
        return Configurator.getInstance().getLatteConfigs();
    }
}
