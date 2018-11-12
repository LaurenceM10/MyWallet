package app.developer.lauren.com.mywallet.app.entities

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

/**
* Created by Lauren Steven on 11/11/18.
*/
@Entity
data class User(var username: String) {
    @PrimaryKey(autoGenerate = true) var id: Long = 0
}