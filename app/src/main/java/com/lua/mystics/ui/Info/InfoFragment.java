package com.lua.mystics.ui.Info;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.lua.mystics.R;

public class InfoFragment extends Fragment {

    private View root;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

         root = inflater.inflate(R.layout.fragment_info, container, false);
        MaterialButton btn_remoteview = root.findViewById(R.id.btn_remoteview_info);
        MaterialButton btn_fibonacci = root.findViewById(R.id.btn_fibonacci_info);
        MaterialButton btn_floweroflife = root.findViewById(R.id.btn_flordavida_info);
        MaterialButton btn_sadhguru = root.findViewById(R.id.btn_Isha_info);
        MaterialButton btn_Samadhi = root.findViewById(R.id.btn_Samadhi_info);
        ImageView btn_telegram = root.findViewById(R.id.btn_telegram);
        ImageView btn_paypal = root.findViewById(R.id.btn_paypal);
        ImageView btn_github = root.findViewById(R.id.btn_github);

        btn_Samadhi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://chopra.com/articles/the-3-levels-of-samadhi");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        btn_remoteview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.gaia.com/article/how-to-remote-view");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        btn_fibonacci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://pt.wikipedia.org/wiki/Sequ%C3%AAncia_de_Fibonacci");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        btn_floweroflife.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://zeteticzen.wordpress.com/2016/12/08/the-flower-of-life-deception-metatronic-expose-part-1/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        btn_sadhguru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://isha.sadhguru.org/global/en");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        btn_github.setOnClickListener(v -> {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/LN-Dark"));
            startActivity(browserIntent);
        });
        btn_telegram.setOnClickListener(v -> {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/LN_DarK"));
            startActivity(browserIntent);
        });
        btn_paypal.setOnClickListener(v -> {
            MaterialAlertDialogBuilder builder = new MaterialAlertDialogBuilder(root.getContext());
            LinearLayout layout = new LinearLayout(root.getContext());
            layout.setOrientation(LinearLayout.VERTICAL);
            builder.setIcon(root.getContext().getDrawable(R.drawable.logo));
            builder.setTitle(getString(R.string.doar));
            layout.setGravity(Gravity.CENTER);
            final TextView espaco4 = new TextView(root.getContext());
            espaco4.setText(getString(R.string.obrigado));
            espaco4.setTextSize(19);
            espaco4.setGravity(Gravity.CENTER);
            layout.addView(espaco4);
            final TextView espaco2 = new TextView(root.getContext());
            espaco2.setText("\n");
            espaco2.setTextSize(25);
            espaco2.setGravity(Gravity.CENTER);
            layout.addView(espaco2);
            builder.setView(layout);
            builder.setPositiveButton(getString(R.string.ok), (dialog, which) -> {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://paypal.me/pedrocruz77"));
                startActivity(browserIntent);
            });
            builder.setNeutralButton(getString(R.string.cancelar), (dialog, which) -> dialog.dismiss());
            builder.show();
        });
        return root;
    }
}