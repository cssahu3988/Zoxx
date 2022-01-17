package com.example.rityan.classes;

import android.content.Context;
import android.view.View;

import com.example.rityan.MainActivity;
import com.example.rityan.databinding.BottomTabLayoutBinding;

public class BottomNavigationBar {

    public Boolean[] sList = {false,true,true,true,true};
    public Boolean[] bList = {true,false,false,false,false};
    public boolean s1, s2,s3,s4,s5,b1,b2,b3,b4,b5;
    MainActivity context;
    BottomTabLayoutBinding bottomTabLayoutBinding = null;
    BottomNavigationBar bottomNavigationBar=null;
    OnClickListener onClickListener;

    public BottomNavigationBar(){

    }

    public BottomNavigationBar(boolean s1, boolean s2, boolean s3, boolean s4, boolean s5, boolean b1, boolean b2, boolean b3, boolean b4, boolean b5, MainActivity context, OnClickListener onClickListener) {

        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
        this.s4 = s4;
        this.s5 = s5;
        this.b1 = b1;
        this.b2 = b2;
        this.b3 = b3;
        this.b4 = b4;
        this.b5 = b5;
        this.context=context;
        this.onClickListener=onClickListener;
        bottomNavigationBar=this;
    }

    public BottomTabLayoutBinding getBinding(Context context) {
        if (bottomTabLayoutBinding==null){
            bottomTabLayoutBinding = BottomTabLayoutBinding.inflate(this.context.getLayoutInflater());
            bottomTabLayoutBinding.setModel(bottomNavigationBar);
            bottomTabLayoutBinding.setBList(bList);
            bottomTabLayoutBinding.setSList(sList);
            setClickListeners();
        }
        return bottomTabLayoutBinding;
    }

    private void setClickListeners() {
        bottomTabLayoutBinding.imageView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (int i=0;i<5;i++){
                    sList[i] = true;
                    bList[i] = false;
                }
                sList[0] = false;
                bList[0] = true;
                bottomTabLayoutBinding.setBList(bList);
                bottomTabLayoutBinding.setSList(sList);
                onClickListener.OnClick(1);
            }
        });
        bottomTabLayoutBinding.imageView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (int i=0;i<5;i++){
                    sList[i] = true;
                    bList[i] = false;
                }
                sList[1] = false;
                bList[1] = true;
                bottomTabLayoutBinding.setBList(bList);
                bottomTabLayoutBinding.setSList(sList);
                onClickListener.OnClick(2);
            }
        });
        bottomTabLayoutBinding.imageView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (int i=0;i<5;i++){
                    sList[i] = true;
                    bList[i] = false;
                }
                sList[2] = false;
                bList[2] = true;
                bottomTabLayoutBinding.setBList(bList);
                bottomTabLayoutBinding.setSList(sList);
                onClickListener.OnClick(3);
            }
        });
        bottomTabLayoutBinding.imageView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (int i=0;i<5;i++){
                    sList[i] = true;
                    bList[i] = false;
                }
                sList[3] = false;
                bList[3] = true;
                bottomTabLayoutBinding.setBList(bList);
                bottomTabLayoutBinding.setSList(sList);
                onClickListener.OnClick(4);
            }
        });
        bottomTabLayoutBinding.imageView10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (int i=0;i<5;i++){
                    sList[i] = true;
                    bList[i] = false;
                }
                sList[4] = false;
                bList[4] = true;
                bottomTabLayoutBinding.setBList(bList);
                bottomTabLayoutBinding.setSList(sList);
                onClickListener.OnClick(5);
            }
        });
    }

    public boolean isS1() {
        return s1;
    }

    public void setS1(boolean s1) {
        this.s1 = s1;
    }

    public boolean isS2() {
        return s2;
    }

    public void setS2(boolean s2) {
        this.s2 = s2;
    }

    public boolean isS3() {
        return s3;
    }

    public void setS3(boolean s3) {
        this.s3 = s3;
    }

    public boolean isS4() {
        return s4;
    }

    public void setS4(boolean s4) {
        this.s4 = s4;
    }

    public boolean isS5() {
        return s5;
    }

    public void setS5(boolean s5) {
        this.s5 = s5;
    }

    public boolean isB1() {
        return b1;
    }

    public void setB1(boolean b1) {
        this.b1 = b1;
    }

    public boolean isB2() {
        return b2;
    }

    public void setB2(boolean b2) {
        this.b2 = b2;
    }

    public boolean isB3() {
        return b3;
    }

    public void setB3(boolean b3) {
        this.b3 = b3;
    }

    public boolean isB4() {
        return b4;
    }

    public void setB4(boolean b4) {
        this.b4 = b4;
    }

    public boolean isB5() {
        return b5;
    }

    public void setB5(boolean b5) {
        this.b5 = b5;
    }

    public class ClickListener{
        public void Click1(View view,BottomNavigationBar model){
            model.setB1(true);
            model.setB2(true);
            model.setB3(true);
            model.b4=false;
            model.b5=false;

            model.s1=false;
            model.s2=true;
            model.s3=true;
            model.s4=true;
            model.s5=true;
        }
        public void Click2(View view,BottomNavigationBar model){
            model.b1=false;
            model.b2=true;
            model.b3=false;
            model.b4=false;
            model.b5=false;

            model.s1=true;
            model.s2=false;
            model.s3=true;
            model.s4=true;
            model.s5=true;
        }
        public void Click3(View view,BottomNavigationBar model){
            b1=false;
            b2=false;
            b3=true;
            b4=false;
            b5=false;

            s1=true;
            s2=true;
            s3=false;
            s4=true;
            s5=true;
        }
        public void Click4(View view,BottomNavigationBar model){
            b1=false;
            b2=false;
            b3=false;
            b4=true;
            b5=false;

            s1=true;
            s2=true;
            s3=true;
            s4=false;
            s5=true;
        }
        public void Click5(View view,BottomNavigationBar model){
            b1=false;
            b2=false;
            b3=false;
            b4=false;
            b5=true;

            s1=true;
            s2=true;
            s3=true;
            s4=true;
            s5=false;
        }
    }

    public interface OnClickListener{
        public void OnClick(int id);
    }

}
