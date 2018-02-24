package nerds.ep.advance.Downloader;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ProgressBar;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

import nerds.ep.R;
import nerds.ep.advance.utils.BaseActivity;
import nerds.ep.advance.utils.DownloadEntity;

@EActivity(R.layout.activity_downloader)

public class DownloaderActivity extends BaseActivity implements DownloaderContract.View {
    DownloaderContract.Presenter presenter;

    @ViewById
    EditText url;
    @ViewById
    ProgressBar progress;


    @AfterViews
    void init() {
        presenter = new DownloaderPresenter();
        presenter.attachView(this);
        presenter.attachContext(mContext);
    }

    @Click
    void download (){
        presenter.download(url.getText().toString());

    }
    @Subscribe
    public void onDownloading(DownloadEntity dl){
        progress.setProgress(dl.getPercent());
    }

    @Override
    protected void onResume() {
        super.onResume();
        EventBus.getDefault().register(mContext);
    }

    @Override
    protected void onPause() {
        super.onPause();
        EventBus.getDefault().unregister(mContext);
    }

















}
