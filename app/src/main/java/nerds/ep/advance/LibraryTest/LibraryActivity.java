package nerds.ep.advance.LibraryTest;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

import ep.nerds.eplibrary.EPLib;
import ep.nerds.eplibrary.utils.BaseActivity;
import ep.nerds.eplibrary.utils.views.EPImageView;
import nerds.ep.R;
import nerds.ep.advance.utils.PublicMethods;

@EActivity(R.layout.activity_library)

public class LibraryActivity extends BaseActivity {
    @ViewById
    EPImageView img;

    @AfterViews
    void onInit(){
      PublicMethods.showToast(this ,EPLib.getShamsiDate());
      img.loadURL("https://www.google.com/logos/doodles/2018/2018-doodle-snow-games-day-17-6585325022347264-s.png");

    }

}
