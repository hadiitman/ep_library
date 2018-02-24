package nerds.ep.advance.utils;

import io.reactivex.Observable;

import nerds.ep.advance.utils.webmodels.WebIMDBModel;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by hadi on 29/01/2018.
 */

public interface WebServiceInterface {
  //  @GET("/")
   // Call<WebIMDBModel> searchModel (@Query("t") String t , @Query("apikey") String apikey);
    @GET("/")
    Observable<WebIMDBModel> searchModel (@Query("t") String t , @Query("apikey") String apikey);
}
