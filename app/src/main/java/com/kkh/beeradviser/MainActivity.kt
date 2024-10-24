package com.kkh.beeradviser

import android.os.Bundle
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.kkh.beeradviser.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        enableEdgeToEdge()
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val findBeer = findViewById<Button>(R.id.find_beer)

        findBeer.setOnClickListener {

            val beerColor = findViewById<Spinner>(R.id.beer_color)
            val color = beerColor.selectedItem

            val brands = findViewById<TextView>(R.id.brands)
            brands.text = "Beer color is $color"
        }

       /* binding.findBeer.setOnClickListener {
            val color = binding.beerColor.selectedItem
            binding.brands.text = "Beer color is $color"
        }*/
    }

    fun getBeers(color: String): List<String> {
        return when (color) {
            "Light" -> listOf("Jail Pale Ale", "Lager Lite")
            "Amber" -> listOf("Jack Amber", "Red Mose")
            "Brown" -> listOf("Brown Bear Beer", "Bock Brownie")
            else -> listOf("Gout Stout", "Dark Daniel")
        }
    }


    /*val beerColor = findViewById<Spinner>(R.id.beer_color)
    val color = beerColor.selectedItem

    val beerList = getBeers(color.toString())
    val beers = beerList.reduce { str, item -> str+"\n"+item  }

    val brands = findViewById<TextView>(R.id.brands)
    brands.text = beers*/
}