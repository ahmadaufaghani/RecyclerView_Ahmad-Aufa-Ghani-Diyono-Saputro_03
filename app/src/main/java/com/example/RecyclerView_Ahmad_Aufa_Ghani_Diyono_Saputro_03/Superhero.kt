package com.example.RecyclerView_Ahmad_Aufa_Ghani_Diyono_Saputro_03
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
@Parcelize
data class Superhero(
    val imgSuperhero: Int,
    val nameSuperhero: String,
    val descSuperhero: String
) : Parcelable
