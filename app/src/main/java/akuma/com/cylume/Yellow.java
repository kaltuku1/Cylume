package akuma.com.cylume;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;

/**
 * Created by kaltuku1 on 4/3/15.
 */
public class Yellow extends Activity {
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.yellow);

        ActionBar actionBar = getActionBar();
        actionBar.hide();
    }

}
