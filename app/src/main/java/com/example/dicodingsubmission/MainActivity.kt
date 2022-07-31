package com.example.dicodingsubmission

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var rvTeamLeague: RecyclerView
    private var list: ArrayList<TeamLeagueModel> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.title = "Team list"

        rvTeamLeague = findViewById(R.id.rv_team_league)
        rvTeamLeague.setHasFixedSize(true)

        list = DataModel().dummyTeamLeagueModel

        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvTeamLeague.layoutManager = LinearLayoutManager(this)
        val listHeroAdapter = ListTeamLeagueAdapter(list)
        rvTeamLeague.adapter = listHeroAdapter

        listHeroAdapter.setOnItemClickCallback(object : ListTeamLeagueAdapter.OnItemClickCallback {
            override fun onItemClicked(data: TeamLeagueModel) {
                showSelectedHero(data)
            }
        })
    }

    private fun showSelectedHero(team: TeamLeagueModel) {
        val moveIntent = Intent(this@MainActivity, DetailActivity::class.java)
        moveIntent.putExtra("ID", team.idTeam)

        startActivity(moveIntent)
//        Toast.makeText(this, "Kamu memilih " + team.teamName, Toast.LENGTH_SHORT).show()
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.profile -> {
                val moveIntent = Intent(this@MainActivity, ProfileActivity::class.java)
                startActivity(moveIntent)
            }
        }
    }

}