package com.jhomlala.better_player

import android.graphics.Bitmap

// Storing a large bitmap instead of passing it through an intent.
class BitmapSingleton private constructor() {
    private var bitmap: Bitmap? = null

    fun setBitmap(newBitmap: Bitmap) {
        bitmap = newBitmap
    }

    fun getBitmap(): Bitmap? {
        return bitmap
    }

    companion object {
        @Volatile
        private var instance: BitmapSingleton? = null

        fun getInstance(): BitmapSingleton {
            return instance ?: synchronized(this) {
                instance ?: BitmapSingleton().also { instance = it }
            }
        }
    }
}