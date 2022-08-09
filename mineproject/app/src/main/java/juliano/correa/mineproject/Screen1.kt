package juliano.correa.mineproject

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Screen1 : AppCompatActivity() {

    private lateinit var mediaPlayer: MediaPlayer
    private lateinit var buttonEnderman: Button
    private lateinit var buttonZombie: Button
    private lateinit var buttonSpider: Button
    private lateinit var buttonCreeper: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen1)

        initializer()

        val actionBar = supportActionBar
        actionBar?.setDisplayHomeAsUpEnabled(true)

        buttonZombie.setOnClickListener {
            play(R.raw.zombie_sound)
        }

        buttonSpider.setOnClickListener {
            play(R.raw.spider_sound)
        }

        buttonEnderman.setOnClickListener {
            play(R.raw.enderman_sound)
        }

        buttonCreeper.setOnClickListener {
            play(R.raw.creeper_sound)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    override fun onStop() {
        stop()
        super.onStop()
    }

    private fun initializer() {
        buttonCreeper = findViewById(R.id.buttonCreeper)
        buttonEnderman = findViewById(R.id.buttonEnderman)
        buttonSpider = findViewById(R.id.buttonSpider)
        buttonZombie = findViewById(R.id.buttonZombie)
    }

    private fun play(sound: Int) {
        mediaPlayer = MediaPlayer.create(this@Screen1, sound)
        mediaPlayer.start()
    }

    private fun stop() {
        if(mediaPlayer.isPlaying) {
            mediaPlayer.stop()
        }
    }
}