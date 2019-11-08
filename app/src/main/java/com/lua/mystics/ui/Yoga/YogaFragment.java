package com.lua.mystics.ui.Yoga;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.google.android.material.button.MaterialButton;
import com.lua.mystics.R;

public class YogaFragment extends Fragment {
    private View root;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
         root = inflater.inflate(R.layout.fragment_yoga, container, false);
        MaterialButton btn_Saude = root.findViewById(R.id.btn_yoga_health);
        MaterialButton btn_sucesso = root.findViewById(R.id.btn_yoga_sucesso);
        MaterialButton btn_bemestar = root.findViewById(R.id.btn_yoga_bemestar);
        MaterialButton btn_paz = root.findViewById(R.id.btn_yoga_paz);
        MaterialButton btn_prazer = root.findViewById(R.id.btn_yoga_felicidade);
        MaterialButton btn_exploracaointerior = root.findViewById(R.id.btn_yoga_exploracaointerior);
        MaterialButton btn_amor = root.findViewById(R.id.btn_yoga_amor);
        MaterialButton btn_documentario = root.findViewById(R.id.btn_yoga_Documentario);
        MaterialButton btn_exerciciosSeguidos = root.findViewById(R.id.btn_yoga_exerciciosseguidos);

        MaterialButton btn_Saude_what = root.findViewById(R.id.btn_yoga_health_what);
        MaterialButton btn_sucesso_what = root.findViewById(R.id.btn_yoga_sucesso_what);
        MaterialButton btn_bemestar_what = root.findViewById(R.id.btn_yoga_bemestar_what);
        MaterialButton btn_paz_what = root.findViewById(R.id.btn_yoga_paz_what);
        MaterialButton btn_prazer_what = root.findViewById(R.id.btn_yoga_felicidade_what);
        MaterialButton btn_exploracaointerior_what = root.findViewById(R.id.btn_yoga_exploracaointerior_what);
        MaterialButton btn_amor_what = root.findViewById(R.id.btn_yoga_amor_what);

        btn_exerciciosSeguidos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=NlHxdqtUrjo");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        btn_documentario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=Jf5qUhz-FVk&t");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        btn_Saude.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=M9VSpOiwwDU");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        btn_sucesso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=JnhUmq0va4A");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        btn_bemestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=PMQVe_i6tZQ");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        btn_paz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=q5m6tMjcF8k");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        btn_prazer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=Ug8OoFAFfZ0");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        btn_exploracaointerior.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=C_xsXnRd_uc");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        btn_amor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=lx6Zr6lrTaI");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        btn_Saude_what.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=uhWr1jCXgKw");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        btn_sucesso_what.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=MLpb8ee3Ypc");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        btn_bemestar_what.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=xMyXvroH48w");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        btn_paz_what.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=ng9pFkb3nko");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        btn_prazer_what.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=J69NF6aXY6s&t");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        btn_exploracaointerior_what.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=ALRUelXygdE");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        btn_amor_what.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=BUCYjed-3Jo&t=5s");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        return root;
    }
}