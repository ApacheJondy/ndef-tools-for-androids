/***************************************************************************
 * 
 * This file is part of the 'NDEF Tools for Android' project at
 * http://code.google.com/p/ndef-tools-for-android/
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 ****************************************************************************/


package com.github.skjolber.ndef.example;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

/**
 * 
 * Boilerplate activity selector.
 * 
 * @author Thomas Rorvik Skjolberg
 *
 */

public class AndroidNfcActivity extends Activity {
	
    private static final String TAG = AndroidNfcActivity.class.getName();
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
		setContentView(R.layout.main);
		
		setTitle(R.string.app_name_description);
    }
    
    public void writer(View view) {
    	Log.d(TAG, "Show tag writer");
    	
    	Intent intent = new Intent(this, ForegroundDispatchWriterActivity.class);
    	startActivity(intent);
    }

    public void ndefReader(View view) {
    	Log.d(TAG, "Show NDEF reader_foreground_dispatch");
    	
    	Intent intent = new Intent(this, ForegroundDispatchReaderActivity.class);
    	startActivity(intent);
    }

    public void callbackReader(View view) {
        Log.d(TAG, "Show callback reader_foreground_dispatch");

        Intent intent = new Intent(this, ReaderCallbackActivity.class);
        startActivity(intent);
    }

    public void toggleIgnore(View view) {

    }

    public void toogleEnable(View view) {

    }

}
