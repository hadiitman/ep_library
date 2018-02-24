package nerds.ep.advance.imdb;

import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import nerds.ep.advance.utils.Constanst;
import nerds.ep.advance.utils.webmodels.WebIMDBModel;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static nerds.ep.advance.utils.Constanst.webInterface;

/**
 * Created by hadi on 28/01/2018.
 */

public class IMDBModel {

    IMDBContract.Presenter presenter;

    public IMDBModel(IMDBContract.Presenter presenter) {
        this.presenter = presenter;
    }

    public void getWordDetail(String word) {
        //try {
        //  WebIMDBModel model = Constanst.webInterface.searchModel(word, Constanst.OMDB_ApiKey).execute().body();
        //} catch (Exception e) {
        //}
        Constanst.webInterface.searchModel(word, Constanst.OMDB_ApiKey).
                subscribeOn(Schedulers.io()).
                observeOn(AndroidSchedulers.mainThread()).
                subscribe(this::onResponse,this::onError,this::onCompelete);


//        Constanst.webInterface.searchModel(word, Constanst.OMDB_ApiKey)
//                .enqueue(new Callback<WebIMDBModel>() {
//                    @Override
//                    public void onResponse(Call<WebIMDBModel> call, Response<WebIMDBModel> response) {
//                        presenter.onSearchResult(response.body());
//
//                    }
//
//                    @Override
//                    public void onFailure(Call<WebIMDBModel> call, Throwable t) {
//                        presenter.onWebServiceError();
//
//                    }
//                });
    }

    private void onCompelete(){

    }

    private void onError(Throwable throwable){
        presenter.onWebServiceError();

    }

    private void onResponse(WebIMDBModel webIMDBModel) {
        presenter.onSearchResult(webIMDBModel);

    }
}
