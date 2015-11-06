package com.example.jennifer.savethefrog;

import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Jennifer on 03/11/2015.
 */
public class Simulacion extends AppCompatActivity {

    private GLSurfaceView mGLView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mGLView = new MyGLSurfaceView(this);

        setContentView(mGLView);
    }

}
