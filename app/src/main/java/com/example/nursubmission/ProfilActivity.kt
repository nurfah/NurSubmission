package com.example.nursubmission

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class ProfilActivity : AppCompatActivity(),View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profil)
        supportActionBar?.title = "Profil"
        val kirimEmail: Button = findViewById(R.id.btn_kirim)
        kirimEmail.setOnClickListener(this)
    }
    override fun onClick(v: View?) {
            when (v?.id) {
                R.id.btn_kirim -> {
                    val mIntent = Intent(Intent.ACTION_SENDTO)
                    mIntent.data = Uri.parse("mailto:nurfahrudin01@gmail.com")
                    startActivity(Intent.createChooser(mIntent, "Email"))
                }
            }
        }

}