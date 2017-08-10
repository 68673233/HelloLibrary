package com.example.liwb.kotlin;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liwb on 2017/8/10.
 */

public class Test {

    private String TAG;

    public String getTAG() {
        return TAG;
    }

    public void setTAG(String TAG) {
        this.TAG = TAG;
    }


    private List<Integer> list=new ArrayList<>();

    public Test(){

    }

    private int getIndex(){
        if (list!=null) return list.size();
        return 0;
    }

    private void setIndex(Integer i){
        if (list!=null) list.add(i);
    }

}
