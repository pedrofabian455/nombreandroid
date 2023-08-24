package com.pedro.nombre;

import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private static String TAG = "ActivityName";

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);
    }

    //Almacena el texto que ingreso el usuario
    protected void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        Log.i(TAG,"onSaveInstanceState");

        final EditText editText = (EditText) findViewById(R.id.editText);
        CharSequence texto = editText.getText();
        outState.putCharSequence("savedText", texto);

    }
@Override
    protected void onRestoreInstanceState(Bundle savedInstanceState){
        super.onRestoreInstanceState(savedInstanceState);
        Log.i(TAG, "onRestoreInstanceState");

        final TextView textView = (TextView) findViewById(R.id.textView);


    CharSequence savedText = savedInstanceState.getCharSequence("savedText");

    textView.setText(savedText);

}
}
