package com.example.drawshapes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new myview(this));
    }
    private class myview extends View
    {
        public myview(Context context){
            super(context);
        }
        @Override
        protected void onDraw(Canvas canvas){
            super.onDraw(canvas);
            Paint paint=new Paint();
            paint.setTextSize(40);
            paint.setColor(Color.BLUE);
            canvas.drawText("Circle",55,30,paint);
            paint.setColor(Color.RED);
            canvas.drawCircle(100,150,100,paint);
            paint.setColor(Color.GREEN);
           // canvas.drawArc(10,20,30,40,paint);
           //canvas.drawArc(900,900,20,30,50,90,true,paint);



            paint.setColor(Color.GREEN);
            canvas.drawText("Rectangle",255,30,paint);
            paint.setColor(Color.YELLOW);
            canvas.drawRect(250,50,400,350,paint);
            paint.setColor(Color.GREEN);
            canvas.drawText("Square",55,430,paint);
            paint.setColor(Color.BLACK);
            canvas.drawRect(50,450,150,550,paint);
            paint.setColor(Color.BLUE);
            canvas.drawText("Line",255,430,paint);
            paint.setStrokeWidth(20);
            paint.setColor(Color.CYAN);
            canvas.drawLine(250,600,350,500,paint);
            final RectF oval = new RectF();
            paint.setStyle(Paint.Style.STROKE);
            /*
             * drawArc(RectF oval, float startAngle, float sweepAngle, boolean useCenter, Paint paint)
             *
             * oval - The bounds of oval used to define the shape and size of the arc
             * startAngle - Starting angle (in degrees) where the arc begins
             * sweepAngle - Sweep angle (in degrees) measured clockwise
             * useCenter - If true, include the center of the oval in the arc, and close it if it is being stroked. This will draw a wedge
             * paint - The paint used to draw the arc
             */
            oval.set(550, 150, 550, 750);
            canvas.drawArc(oval, 0, 30, false, paint);

        }
    }



}