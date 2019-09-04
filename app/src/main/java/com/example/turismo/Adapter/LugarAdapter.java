package com.example.turismo.Adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.example.turismo.Modelos.Lugares;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class LugarAdapter extends ArrayAdapter<Lugares> {

    private Context context;
    private List<Lugares> lugares;

    public  LugarAdapter(Context context, ArrayList<Lugares> lugares){
        super(context,0, lugares);
        this.lugares = lugares;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return super.getView(position, convertView, parent);

    }
}
