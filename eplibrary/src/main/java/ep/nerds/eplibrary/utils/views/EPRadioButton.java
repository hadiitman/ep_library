package ep.nerds.eplibrary.utils.views;

import android.content.Context;
import android.util.AttributeSet;

import ep.nerds.eplibrary.utils.BaseApplication;

/**
 * Created by hadi on 26/02/2018.
 */

public class EPRadioButton extends android.support.v7.widget.AppCompatRadioButton {
    public EPRadioButton(Context context) {
        super(context);
        //if (!isInEditMode())
            this.setTypeface(BaseApplication.mTypeFace);
    }

    public EPRadioButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        //if (!isInEditMode())
            this.setTypeface(BaseApplication.mTypeFace);
    }
}
