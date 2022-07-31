package com.example.dicodingsubmission

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.squareup.picasso.Picasso

class DetailActivity : AppCompatActivity() {
    private lateinit var badgeImage : ImageView
    private lateinit var stadiumImage : ImageView
    private lateinit var teamNameText : TextView
    private lateinit var teamStadiumNameText : TextView
    private lateinit var teamYearText : TextView
    private lateinit var descriptionText : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        supportActionBar?.title = "Detail Team"

        badgeImage = findViewById(R.id.badgeImageView)
        stadiumImage = findViewById(R.id.StadiumImageView)
        teamNameText = findViewById(R.id.teamName)
        teamStadiumNameText = findViewById(R.id.stadiumName)
        teamYearText = findViewById(R.id.formYear)
        descriptionText = findViewById(R.id.description)

        val teamModelID: Int? = intent.getIntExtra("ID",0)
        val teamModel: TeamLeagueModel? = DataModel().dummyTeamLeagueModel.find { teamLeagueModel -> teamLeagueModel.idTeam==teamModelID }

        Picasso.get().load(teamModel?.badgeImageURL).into(badgeImage)
        Picasso.get().load(teamModel?.stadiumImageURL).into(stadiumImage)

        teamNameText.text = teamModel?.teamName
        teamStadiumNameText.text = teamModel?.stadiumName
        teamYearText.text = teamModel?.formYear.toString()
        descriptionText.text = teamModel?.description

    }
}

