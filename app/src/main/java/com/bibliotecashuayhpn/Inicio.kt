package com.bibliotecashuayhpn

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout


class Inicio : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.inicio)

        val imageView = findViewById<ImageView>(R.id.imageView)

        // Configura restricciones para alinear horizontalmente la imagen en el ConstraintLayout
        val imageViewlayoutParams = imageView.layoutParams as ConstraintLayout.LayoutParams
        imageViewlayoutParams.startToStart = ConstraintLayout.LayoutParams.PARENT_ID
        imageViewlayoutParams.endToEnd = ConstraintLayout.LayoutParams.PARENT_ID
        imageViewlayoutParams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID
        imageViewlayoutParams.bottomToBottom = ConstraintLayout.LayoutParams.PARENT_ID
        imageView.layoutParams = imageViewlayoutParams

        val button = findViewById<Button>(R.id.Ingresar)

        button.setOnClickListener(View.OnClickListener {
            // Define la pantalla de destino (otra actividad)
            val intent = Intent(this, PatologiasPrincipales::class.java)

            // Inicia la nueva actividad
            startActivity(intent)
        })
    }
}

