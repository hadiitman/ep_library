package ep.nerds.eplibrary.utils.views;

import android.content.Context;
import android.util.AttributeSet;

import ep.nerds.eplibrary.utils.BaseApplication;


/**
 * Created by hadi on 25/02/2018.
 */

public class EPEditText extends android.support.v7.widget.AppCompatEditText{
    Context mContext;
    public EPEditText(Context context) {
        super(context);
         mContext = context;
        if (!isInEditMode())
            this.setTypeface(BaseApplication.mTypeFace);
    }

    public EPEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        mContext = context;
        if (!isInEditMode())
            this.setTypeface(BaseApplication.mTypeFace);
    }
}
