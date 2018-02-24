package nerds.ep.advance.utils;

import nerds.ep.advance.profile.ProfileContract;

/**
 * Created by hadi on 23/01/2018.
 */

public class UserModel {
    public static String wm = "Hi Dude";

    ProfileContract.Presenter presenter;

    public UserModel(ProfileContract.Presenter presenter) {
        this.presenter = presenter;

    }

    public void getUserModel(String userID) {
        String result = "";
        if (userID.equalsIgnoreCase("1"))
            result = "sedadi";
        else if (userID.equalsIgnoreCase("2"))
            result = "amirhosein";
        presenter.onProfileFetched(result);


    }
}
