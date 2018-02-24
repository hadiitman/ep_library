package nerds.ep.advance.Downloader;

import android.content.Context;

/**
 * Created by hadi on 16/02/2018.
 */

public class DownloaderPresenter implements DownloaderContract.Presenter {
    private DownloaderContract.View view;
    private Context mContext;
    DownloaderModel model = new DownloaderModel(this);

    @Override
    public void attachView(DownloaderContract.View view) {

        this.view = view;
    }

    @Override
    public void attachContext(Context mContext) {

        this.mContext = mContext;
    }

    @Override
    public void download(String url) {
        model.download(mContext,url);

    }
}
