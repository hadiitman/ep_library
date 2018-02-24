package nerds.ep.advance.Downloader;

import android.content.Context;
import android.content.Intent;

import nerds.ep.advance.utils.DownloaderService;

/**
 * Created by hadi on 16/02/2018.
 */

public class DownloaderModel {

    DownloaderContract.Presenter presenter;

    public DownloaderModel(DownloaderContract.Presenter presenter) {
        this.presenter = presenter;
    }

    public void download(Context mContext, String url) {
        Intent dlIntent = new Intent(mContext, DownloaderService.class);
        dlIntent.putExtra("url", url);
        mContext.startService(dlIntent);

    }
}
