package com.wingki_202102318.uas202102318;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CuacaViewHolder extends RecyclerView.ViewHolder {
    public TextView namaTextView,deskripsiTextView,tglWaktuTextView,suhuTextView;

    public CuacaViewHolder(@NonNull View itemView) {
        super(itemView);
        namaTextView = itemView.findViewById(R.id.namaTextView);
        deskripsiTextView = itemView.findViewById(R.id.deskripsiTextView);
        tglWaktuTextView = itemView.findViewById(R.id.tglWaktuTextView);
        suhuTextView = itemView.findViewById(R.id.suhuTextView);
    }
}