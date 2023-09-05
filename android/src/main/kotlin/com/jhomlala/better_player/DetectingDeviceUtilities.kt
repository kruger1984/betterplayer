package com.jhomlala.better_player

import android.os.Build

object DetectingDeviceUtilities {
    val isSamsungDeviceWithAndroidR
        get() =
            Build.MANUFACTURER.lowercase() == "samsung" && Build.VERSION.SDK_INT == Build.VERSION_CODES.R
}