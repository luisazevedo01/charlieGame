package org.academiadecodigo.thunderstructs.charlieteam;

import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.thunderstructs.charlieteam.field.FieldPosition;

public class Player implements KeyboardHandler {
    private Picture picture;
    private FieldPosition initPos;

    public Player(Picture picture){
        this.picture = picture;
        picture.grow(-25,-25);
        draw();
    }

    public void draw(){
        this.picture.draw();
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {

    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}
