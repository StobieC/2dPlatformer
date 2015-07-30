package net.gametutorial.andengineframework.scenes;

import net.gametutorial.andengineframework.managers.SceneManager;

import org.andengine.entity.scene.background.Background;
import org.andengine.entity.text.Text;
import org.andengine.util.adt.color.Color;

/**
 * Created by cameron on 27/07/15.
 */
public class LoadingScene extends BaseScene {

    @Override
    public void createScene()
    {
        setBackground(new Background(Color.WHITE));
        attachChild(new Text(400, 240, resourceManager.font, "Loading...", vbom));
    }

    @Override
    public void onBackKeyPressed() {
        return;
    }

    @Override
    public SceneManager.SceneType getSceneType() {
        return SceneManager.SceneType.SCENE_LOADING;
    }

    @Override
    public void disposeScene() {

    }
}
