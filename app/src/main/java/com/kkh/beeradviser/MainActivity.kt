package com.kkh.beeradviser

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.kkh.beeradviser.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        //binding example usage in activity
        //binding.fragmentContainerView

        //change name of the fragment that you want to see when the app launch
        //to the name attribute of the fragment container view in the activity_main.xml file
        //android:name="com.kkh.beeradviser.ViewsFragment"
        //android:name="com.kkh.beeradviser.CollapsingToolbarFragment"
        //android:name="com.kkh.beeradviser.ScrollingToolbarFragment"


    }
}