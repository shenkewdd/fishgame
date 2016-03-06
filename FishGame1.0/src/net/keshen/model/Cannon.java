package net.keshen.model;

import net.keshen.base.adapter.DrawableAdapter;
import net.keshen.base.graphics.Canvas;
import net.keshen.base.graphics.Matrix;
import net.keshen.base.graphics.Paint;
import net.keshen.base.model.Bitmap;

/**
 * 大炮
 * @author shenke
 * @date 2016年2月21日下午8:04:39
 * @version 1.0
 */
public class Cannon extends DrawableAdapter{

	private Bitmap[] cannoImage;
	private int[] cannoPicIds;
	
	private int currentImageId;
	private int cannoRotate_x;//旋转点的x坐标
	private int cannoRotate_y;//旋转点的y坐标
	
	@Override
	public Bitmap getCurrentPic() {
		return cannoImage[currentImageId];
	}

	@Override
	public int getPicWidth() {
		return getCurrentPic().getWidth();
	}

	@Override
	public int getPicHeight() {
		return getCurrentPic().getHeight();
	}

	@Override
	public void onDraw(Canvas canvas, Paint paint) {
		canvas.draw(getCurrentPic(), getMatrix(), paint);
	}

	@Override
	public Matrix getPicMatrix() {
		return getMatrix();
	}

	@Override
	public String getDrawableName() {
		return null;
	}

}
