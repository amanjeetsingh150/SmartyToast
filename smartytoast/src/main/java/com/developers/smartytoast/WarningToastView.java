package com.developers.smartytoast;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Amanjeet Singh on 03-Jun-17.
 */

public class WarningToastView extends View {

    private Paint paint=new Paint();
    private Paint circlepaint=new Paint();
    private int i=0;

    public WarningToastView(Context context, @Nullable AttributeSet attrs) {
        super(context);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.RED);
        paint.setAntiAlias(true);
        paint.setStrokeWidth(dip2px(2));
        circlepaint.setAntiAlias(true);
        circlepaint.setStyle(Paint.Style.FILL);
        circlepaint.setColor(Color.RED);
        post(animator);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawLine(getWidth()/2,0,getWidth()/2,5+i,paint);
        canvas.drawCircle(getWidth()/2,getHeight()-5,dip2px(2),circlepaint);
    }

    public int dip2px(float dpValue) {
        final float scale = getContext().getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }

    Runnable animator=new Runnable() {
        @Override
        public void run() {
            if(i<=getHeight()/2){
                i+=5;
            }
            else{
                i=0;
            }
            invalidate();
            postDelayed(this,300);
        }
    };
}
