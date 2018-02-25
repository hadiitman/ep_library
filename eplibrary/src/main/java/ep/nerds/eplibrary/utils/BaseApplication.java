package ep.nerds.eplibrary.utils;

import android.app.Application;
import android.graphics.Typeface;

/**
 * Created by hadi on 25/02/2018.
 */

public class BaseApplication extends Application{
    public static Typeface mTypeFace;
    @Override
    public void onCreate() {
        super.onCreate();
        mTypeFace = Typeface.createFromAsset(getAssets(),"Elegran.ttf");
    }
}
