package nerds.ep.advance.utils;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;
import android.widget.Toast;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.FileAsyncHttpResponseHandler;

import org.greenrobot.eventbus.EventBus;

import java.io.File;

import cz.msebera.android.httpclient.Header;


/**
 * Created by hadi on 16/02/2018.
 */

public class DownloaderService extends Service {
        String TAG = "download_service";
    @Override
    public void onCreate() {
        super.onCreate();

    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        String url = intent.getStringExtra("url");
        download(url);
       // stopSelf();

        return START_NOT_STICKY;
    }

    void download(String url) {
        AsyncHttpClient client = new AsyncHttpClient();
        DownloadEntity entity = new DownloadEntity(0);
        client.get(url, new FileAsyncHttpResponseHandler(this) {

            @Override
            public void onProgress(long bytesWritten, long totalSize) {
                super.onProgress(bytesWritten, totalSize);
                int percentage = (int) (bytesWritten * 100.0 / totalSize + 0.5);
                Log.d(TAG, "onProgress: "+percentage);
                entity.setPercent(percentage);
                EventBus.getDefault().post(entity);

            }

            @Override
            public void onFailure(int statusCode, Header[] headers, Throwable throwable, File file) {

            }

            @Override
            public void onSuccess(int statusCode, Header[] headers, File file) {
                Log.d(TAG, "onSuccess: "+file.getAbsolutePath());
                entity.setPercent(100);
                EventBus.getDefault().post(entity);

            }
        });

    }


    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
