package com.example.agungsetiawanrecyclerviewkotlin1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.agungsetiawanrecyclerviewkotlin1.adaptor.AdaptorTeamBola
import com.example.agungsetiawanrecyclerviewkotlin1.databinding.ActivityMainBinding
import com.example.agungsetiawanrecyclerviewkotlin1.model.Pemain

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listPemain = ArrayList<Pemain>()
        listPemain.add(Pemain("Thibaut Courtois",R.drawable.courtois,"Penjaga Gawang","2.00","Tegal","11 mei 1992"))
        listPemain.add(Pemain("Benzema",R.drawable.download,"Penyerang","1.86","Bandung","12 Mei 1999"))
        listPemain.add(Pemain("Marcelo",R.drawable.marcelo,"Gelandang","1.79","Papua","13 April 1990"))
        listPemain.add(Pemain("Grealish",R.drawable.grealish,"Geladang","1.80","Bogor","12 September 1990"))
        listPemain.add(Pemain("Erling",R.drawable.halland,"Penyerang","1.90","Bekasi","12 Desember 1990"))

        binding.list.adapter = AdaptorTeamBola(this,listPemain,object  : AdaptorTeamBola.OnClickListener {
            override fun detailData(item: Pemain?) {
                TODO("Not yet implemented")
            }

        })



    }
}