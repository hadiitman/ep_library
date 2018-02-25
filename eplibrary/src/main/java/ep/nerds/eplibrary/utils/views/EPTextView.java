package ep.nerds.eplibrary.utils.views;

import android.content.Context;
import android.util.AttributeSet;

import ep.nerds.eplibrary.utils.BaseApplication;


/**
 * Created by hadi on 25/02/2018.
 */

public class EPTextView extends com.rey.material.widget.TextView {
    public EPTextView(Context context) {
        super(context);
        if (!isInEditMode())
            this.setTypeface(BaseApplication.mTypeFace);
    }

    public EPTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        if (!isInEditMode())
            this.setTypeface(BaseApplication.mTypeFace);
    }
}
