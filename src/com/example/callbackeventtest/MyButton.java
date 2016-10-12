package com.example.callbackeventtest;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.Button;
import android.widget.Toast;

public class MyButton extends Button{
	private Context context;
	public MyButton(Context context,AttributeSet attrs){
		super(context,attrs);
		this.context=context;
	}
	public boolean onTouchEvent(MotionEvent event){
		Toast.makeText(context, "MyButton中触发事件了！", Toast.LENGTH_SHORT).show();
		return true;
	}
}
