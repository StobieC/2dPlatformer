package net.gametutorial.andengineframework.scenes;

import android.app.Activity;

import net.gametutorial.andengineframework.managers.ResourceManager;
import net.gametutorial.andengineframework.managers.SceneManager;

import org.andengine.engine.Engine;
import org.andengine.engine.camera.BoundCamera;
import org.andengine.engine.camera.Camera;
import org.andengine.entity.scene.Scene;
import org.andengine.opengl.vbo.VertexBufferObjectManager;

/**
 * Created by cameron on 24/07/15.
 */
public abstract class BaseScene extends Scene {

    protected Engine engine;
    protected Activity activity;
    protected ResourceManager resourceManager;
    protected VertexBufferObjectManager vbom;
    protected BoundCamera camera;

    //constructor
    public BaseScene()
    {
        this.resourceManager = ResourceManager.getInstance();
        this.engine = resourceManager.engine;
        this.activity = resourceManager.activity;
        this.vbom = resourceManager.vbom;
        this.camera = resourceManager.camera;
        createScene();
    }


    //Abstraction
    public abstract void createScene();
    public abstract void onBackKeyPressed();
    public abstract SceneManager.SceneType getSceneType();
    public abstract void disposeScene();
}
