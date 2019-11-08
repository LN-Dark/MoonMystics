package com.lua.mystics.ui.Meditar;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.button.MaterialButton;
import com.lua.mystics.R;


public class MeditarFragment extends Fragment {
    private View root;

    public MeditarFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        root = inflater.inflate(R.layout.fragment_meditar, container, false);

        MaterialButton btn_meditar_whatis = root.findViewById(R.id.btn_meditar_whatis);
        MaterialButton btn_meditar_sentado = root.findViewById(R.id.btn_meditar_sentado);
        MaterialButton btn_meditar_andar = root.findViewById(R.id.btn_meditar_andar);
        MaterialButton btn_meditar_fundamentos = root.findViewById(R.id.btn_meditar_fundamentos);
        MaterialButton btn_meditar_prestracao = root.findViewById(R.id.btn_meditar_prestracao);
        MaterialButton btn_meditar_diaadia = root.findViewById(R.id.btn_meditar_diaadia);

        MaterialButton btn_meditar_musica = root.findViewById(R.id.btn_meditar_Musica);

        btn_meditar_musica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.youtube.com/channel/UCPF-YXh4LdqA7sykdjpPrHw/videos");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        btn_meditar_whatis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=hLvU7ppM4vE");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        btn_meditar_sentado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=mH2sEqrCza4");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        btn_meditar_andar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=_IFvablc6EI");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        btn_meditar_fundamentos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=3xLBrUFuyKg&t");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        btn_meditar_prestracao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=AjMK5S2hnOo&t");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        btn_meditar_diaadia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=9dt8HWeryFA&t");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        return root;
    }

}
