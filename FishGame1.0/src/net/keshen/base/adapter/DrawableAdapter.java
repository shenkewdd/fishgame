package net.keshen.base.adapter;

import net.keshen.base.graphics.Canvas;
import net.keshen.base.graphics.Matrix;
import net.keshen.base.graphics.Paint;
import net.keshen.base.model.interfaces.Drawable;

/**
 * @author shenke
 * @date 2016年2月21日下午7:33:38
 * @version 1.0
 */
public abstract class DrawableAdapter implements Drawable{

	private Matrix matrix;
	
	public Matrix getMatrix(){
		return matrix;
	}

	@Override
	public void onDraw(Canvas canvas, Paint paint) {
		canvas.draw(this.getCurrentPic(), this.getMatrix(), paint);
	}
	
}
