package au.com.iglooit.andriodcore.activity;

import android.app.TabActivity;
import android.os.Bundle;
import org.droidparts.inject.Injectable;
import org.droidparts.inject.Injector;

public class IGTTabActivity extends TabActivity implements Injectable, IDisplay
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        onPreInject();
        Injector.get().inject(this);
    }

    @Override
    public void onPreInject()
    {
    }
}
