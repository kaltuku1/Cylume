package akuma.com.cylume;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by kaltuku1 on 4/3/15.
 */
public class Blue extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.blue);

        ActionBar actionBar = getActionBar();
        actionBar.hide();

        Intent intent = new Intent(getApplication(), Yellow.class);
        startActivity(intent);
    }
}
