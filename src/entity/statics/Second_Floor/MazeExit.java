package entity.statics.Second_Floor;

import GFX.Assets;
import entity.statics.StaticEntity;
import main.Handler;

import java.awt.*;

public class MazeExit extends StaticEntity {

    private int id;

    public MazeExit(Handler handler, float x, float y,int id) {
        super(handler, x, y, 100, 200, id);
        this.id = id;

        bounds.x = 0;
        bounds.y = 0;
        bounds.width = 100;
        bounds.height = 130;
    }

    @Override
    public void tick() {

    }

    @Override
    public void render(Graphics g) {
        g.drawImage(Assets.mazeExit, (int)(x- handler.getGameCamera().getxOffset()),
                (int)(y- handler.getGameCamera().getyOffset()), 100, 200, null);
    }

    @Override
    public void die() {

    }

    @Override
    public void interact() {

    }

    @Override
    public boolean isInteract() {
        return true;
    }

    @Override
    public boolean isHurts() {
        return true;
    }

    @Override
    public int getId() {
        return 31;
    }
}
