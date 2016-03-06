package net.keshen.base.model.interfaces;

import net.keshen.base.graphics.Canvas;
import net.keshen.base.graphics.Matrix;
import net.keshen.base.graphics.Paint;
import net.keshen.base.model.Bitmap;

/**
 * @author shenke
 * @date 2016年2月21日下午12:21:11
 * @version 1.0
 */
public interface Drawable {

	public Matrix getPicMatrix();
	
	public Bitmap getCurrentPic();
	
	public int getPicWidth();
	
	public int getPicHeight();
	
	public void onDraw(Canvas canvas,Paint paint);
	
	public String getDrawableName();
}
