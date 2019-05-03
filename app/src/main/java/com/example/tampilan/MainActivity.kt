package com.example.tampilan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    private lateinit var pindahObatCair1: LinearLayout
    private lateinit var pindahP3K1: LinearLayout
    private lateinit var pindahObatRacik1: LinearLayout
    private lateinit var pindahObatOles1: LinearLayout
    private lateinit var pindahObatPill1: LinearLayout
    private lateinit var pindahResepDokter1: LinearLayout
    private lateinit var pindahObatTetes1: LinearLayout
    private lateinit var pindahAlatDokter1: LinearLayout
    private lateinit var pindahMilk1: LinearLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        pindahObatCair1 = findViewById(R.id.PindahObatCair0)
        pindahObatCair1.setOnClickListener{
            startActivity(Intent(this, SearchObatCairActivity::class.java)) }


        pindahP3K1 = findViewById(R.id.PindahP3K0)
        pindahP3K1.setOnClickListener{
            startActivity(Intent(this, SearchP3KActivity::class.java)) }


        pindahObatRacik1 = findViewById(R.id.PindahObatRacik0)
        pindahObatRacik1.setOnClickListener{
            startActivity(Intent(this, SearchObatRacikActivity::class.java)) }


        pindahObatOles1 = findViewById(R.id.PindahObatOles0)
        pindahObatOles1.setOnClickListener{
            startActivity(Intent(this, SearchObatOlesActivity::class.java)) }

        pindahObatPill1 = findViewById(R.id.PindahObatPill0)
        pindahObatPill1.setOnClickListener{
            startActivity(Intent(this, SearchObatPillActivity ::class.java)) }


        pindahResepDokter1 = findViewById(R.id.PindahResepDokter0)
        pindahResepDokter1.setOnClickListener{
            startActivity(Intent(this, SearchResepDokterActivity::class.java)) }


        pindahObatTetes1 = findViewById(R.id.PindahObatTetes0)
        pindahObatTetes1.setOnClickListener{
            startActivity(Intent(this, SearchObatTetesActivity::class.java)) }


        pindahAlatDokter1 = findViewById(R.id.PindahAlatDokter0)
        pindahAlatDokter1.setOnClickListener{
            startActivity(Intent(this, SearchAlatDokterActivity ::class.java)) }


        pindahMilk1 = findViewById(R.id.PindahMilk0)
        pindahMilk1.setOnClickListener{
            startActivity(Intent(this, SearchMilkActivity ::class.java)) }



    }


}
