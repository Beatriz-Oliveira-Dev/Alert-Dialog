package com.beatriz.alertdialogtest.componentes

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import com.beatriz.alertdialogtest.databinding.LayoutIndicadorSeguidoresBinding

class IndicadorSeguidores(context: Context, attrs: AttributeSet?) : ConstraintLayout(context, attrs) {
    private val binding: LayoutIndicadorSeguidoresBinding = LayoutIndicadorSeguidoresBinding.inflate(
            LayoutInflater.from(context)
            ,this, true )

    init{

    }
}