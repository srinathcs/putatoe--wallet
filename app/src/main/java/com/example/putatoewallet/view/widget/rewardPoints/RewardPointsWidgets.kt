package com.example.putatoewallet.view.widget.rewardPoints

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import com.example.putatoewallet.R

class RewardPointsWidgets(context: Context, attrs: AttributeSet?) : LinearLayout(context, attrs) {
    init {
        LayoutInflater.from(context).inflate(R.layout.reward_points_widget, this, true)
    }
}