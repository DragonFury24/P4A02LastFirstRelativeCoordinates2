package com.dragonfury.duy.p4a02lastfirstrelativecoordinates2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;

/**
 * Created by 1383504 on 11/22/2016.
 */
public class DrawView extends View {
    public DrawView(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint nam = new Paint();
        canvas.drawCircle((float)(getWidth()*.5),(float).5*getHeight(),(float).0625*getWidth(),nam);
        nam.setStrokeWidth(10);
        //Draw Vertical Lines
        for(int i=0;i<8;i++) {
            canvas.drawLine((float)(i*.125*getWidth()),0,(float)(i*.125*getWidth()),getHeight(),nam);
        }
        //Draw Horizontal Lines
        for (int i=0;i<8;i++) {
            canvas.drawLine(0,(float)(i*.125*getHeight()),getWidth(),(float)(i*.125*getHeight()),nam);
        }
        nam.setColor(Color.BLUE);
        nam.setStyle(Paint.Style.STROKE);
        RectF nammy = new RectF((float)(.75*getWidth()),0,getWidth(),(float)(.25*getHeight()));
        canvas.drawRect(nammy,nam);
        canvas.drawLine(nammy.left,nammy.top,nammy.right,nammy.bottom,nam);
        canvas.drawLine(nammy.right,nammy.top,nammy.left,nammy.bottom,nam);
        RectF namnamnam = new RectF(0,(float)(6*.125*getHeight()),(float)(2*.125*getWidth()),getHeight());
        canvas.drawRect(namnamnam,nam);
        RectF eric = new RectF((float)(.75*getWidth()),(float)(6*.125*getHeight()),getWidth(),getHeight());
        canvas.drawRect(eric,nam);
        nam.setColor(Color.RED);
        nam.setStyle(Paint.Style.FILL);
        canvas.drawCircle(namnamnam.centerX(),namnamnam.centerY(),namnamnam.width()/2,nam);
        nam.setColor(Color.BLACK);
        canvas.drawCircle(eric.centerX(),eric.centerY(),eric.width()/2,nam);
    }
}

