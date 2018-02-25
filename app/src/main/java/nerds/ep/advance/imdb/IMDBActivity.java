package nerds.ep.advance.imdb;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.annotation.StringRes;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

import nerds.ep.R;
import nerds.ep.advance.profile.ProfileActivity;
import nerds.ep.advance.utils.BaseActivity;
import nerds.ep.advance.utils.PublicMethods;
import nerds.ep.advance.utils.webmodels.WebIMDBModel;

@EActivity(R.layout.activity_imdb)

public class IMDBActivity extends BaseActivity implements IMDBContract.View {
    IMDBContract.Presenter presenter;
    ProgressDialog dialog;

    @ViewById
    EditText word;
    @ViewById
    TextView result;
    @ViewById
    ImageView img;
    @StringRes
    String wait;
    @StringRes
    String wait_message;


    @AfterViews
    void init() {
        presenter = new IMDBPresenter();
        presenter.attachView(this);
        dialog = new ProgressDialog(mContext);
        dialog.setTitle(wait);
        dialog.setMessage(wait_message);

    }

    @Click
    void search() {
        presenter.search(word.getText().toString());
    }


    @Override
    public void onSearchResult(WebIMDBModel model) {
        result.setText(model.getDirector() + "" + model.getTitle());
        PublicMethods.showImage(mContext, model.getPoster(), img);


    }

    @Override
    public void onWebServiceError() {
        PublicMethods.showToast(mContext, "Error In WebService");

    }

    @Override
    public void showHideLoading(Boolean show) {
        if (show)
            dialog.show();
        else
            dialog.dismiss();
    }

    @Override
    public void goToNextStep() {
        startActivity(new Intent(mContext , ProfileActivity.class));

    }
}
