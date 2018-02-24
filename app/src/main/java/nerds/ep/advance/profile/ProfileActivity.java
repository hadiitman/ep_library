package nerds.ep.advance.profile;

import android.widget.EditText;
import android.widget.TextView;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

import nerds.ep.R;
import nerds.ep.advance.utils.BaseActivity;
import nerds.ep.advance.utils.PublicMethods;

@EActivity(R.layout.activity_profile)

public class ProfileActivity extends BaseActivity implements ProfileContract.View {
    ProfileContract.Presenter presenter;
    @ViewById
    EditText user_id;

    @ViewById
    TextView result;

    @AfterViews
    void init(){
        presenter = new ProfilePresenter();
        presenter.attachView(this);
    }


    @Override
    public void showWelcome(String msg) {
        PublicMethods.showToast(mContext,msg);

    }

    @Override
    public void showUserName(String username) {
        result.setText(username);
    }

    @Click
    void show_user(){
        presenter.OnShowUserSelect(user_id.getText().toString());

    }
}
