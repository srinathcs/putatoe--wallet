package com.example.putatoewallet.view.widget.walletMenu

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import com.example.putatoewallet.R

class MenuWidget(context: Context, attrs: AttributeSet?) : LinearLayout(context, attrs) {
    init {
        LayoutInflater.from(context).inflate(R.layout.wallet_menu_widget, this, true)
    }
}