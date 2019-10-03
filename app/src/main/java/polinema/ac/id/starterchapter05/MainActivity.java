package polinema.ac.id.starterchapter05;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    Fragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragment = getSupportFragmentManager().findFragmentById(R.id.fragment_placeholder);
        pushup();
    }

    public void handlePushup(View view) {
        if (fragment == null || fragment instanceof DipsFragment || fragment instanceof HandstandFragment) {
            pushup();
        }
    }

    public void handleDips(View view) {
        if (fragment == null || fragment instanceof PushupFragment || fragment instanceof HandstandFragment) {
            dips();
        }
    }

    public void handleHandstand(View view) {
        if (fragment == null || fragment instanceof DipsFragment || fragment instanceof PushupFragment) {
            handstand();
        }
    }

    public void pushup() {
        PushupFragment checkVisible = (PushupFragment) getSupportFragmentManager().findFragmentByTag("PUSHUP_FRAGMENT");
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        if (checkVisible != null && checkVisible.isVisible()){

        }
        else {
            fragmentTransaction.setCustomAnimations(R.anim.enter_from_left,R.anim.exit_from_left,R.anim.enter_from_left,R.anim.exit_from_right);
            fragmentTransaction.replace(R.id.fragment_placeholder,new PushupFragment(),"PUSHUP_FRAGMENT");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }

    public void dips() {
        DipsFragment checkVisible = (DipsFragment) getSupportFragmentManager().findFragmentByTag("DIPS_FRAGMENT");
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        if (checkVisible != null && checkVisible.isVisible()){

        }
        else {
            fragmentTransaction.setCustomAnimations(R.anim.enter_from_left,R.anim.exit_from_left,R.anim.enter_from_left,R.anim.exit_from_right);
            fragmentTransaction.replace(R.id.fragment_placeholder,new DipsFragment(),"DIPS_FRAGMENT");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }

    public void handstand() {
        HandstandFragment checkVisible = (HandstandFragment) getSupportFragmentManager().findFragmentByTag("HANDSTAND_FRAGMENT");
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        if (checkVisible != null && checkVisible.isVisible()){

        }
        else {
            fragmentTransaction.setCustomAnimations(R.anim.enter_from_left,R.anim.exit_from_left,R.anim.enter_from_left,R.anim.exit_from_right);
            fragmentTransaction.replace(R.id.fragment_placeholder,new HandstandFragment(),"HANDSTAND_FRAGMENT");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }
}
