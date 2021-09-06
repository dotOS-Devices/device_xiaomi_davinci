package org.lineageos.settings.vibrator;

import android.os.Bundle;
import org.lineageos.settings.MonetPreferenceActivity;

public class VibratorSettingsActivity extends MonetPreferenceActivity {

    private static final String TAG = "VibratorSettingsActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getFragmentManager().beginTransaction().replace(android.R.id.content,
                new VibratorSettings(), TAG).commit();
    }
}
