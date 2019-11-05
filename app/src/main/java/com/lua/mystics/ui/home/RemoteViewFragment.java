package com.lua.mystics.ui.home;

import android.content.res.AssetManager;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.google.android.material.button.MaterialButton;
import com.lua.mystics.R;

import java.io.IOException;
import java.io.InputStream;
import java.util.Random;

public class RemoteViewFragment extends Fragment {
    private View root;
    private MaterialButton btn_Mostrar_Next;
    private ImageView img_imagem;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        root = inflater.inflate(R.layout.fragment_remoteview, container, false);
        btn_Mostrar_Next = root.findViewById(R.id.btn_remoteview_mostrar);
        img_imagem = root.findViewById(R.id.img_remoteview_Adivinhar);

        return root;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        btn_Mostrar_Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btn_Mostrar_Next.getText().equals(getString(R.string.mostrar))){
                    try {
                        AssetManager assetManager = root.getContext().getAssets();
                        String[] str = assetManager.list("remoteview");
                        Random rand = new Random();
                        InputStream ims = null;
                        if (str != null) {
                            ims = assetManager.open("remoteview/" + str[rand.nextInt(str.length)]);
                        }
                        Drawable d = Drawable.createFromStream(ims, null);
                        img_imagem.setImageDrawable(d);
                        btn_Mostrar_Next.setText(getString(R.string.tentarnovamente));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }else {
                    img_imagem.setImageDrawable(root.getResources().getDrawable(R.drawable.interrogation));
                    btn_Mostrar_Next.setText(getString(R.string.mostrar));
                }
            }
        });
    }
}