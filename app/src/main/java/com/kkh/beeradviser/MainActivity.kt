package com.kkh.beeradviser

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //change name of the fragment that you want to see when the app launch
        //to the name attribute of the fragment container view in the activity_main.xml file
        //android:name="com.kkh.beeradviser.ViewsFragment"
        //android:name="com.kkh.beeradviser.CollapsingToolbarFragment"
        //android:name="com.kkh.beeradviser.ScrollingToolbarFragment"


    }
}