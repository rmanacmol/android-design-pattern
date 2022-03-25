package com.rvader.designpatternandroid.builder


/**
 * Created by Renz Manacmol on 25/3/22.
 */

//Builder: used when there are multiple params to initialize
class BikeUpgrade private constructor(
    val frame: Boolean,
    val saddle: Boolean,
    val wheel: Boolean,
    val pedal: Boolean,
    val breaks: Boolean
) {

    class Builder {

        private var frame: Boolean = false
        private var saddle: Boolean = false
        private var wheel: Boolean = false
        private var pedal: Boolean = false
        private var breaks: Boolean = false

        fun frame(value: Boolean) = apply { frame = value }
        fun saddle(value: Boolean) = apply { saddle = value }
        fun wheel(value: Boolean) = apply { wheel = value }
        fun pedal(value: Boolean) = apply { pedal = value }
        fun breaks(value: Boolean) = apply { breaks = value }

        fun build() = BikeUpgrade(frame, saddle, wheel, pedal, breaks)

    }

}