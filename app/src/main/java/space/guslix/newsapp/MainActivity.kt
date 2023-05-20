package space.guslix.newsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.navigation.Navigation
import androidx.navigation.ui.setupWithNavController
import space.guslix.newsapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var _bind: ActivityMainBinding? = null
    private val bind get() = _bind!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _bind = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.fragment_splash)
        Handler(Looper.myLooper()!!).postDelayed({
            setContentView(bind.root)
            bind.bottmenu.setupWithNavController(
                navController = Navigation.findNavController(this,R.id.nav_host_fragment)
            )
        }, 5000)
    }

    override fun onDestroy() {
        super.onDestroy()
        _bind=null
    }
}