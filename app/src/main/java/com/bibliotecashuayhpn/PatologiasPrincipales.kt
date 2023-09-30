package com.bibliotecashuayhpn

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout

class PatologiasPrincipales : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.patologiasprincipales)

        val imageView = findViewById<ImageView>(R.id.imageView)

        // Configura restricciones para alinear horizontalmente la imagen en el ConstraintLayout
        val layoutParams = imageView.layoutParams as ConstraintLayout.LayoutParams
        layoutParams.startToStart = ConstraintLayout.LayoutParams.PARENT_ID
        layoutParams.endToEnd = ConstraintLayout.LayoutParams.PARENT_ID
        layoutParams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID
        layoutParams.bottomToBottom = ConstraintLayout.LayoutParams.PARENT_ID
        imageView.layoutParams = layoutParams

    }
}