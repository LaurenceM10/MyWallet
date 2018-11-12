package app.developer.lauren.com.mywallet.ui.activities

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import app.developer.lauren.com.mywallet.R
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }


    /**
     * To init actions when events occur on the element
     */
    private fun initActions() {
        login.setOnClickListener {
            doLogin()
        }
    }


    /**
     * To login with username and password
     */
    private fun doLogin() {
        // TODO: save access token in shared preferences
        // TODO: then do login
        startActivity(Intent(this, MainActivity::class.java))
    }
}
