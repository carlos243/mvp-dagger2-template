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

    public LoginView(LoginActivity context) {
        FrameLayout parent = new FrameLayout(context);
        parent.setLayoutParams(new FrameLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        view = LayoutInflater.from(context).inflate(R.layout.activity_splash, parent, true);
        ButterKnife.bind(view, context);
    }

    public View constructView() {
        return view;
    }
}
