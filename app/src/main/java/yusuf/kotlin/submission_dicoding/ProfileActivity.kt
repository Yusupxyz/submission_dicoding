package yusuf.kotlin.submission_dicoding

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.profil_activity)
        if (supportActionBar != null) {
            (supportActionBar as ActionBar).title = "Profil Diri"
            (supportActionBar as ActionBar).setDisplayHomeAsUpEnabled(true)
        }
        val ivPhoto = findViewById<ImageView>(R.id.profile_image)
        Glide.with(this)
            .load(R.drawable.foto)
//            .apply(RequestOptions().override(55, 55))
            .into(ivPhoto)
    }
}