package com.rvader.designpatternandroid

import android.content.Context
import android.widget.Toast

/**
 * Created by Renz Manacmol on 25/3/22.
 */

fun Context.toast(message: CharSequence) =
    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
