package com.developers.smartytoast;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

/**
 * Created by Amanjeet Singh on 09-May-17.
 */

public class DoneToastView extends View {

    private Point start=new Point();
    private int i=10;
    private Point p=new Point();
    private int j=0;
    int flag=0;
    private Point stop=new Point();
    private Paint paint=new Paint();

    public DoneToastView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.BLACK);
        paint.setStrokeWidth(dip2px(2));
        paint.setAntiAlias(true);
        post(animator);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        start.x=getWidth()/2-10;
        start.y=getHeight()/2-10;
        canvas.drawLine(start.x,start.y,stop.x,stop.y,paint);
        if(flag==1){
            canvas.drawLine(getWidth()/2-2,getHeight()/2-2,p.x,p.y,paint);
        }
    }
    public int dip2px(float dpValue) {
        final float scale = getContext().getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }

    Runnable animator=new Runnable() {
        @Override
        public void run() {
            if(i>=0){
                stop.x=getWidth()/2-i;
                stop.y=getHeight()/2-i;
                i-=10;
            }
            else{
                while(j<=25){
                    flag=1;
                    Log.e("TAG","in else");
                    p.x=getWidth()/2+j;
                    p.y=getHeight()/2-j;
                    j+=5;
                }
            }

            invalidate();
            postDelayed(this,200);
        }
    };
}
