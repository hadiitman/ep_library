package nerds.ep.advance.Downloader;

import android.content.Context;

/**
 * Created by hadi on 16/02/2018.
 */

public interface DownloaderContract {
    interface View {

    }

    interface Presenter {
        void attachView(View view);

        void attachContext(Context mContext);
        void download(String url);
    }
}
