package com.developers.smartytoast;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Amanjeet Singh on 03-Jun-17.
 */

public class ErrorToastView extends View {

    private Paint linepaint=new Paint();
    private Point endpoint=new Point();
    private int  i=0;
    public ErrorToastView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        linepaint.setStyle(Paint.Style.STROKE);
        linepaint.setStrokeWidth(dip2px(2));
        linepaint.setAntiAlias(true);
        linepaint.setColor(Color.RED);
        post(runnable);
    }

    public int dip2px(float dpValue) {
        final float scale = getContext().getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawLine(0,0,2.5f+i,4.3f+i,linepaint);
        canvas.drawLine(getWidth(),0,getWidth()-2.5f-i,4.3f+i,linepaint);
    }

    Runnable runnable=new Runnable() {
        @Override
        public void run() {

            if(i<200){
                i+=10;
            }
            else{
                i=0;
            }
            invalidate();
            postDelayed(this,300);
        }
    };
}
