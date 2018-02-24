package nerds.ep.advance.profile;

/**
 * Created by hadi on 23/01/2018.
 */

public interface ProfileContract {
    interface View {
        void showWelcome(String msg);
        void showUserName(String username);

    }

    interface Presenter {
        void attachView(View view);
        void OnShowUserSelect(String userID);
        void onProfileFetched(String username);


    }


}
