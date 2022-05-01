package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.myapplication.databinding.ActivityPremiumBinding


class PremiumActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPremiumBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_premium)
        val model = PremiumModel(
            "$11.99",
            "$143.99 per year",
            "$4.99",
            "$11.99 per month",
            "$59.99 per year",
            "$4.99 per month",
            "Get unlimited access!",
            "Monthly",
            "Yearly"
        )
        binding.premium=model
    }
}