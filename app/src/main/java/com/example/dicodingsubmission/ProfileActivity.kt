package com.example.dicodingsubmission

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.squareup.picasso.Picasso

class ProfileActivity : AppCompatActivity() {
    private lateinit var profileImage : ImageView
    private lateinit var profileName : TextView
    private lateinit var profileEmail : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        supportActionBar?.title = "My Profile"

        profileImage = findViewById(R.id.profileImage)
        profileName = findViewById(R.id.profileName)
        profileEmail = findViewById(R.id.profileEmail)


        Picasso.get().load(R.drawable.fullbody).resize(800,800).centerCrop().into(profileImage);
        profileName.text = getString(R.string.my_name)
        profileEmail.text = getString(R.string.my_email)
    }
}