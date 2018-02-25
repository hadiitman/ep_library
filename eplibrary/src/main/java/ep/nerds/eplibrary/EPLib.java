package ep.nerds.eplibrary;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

/**
 * Created by hadi on 22/02/2018.
 */

public class EPLib {

    public static String getName (){
        return "Drink";

    }

    public static void loadImage(Context mContext, String url, ImageView img){
        if (url != null)
            Glide.with(mContext).load(url).into(img);
    }

}
