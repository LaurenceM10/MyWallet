package app.developer.lauren.com.mywallet.app.dao

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Query
import app.developer.lauren.com.mywallet.app.entities.User

/**
 * Created by Lauren Steven on 13/11/18.
 */
@Dao
interface UserDao {
    @Query("Select * from User")
    fun getAllUsers() : List<User>
}