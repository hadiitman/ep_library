package nerds.ep.advance.LibraryTest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;

import ep.nerds.eplibrary.EPLib;
import nerds.ep.R;
import nerds.ep.advance.utils.PublicMethods;

@EActivity(R.layout.activity_library)

public class LibraryActivity extends AppCompatActivity {

    @AfterViews
    void onInit(){
      PublicMethods.showToast(this ,EPLib.getName() );

    }

}
