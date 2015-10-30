package com.uva.moviles.savethefrog;

import android.content.Context;
import android.opengl.GLSurfaceView;

/**
 * Created by Mario on 30/10/2015.
 */
public class MyGLSurfaceView extends GLSurfaceView{
    private MyGLRenderer mRenderer;

    public MyGLSurfaceView(Context context) {
        super(context);

        mRenderer = new MyGLRenderer();


        setEGLContextClientVersion(2);

        setRenderer(mRenderer);

    }

}
