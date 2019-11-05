package com.lua.mystics.ui.notifications;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.google.android.material.button.MaterialButton;
import com.lua.mystics.MainActivity;
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
        ImageView btn_paypal = root.findViewById(R.id.img_paypal_info);

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
        btn_paypal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder builder3 = new AlertDialog.Builder(root.getContext());
                LinearLayout layout = new LinearLayout(root.getContext());
                layout.setOrientation(LinearLayout.VERTICAL);
                builder3.setIcon(root.getContext().getDrawable(R.drawable.logo));
                builder3.setTitle(root.getContext().getString(R.string.doar));
                final TextView textoshare = new TextView(root.getContext());
                textoshare.setText(root.getContext().getString(R.string.obrigado));
                textoshare.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
                textoshare.setTextSize(15);
                layout.addView(textoshare);
                final TextView espaco4 = new TextView(root.getContext());
                espaco4.setText(" ");
                layout.addView(espaco4);
                builder3.setCancelable(false);
                builder3.setView(layout);
                AlertDialog alert = builder3.create();
                final AlertDialog finalAlert = alert;
                builder3.setPositiveButton(root.getContext().getString(R.string.doar), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://paypal.me/pedrocruz77"));
                        startActivity(browserIntent);
                    }
                });
                builder3.setNeutralButton(root.getContext().getString(R.string.cancelar), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finalAlert.dismiss();
                    }
                });
                alert = builder3.create();
                alert.show();
            }
        });
        return root;
    }
}