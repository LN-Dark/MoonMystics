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

        MaterialButton btn_meditar_whatis = root.findViewById(R.id.btn_meditar_cursomeditacao);
        MaterialButton btn_meditar_sentado = root.findViewById(R.id.btn_meditar_5tiposconsciencia);
        MaterialButton btn_meditar_andar = root.findViewById(R.id.btn_meditar_segredossucesso);
        MaterialButton btn_meditar_fundamentos = root.findViewById(R.id.btn_meditar_osmaisimportantesprincipiosdavida);
        MaterialButton btn_meditar_prestracao = root.findViewById(R.id.btn_meditar_saude);
        MaterialButton btn_meditar_diaadia = root.findViewById(R.id.btn_meditar_16pontos);
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
                Uri uri = Uri.parse("https://www.youtube.com/playlist?list=PLtXup65mEgK255lP_3VNHla3dBaLI7MvZ");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        btn_meditar_sentado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.youtube.com/playlist?list=PLtXup65mEgK2jIU8Dcn0UTMRvlaxJG7r8");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        btn_meditar_andar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.youtube.com/playlist?list=PLtXup65mEgK1D_Krt4fsLlGNj7-QgyqIR");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        btn_meditar_fundamentos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.youtube.com/playlist?list=PLtXup65mEgK2_IblKxbOUYm9RrGJ-uUTj");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        btn_meditar_prestracao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.youtube.com/playlist?list=PLtXup65mEgK3-9QONjXpCbIaDZ7xzSjLq");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        btn_meditar_diaadia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.youtube.com/playlist?list=PLtXup65mEgK2FKFJE40L1ofL06slg3KuX");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        return root;
    }

}
