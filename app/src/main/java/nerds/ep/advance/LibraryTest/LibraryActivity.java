package nerds.ep.advance.LibraryTest;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;

import ep.nerds.eplibrary.EPLib;
import ep.nerds.eplibrary.utils.BaseActivity;
import nerds.ep.R;
import nerds.ep.advance.utils.PublicMethods;

@EActivity(R.layout.activity_library)

public class LibraryActivity extends BaseActivity {

    @AfterViews
    void onInit(){
      PublicMethods.showToast(this ,EPLib.getName() );

    }

}
