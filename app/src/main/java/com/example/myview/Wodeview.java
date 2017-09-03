package com.example.myview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by 白玉春 on 2017/9/3.
 */

public class Wodeview extends LinearLayout{



    public Wodeview(final Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        TypedArray typedArray = context.obtainStyledAttributes(attrs,R.styleable.Topbar);

        final String lefttext = typedArray.getString(R.styleable.Topbar_lefttext );
        final int leftbg = typedArray.getColor(R.styleable.Topbar_leftbg, Color.BLUE);
        int lefttextcolor = typedArray.getColor(R.styleable.Topbar_leftTextcolor , Color.BLACK);
        float lefttextsize = typedArray.getDimension(R.styleable.Topbar_leftTextsize , 14);



        String Middletext = typedArray.getString(R.styleable.Topbar_MiddleText );
        int Middlebg = typedArray.getColor(R.styleable.Topbar_Middlebg, Color.WHITE);
        int Middletextcolor = typedArray.getColor(R.styleable.Topbar_MideleTextcolor , Color.BLACK);
        float Middletextsize = typedArray.getDimension(R.styleable.Topbar_Middlesize, 14);



        final String righttext = typedArray.getString(R.styleable.Topbar_righttext );
        int rightbg = typedArray.getColor(R.styleable.Topbar_rightbg, Color.BLACK);
        int righttextcolor = typedArray.getColor(R.styleable.Topbar_rightTextcolor , Color.BLACK);
        float righttextsize = typedArray.getDimension(R.styleable.Topbar_rightTextsize , 14);

        typedArray.recycle();


        View v = View.inflate(context, R.layout.topbar,this);
        final Button leftbu = (Button) v.findViewById(R.id.leftbutton);
        Button rightbu = (Button) v.findViewById(R.id.rightbutton);
        TextView textView = (TextView) v.findViewById(R.id.Middle);

        leftbu.setText(lefttext);
     //   leftbu.setBackgroundColor(leftbg);
        leftbu.setTextSize(lefttextsize);
        leftbu.setTextColor(lefttextcolor);

        rightbu.setText(righttext);
    //    rightbu.setBackgroundColor(rightbg);
        rightbu.setTextSize(righttextsize);
        rightbu.setTextColor(righttextcolor);

        textView.setText(Middletext);
    //    textView.setBackgroundColor(Middlebg);
        textView.setTextSize(Middletextsize);
        textView.setTextColor(Middletextcolor);


        leftbu.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "您点击了"+lefttext, Toast.LENGTH_SHORT).show();
            }
        });

        rightbu.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "您点击了"+righttext, Toast.LENGTH_SHORT).show();
            }
        });
    }




}
