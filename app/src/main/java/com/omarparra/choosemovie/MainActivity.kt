package com.omarparra.choosemovie

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val movieList = arrayListOf("Iron Man", "Avengers", "Star Wars", "Never Back Down", "Gol")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //we set the elements, count them and show them in a random way
        chooseBtn.setOnClickListener {
            val random = Random()
            val randomMovie = random.nextInt(movieList.count())
            //assign the value to movieSelected text
            movieSelectedTxt.text = movieList[randomMovie]
        }

        addMovieBtn.setOnClickListener {
            //get new movie text
            val addMovie = addMovieTxt.text.toString()
            //add it to our list
            movieList.add(addMovie)
            //clean the add movie text to add another
            addMovieTxt.text.clear()
            //at the end show me the final list
            println(movieList)

        }

    }
}

