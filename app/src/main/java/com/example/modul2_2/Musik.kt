package com.example.modul2_2

import android.os.Parcel
import android.os.Parcelable

data class Musik(val image:Int, val name:String): Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString()!!
    ) {
    }
    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(image)
        parcel.writeString(name)
    }
    override fun describeContents(): Int {
        return 0
    }
    companion object CREATOR : Parcelable.Creator<Musik> {
        override fun createFromParcel(parcel: Parcel): Musik {
            return Musik(parcel)
        }
        override fun newArray(size: Int): Array<Musik?> {
            return arrayOfNulls(size)
        }
    }
}
