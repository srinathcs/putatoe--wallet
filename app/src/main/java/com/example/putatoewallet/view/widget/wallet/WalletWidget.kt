package com.example.putatoewallet.view.widget.wallet

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import com.example.putatoewallet.R

class WalletWidget(context: Context, attrs: AttributeSet?) : LinearLayout(context, attrs) {
    init {
        LayoutInflater.from(context).inflate(R.layout.wallet_widget, this, true)
    }
}