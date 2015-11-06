package com.example.jennifer.savethefrog;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/**
 * Created by Jennifer on 03/11/2015.
 */
public class MyGLRenderer implements GLSurfaceView.Renderer {
    private Cesped cesped;
    //Color Verde en formato R G B A 0 = min 1 = max
    private float[] colorCesped = { 0.0f, 1.0f,0.0f,1.0f};

    private final float[] mMVPMatrix = new float[16];
    //private final float[] mProjectionMatrix = new float[16];
    private final float[] mViewMatrix = new float[16];
    private final float[] mScalationMatrix = new float[16];
    private final float[] mTempMatrix = new float[16];
    private int[] _viewport;

    @Override
    public void onSurfaceCreated(GL10 gl, EGLConfig config) {
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);

        cesped = new Cesped();
        Matrix.translateM(cesped.mModelMatrix,0,0.0f,0.0f,0.0f);

        //Para escalar el modelo y lo guarda en mScalatio....
        Matrix.scaleM(mScalationMatrix, 0, cesped.mModelMatrix, 0, 6.0f, 4.0f, 1.0f);
        //Para aplicar el escalado a la matriz del modelo
        Matrix.multiplyMM(mTempMatrix, 0, mMVPMatrix, 0, mScalationMatrix, 0);
    }

    @Override
    public void onSurfaceChanged(GL10 gl, int width, int height) {
        GLES20.glViewport(0,0,width,height);

        _viewport = new int[]{0,0,width,height};

        float ratio = (float) width / height;
    }

    @Override
    public void onDrawFrame(GL10 gl) {
        GLES20.glClear(GLES20.GL_COLOR_BUFFER_BIT);

        //Matrix.setLookAtM(mViewMatrix, 0, 0, 0, 3, 0f, 0f, 0f, 0f, 1.0f, 0.0f);


        cesped.draw(colorCesped,mTempMatrix);

    }
}
