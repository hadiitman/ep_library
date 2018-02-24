package nerds.ep.advance.utils;

/**
 * Created by hadi on 28/01/2018.
 */

public class Constanst {
    public static String BASE_URL = "http://www.omdbapi.com/";
    public static String OMDB_ApiKey = "2e0e604";
    public static WebServiceInterface webInterface = RetrofitGenerator.create(WebServiceInterface.class);

}
