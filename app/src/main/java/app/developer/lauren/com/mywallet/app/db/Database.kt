package app.developer.lauren.com.mywallet.app.db

import android.arch.persistence.room.Database
import android.arch.persistence.room.Room
import android.arch.persistence.room.RoomDatabase
import android.content.Context
import app.developer.lauren.com.mywallet.app.entities.User

/**
* Created by Lauren Steven on 11/11/18.
*/
@Database(entities = [(User::class)], version = 1, exportSchema = false)
abstract class Database : RoomDatabase() {
    companion object {
        private var INSTANCE: Database? = null

        fun getInstance(context: Context): Database? {
            if (INSTANCE == null) {
                synchronized(Database::class) {
                    INSTANCE = Room.databaseBuilder(context.applicationContext,
                            Database::class.java, "Wallet")
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