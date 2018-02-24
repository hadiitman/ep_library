package nerds.ep.advance.imdb;

import nerds.ep.advance.utils.webmodels.WebIMDBModel;

/**
 * Created by hadi on 28/01/2018.
 */

public class IMDBPresenter implements IMDBContract.Presenter {
    private IMDBContract.View view;
    IMDBModel model;

    @Override
    public void attachView(IMDBContract.View view) {

        this.view = view;
        model = new IMDBModel(this);
    }


    @Override
    public void search(String word) {
        model.getWordDetail(word);
        view.showHideLoading(true);

    }

    @Override
    public void onSearchResult(WebIMDBModel model) {
        view.onSearchResult(model);
        view.showHideLoading(false);
        view.goToNextStep();

    }

    @Override
    public void onWebServiceError() {
        view.showHideLoading(false);

    }
}
