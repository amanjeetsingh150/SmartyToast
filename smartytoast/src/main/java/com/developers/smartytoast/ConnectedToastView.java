package com.developers.smartytoast;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Amanjeet Singh on 04-Jun-17.
 */

public class ConnectedToastView extends View {

    private RectF oval=new RectF();
    private Paint paint =new Paint();
    private RectF oval1=new RectF();
    private RectF oval2=new RectF();

    public ConnectedToastView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        paint.setStrokeWidth(dip2px(2));
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        paint.setColor(Color.BLUE);
    }

    public int dip2px(float dpValue) {
        final float scale = getContext().getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        oval.set(getWidth()/2-5,getHeight()/2-5,getWidth()/2+5,getHeight()/2+5);
        canvas.drawArc(oval,-20,-140,false,paint);
        oval1.set(getWidth()/2-15,getHeight()/2-15,getWidth()/2+15,getHeight()/2+15);
        canvas.drawArc(oval1,-20,-140,false,paint);
        oval2.set(getWidth()/2-25,getHeight()/2-25,getWidth()/2+25,getHeight()/2+25);
        canvas.drawArc(oval2,-20,-140,false,paint);
    }
}
