package ep.nerds.eplibrary.utils.views;

import android.content.Context;
import android.util.AttributeSet;

import ep.nerds.eplibrary.utils.BaseApplication;

/**
 * Created by hadi on 25/02/2018.
 */

public class EPButton extends com.rey.material.widget.Button {
    public EPButton(Context context) {
        super(context);
        this.setTypeface(BaseApplication.mTypeFace);
    }

    public EPButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.setTypeface(BaseApplication.mTypeFace);
    }
}
