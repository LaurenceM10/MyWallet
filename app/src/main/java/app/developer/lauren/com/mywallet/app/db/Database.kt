package app.developer.lauren.com.mywallet.app.db

import android.arch.persistence.room.Database
import android.arch.persistence.room.Room
import android.arch.persistence.room.RoomDatabase
import android.content.Context
import app.developer.lauren.com.mywallet.app.dao.UserDao
import app.developer.lauren.com.mywallet.app.entities.User

/**
* Created by Lauren Steven on 11/11/18.
*/
@Database(entities = [(User::class)], version = 1, exportSchema = false)
abstract class DataBase : RoomDatabase() {
    abstract fun userDao() : UserDao

    companion object {
        private var INSTANCE: DataBase? = null

        fun getInstance(context: Context): DataBase? {
            if (INSTANCE == null) {
                synchronized(DataBase::class) {
                    INSTANCE = Room.databaseBuilder(context.applicationContext,
                            DataBase::class.java, "MyWallet")
                            .allowMainThreadQueries()
                            .build()
                }
            }
            return INSTANCE
        }

        fun destroyInstance() {
            INSTANCE = null
        }
    }
}