package com.paletec.paletec_llamadas;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void llamarSantos(View v)
    {
        Intent i = new Intent(Intent.ACTION_CALL);
        i.setData(Uri.parse("tel:0449931476629"));
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED)
        {
            Toast.makeText(this, "La aplicación necesita permisos de llamada", Toast.LENGTH_SHORT).show();
            return;
        }
        startActivity(i);
    }

    public void llamarXavier(View v)
    {
        Intent i = new Intent(Intent.ACTION_CALL);
        i.setData(Uri.parse("tel:0449931340381"));
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED)
        {
            Toast.makeText(this, "La aplicación necesita permisos de llamada", Toast.LENGTH_SHORT).show();
            return;
        }
        startActivity(i);
    }

    public void abrirFacebook(View v)
    {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/pg/paletecmx/shop/?ref=page_internal"));
        startActivity(intent);
    }

    public void abrirInstagram(View v)
    {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.instagram.com/paletecmx"));
        startActivity(intent);
    }

    public void abrirTwitter(View v)
    {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.twitter.com/paletecmx"));
        startActivity(intent);
    }
}
