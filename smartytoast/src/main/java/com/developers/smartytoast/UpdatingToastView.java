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

public class UpdatingToastView extends View {

    private int sweepAngle1 = 220;
    private int startAngle1 = 120;

    private RectF oval=new RectF();

    private Paint paint=new Paint();

    public UpdatingToastView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        paint.setAntiAlias(true);
        paint.setColor(Color.parseColor("#1919ff"));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(5);
        post(animator);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        oval.set(getWidth()/2-15,getHeight()/2-15,getWidth()/2+15,getHeight()/2+15);
        canvas.drawArc(oval,startAngle1,sweepAngle1,false,paint);
    }
    Runnable animator=new Runnable() {
        @Override
        public void run() {
            if(startAngle1<=360){
                startAngle1+=10;
            }
            else {
                startAngle1=1;
            }
            invalidate();
            postDelayed(this,30);
        }
    };
}
