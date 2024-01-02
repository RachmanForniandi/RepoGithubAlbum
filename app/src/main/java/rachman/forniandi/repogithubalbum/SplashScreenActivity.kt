package rachman.forniandi.repogithubalbum

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.Timer
import kotlin.concurrent.schedule

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        Timer("splashGone", true).schedule(3000) {
            Intent(this@SplashScreenActivity, MainActivity::class.java).also { backToMain->
                //backToMain.putExtra(OBTAINED_TOKEN,sessionToken)
                //backToMain.putExtra(OBTAINED_USERNAME,username)
                startActivity(backToMain)
                finish()
            }
        }
    }
}