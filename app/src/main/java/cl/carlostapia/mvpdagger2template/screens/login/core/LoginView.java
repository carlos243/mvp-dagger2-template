package cl.carlostapia.mvpdagger2template.screens.login.core;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import butterknife.ButterKnife;
import cl.carlostapia.mvpdagger2template.R;
import cl.carlostapia.mvpdagger2template.screens.login.LoginActivity;

/**
 * Created by CarlosTapia on 12-11-17.
 */

public class LoginView {

    private View view;

    public LoginView(LoginActivity loginActivity) {
        FrameLayout parent = new FrameLayout(loginActivity);
        parent.setLayoutParams(new FrameLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        view = LayoutInflater.from(loginActivity).inflate(R.layout.activity_splash, parent, true);
        ButterKnife.bind(view, loginActivity);
    }

    public View constructView() {
        return view;
    }
}
