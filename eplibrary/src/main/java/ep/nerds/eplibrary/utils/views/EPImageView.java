package ep.nerds.eplibrary.utils.views;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;

import ep.nerds.eplibrary.EPLib;

/**
 * Created by hadi on 25/02/2018.
 */

public class EPImageView extends android.support.v7.widget.AppCompatImageView {
    Context mContext;
    public EPImageView(Context context) {
        super(context);
        this.mContext = context;
    }

    public EPImageView(Context context,@Nullable AttributeSet attrs) {
        super(context, attrs);
        this.mContext = context;
    }
    public void loadURL(String url){
        EPLib.loadImage(mContext,url,this);}
}
