package org.academiadecodigo.thunderstructs.charlieteam.gameObjects;

import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.thunderstructs.charlieteam.field.Field;
import org.academiadecodigo.thunderstructs.charlieteam.field.FieldPosition;

import javax.swing.text.Position;

public class Cheeseburguer extends GameObject {

    // private Picture picture = new Picture(getFieldPos().getCol(),getFieldPos().getRow(), "spr_burguer.png");

    public Cheeseburguer(Field field, FieldPosition pos){
       super(field , pos);
       setPicture(new Picture(getFieldPos().getY(), getFieldPos().getX(), "spr_burguer.png"));
       getPicture().grow(-25, -25);

    }
}
