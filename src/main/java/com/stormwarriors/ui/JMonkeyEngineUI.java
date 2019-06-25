package com.stormwarriors.ui;

import com.jme3.app.SimpleApplication;
import com.jme3.app.state.BaseAppState;
import com.jme3.math.Vector3f;

public class JMonkeyEngineUI extends SimpleApplication implements UI {

    @Override
    public void init(String[] args) {
//        simpleInitApp();
    }

    @Override
    public void simpleInitApp() {
        cam.setParallelProjection(true);
        cam.setLocation(new Vector3f(0,0,0.5f));
        getFlyByCamera().setEnabled(false);

        setDisplayStatView(false);
        setDisplayFps(true);
    }

    @Override
    public void start() {
        super.start();
    }

}
