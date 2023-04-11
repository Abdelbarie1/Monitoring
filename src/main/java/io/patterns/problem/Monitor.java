package io.patterns.problem;

import io.patterns.Button;
import io.patterns.Image;
import io.patterns.Layout;

public class Monitor {

    private String displayMode;

    private Button button;

    private Image image;

    private Layout layout;
    public Monitor(String displayMode) {
        this.displayMode=displayMode;
        if(displayMode.equals("desktop")){
            this.layout=new Window();
            this.image=new WideImage();
            this.button=new PushButton();
        }
        if(displayMode.equals("mobile")){
            this.layout=new Screen();
            this.image=new NarrowImage();
            this.button=new TouchButton();
        }
    }

    public String layout() {
        return layout.getLayout();
    }

    public String image() {
        return image.getImage();
    }

    public String button() {
        // TODO
        return button.getButton();
    }
}
