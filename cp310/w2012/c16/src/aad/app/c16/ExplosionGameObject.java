package aad.app.c16;

import android.graphics.Bitmap;
import android.graphics.Canvas;

public class ExplosionGameObject implements GameObject {

    private AnimatedSprite mSprite;

    private int mX;
    private int mY;

    public ExplosionGameObject(Bitmap bitmap) {

        mSprite = new AnimatedSprite();
        mSprite.initialize(bitmap, 160, 120, 24, 20, false);
    }

    @Override
    public GameObjectType getType() {

        return GameObjectType.Explosion;
    }

    @Override
    public AnimatedSprite getSprite() {

        return mSprite;
    }

    @Override
    public void draw(Canvas canvas) {

        mSprite.draw(canvas, mX, mY);
    }

    @Override
    public void update(long gameTime) {

        mSprite.update(gameTime);
    }

    @Override
    public int getX() {

        return mX;
    }

    @Override
    public int getY() {

        return mY;
    }

    @Override
    public void setX(int x) {

        mX = x;

    }

    @Override
    public void setY(int y) {

        mY = y;

    }

}
