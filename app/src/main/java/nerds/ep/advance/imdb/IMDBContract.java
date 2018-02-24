package nerds.ep.advance.imdb;

import nerds.ep.advance.utils.webmodels.WebIMDBModel;

/**
 * Created by hadi on 28/01/2018.
 */

public interface IMDBContract {
    interface View {
        void onSearchResult(WebIMDBModel model);
        void onWebServiceError();
        void showHideLoading(Boolean show);
        void goToNextStep ();
    }

    interface Presenter {
        void attachView(View view);
        void onSearchResult(WebIMDBModel model);
        void search(String word);
        void onWebServiceError();
    }
}
