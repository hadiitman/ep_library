package ep.nerds.eplibrary.utils.views;

import android.content.Context;
import android.util.AttributeSet;

import com.rey.material.widget.CheckBox;

import ep.nerds.eplibrary.utils.BaseApplication;

/**
 * Created by hadi on 25/02/2018.
 */

public class EPCheckBox extends CheckBox {
    public EPCheckBox(Context context) {
        super(context);
        this.setTypeface(BaseApplication.mTypeFace);
    }

    public EPCheckBox(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.setTypeface(BaseApplication.mTypeFace);
    }
}
