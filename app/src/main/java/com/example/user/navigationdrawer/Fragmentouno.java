package com.example.user.navigationdrawer;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Fragmentouno extends Fragment{
    View myView;
    private ViewCanvas customCanvas;

    public void setMiactivity(MainActivity miactivity) {
        this.miactivity = miactivity;
    }

    private MainActivity miactivity;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.first_layout, container, false);
        customCanvas = (ViewCanvas) miactivity.findViewById(R.id.signature_canvas);
        return  myView;
    }
    public void clearCanvas(View v) {
        customCanvas.clearCanvas();
    }

}

