package org.nssfug.weather.ui.model

import androidx.annotation.DrawableRes

data class MetaInformationUiModel(
    @DrawableRes
    val iconResourceId: Int,
    @DrawableRes
    val backgroundImageId: Int,
    val description: String
)