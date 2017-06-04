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

public class SavedToastView extends View {

    private Paint paint=new Paint();
    private int i=0;


    public SavedToastView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        paint.setAntiAlias(true);
        paint.setStrokeWidth(dip2px(2));
        paint.setColor(Color.BLACK);
    }
    public int dip2px(float dpValue) {
        final float scale = getContext().getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawLine(getWidth()/2,0,getWidth()/2,getHeight()-5,paint);
        canvas.drawLine(getWidth()/2-15,getHeight()-15,getWidth()/2,getHeight()-5,paint);
        canvas.drawLine(getWidth()/2,getHeight()-5,getWidth()/2+15,getHeight()-15,paint);
        paint.setColor(Color.BLACK);
    }

}
