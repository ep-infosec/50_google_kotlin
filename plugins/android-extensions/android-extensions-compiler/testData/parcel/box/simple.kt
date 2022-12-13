// WITH_STDLIB

@file:JvmName("TestKt")
package test

import kotlinx.android.parcel.*
import android.os.Parcel
import android.os.Parcelable

annotation class SerializableLike

@Parcelize @SerializableLike
data class User(val firstName: String, val secondName: String, val age: Int) : Parcelable

fun box() = parcelTest { parcel ->
    val user = User("John", "Smith", 20)
    user.writeToParcel(parcel, 0)

    val bytes = parcel.marshall()
    parcel.unmarshall(bytes, 0, bytes.size)
    parcel.setDataPosition(0)

    val user2 = readFromParcel<User>(parcel)
    assert(user == user2)
}