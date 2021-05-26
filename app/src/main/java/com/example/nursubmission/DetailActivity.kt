package com.example.nursubmission

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.renderscript.ScriptGroup
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import androidx.recyclerview.widget.RecyclerView

class DetailActivity : AppCompatActivity(), View.OnClickListener{

    private lateinit var loadgambar: ImageView
    private lateinit var loadnama: TextView
    private lateinit var loadspek: TextView
    private lateinit var networkNameClass : String
    private lateinit var rvNetwork: RecyclerView
    private var list: ArrayList<Alat_jaringan> = arrayListOf()
    private var namajaringan: String?=""


    companion object {
        const val DATA_GAMBAR = "data_gambar"
        const val DATA_NAMA = "data_nama"
        const val DATA_DETAIL = "data_detail"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        setActionBarTitle("Informasi detail")

        val context= this
         this.namajaringan = intent.getStringExtra(DATA_NAMA)
        loadnama = findViewById(R.id.tv_nama_perangkat)
        loadnama.text= namajaringan

        Toast.makeText(context,namajaringan,Toast.LENGTH_SHORT).show()

        val jaringandetail = intent.getStringExtra(DATA_DETAIL)
        loadspek = findViewById(R.id.detail_spesifikasi)
        loadspek.text= jaringandetail

        val gambarjaringan = intent.getIntExtra(DATA_GAMBAR, 0)
        loadgambar = findViewById(R.id.iv_photo)
        loadgambar.setImageResource(gambarjaringan)

        var btn1: Button?=findViewById(R.id.keranjang);
        btn1?.setOnClickListener {
            Toast.makeText(this,namajaringan +"telah dimasukkan ke keranjang ",Toast.LENGTH_SHORT).show()
        }

    }
    private fun setActionBarTitle(title: String) {
        if (supportActionBar != null) {
            (supportActionBar as ActionBar).title = title
        }
    }

    override fun onClick(v: View?) {
//        when(v?.id){
//            R.id.keranjang ->{
//                Toast.makeText(this,namajaringan +"telah dimasukkan ke keranjang ",Toast.LENGTH_SHORT).show()
//            }
//        }
    }
//    private fun setDetailInformation(jaringanName: String, jaringandetail: String?){
//        loadspek = findViewById(R.id.detail_spesifikasi)
//        loadspek.text = jaringanName.toString()
//
//    }
}