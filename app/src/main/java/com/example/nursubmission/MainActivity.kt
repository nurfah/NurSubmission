package com.example.nursubmission

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var rvNetwork: RecyclerView
    private var list: ArrayList<Alat_jaringan> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.title = "Perangkat Jaringan"

        rvNetwork = findViewById(R.id.rv_network)
        rvNetwork.setHasFixedSize(true)

        list.addAll(DataJaringan.listData)
        showRecyclerList()
    }
        private fun showRecyclerList() {
        rvNetwork.layoutManager = LinearLayoutManager(this)
        val ListNetworkAdapter = ListNetworkAdapter(list)
        rvNetwork.adapter = ListNetworkAdapter
            ListNetworkAdapter.setOnItemClickCallback(object : ListNetworkAdapter.OnItemClickCallback {
                override fun onItemClicked(data: Alat_jaringan) {
                    showSelectedAlatJaringan(data)
                }
            })
    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }
    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.profil -> {
                val moveIntent = Intent(this@MainActivity, ProfilActivity::class.java)
                startActivity(moveIntent)
            }

        }
    }
    private fun showSelectedAlatJaringan(alatJaringan: Alat_jaringan) {
        Toast.makeText(this, "Kamu memilih " + alatJaringan.name, Toast.LENGTH_SHORT).show()
    }

}