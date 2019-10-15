package yusuf.kotlin.submission_dicoding

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail_activity)
        if (supportActionBar != null) {
            (supportActionBar as ActionBar).title = "Detail Smartphone"
            (supportActionBar as ActionBar).setDisplayHomeAsUpEnabled(true)
        }
        val name = intent.getStringExtra(MainActivity.EXTRA_NAME)
        val detail = intent.getStringExtra(MainActivity.EXTRA_DETAIL)
        val cpu = intent.getStringExtra(MainActivity.EXTRA_SPEK_CPU)
        val ukuran = intent.getStringExtra(MainActivity.EXTRA_SPEK_UKURAN)
        val kamera = intent.getStringExtra(MainActivity.EXTRA_SPEK_KAMERA)
        val baterai = intent.getStringExtra(MainActivity.EXTRA_SPEK_BATERAI)
        val photo = intent.getIntExtra(MainActivity.EXTRA_PHOTO,0)

        val tvHarga = findViewById<TextView>(R.id.tv_harga)
        val tvDetail = findViewById<TextView>(R.id.tv_detail)
        val tvCpu = findViewById<TextView>(R.id.tv_spek_cpu)
        val tvUkuran = findViewById<TextView>(R.id.tv_spek_ukuran)
        val tvKamera = findViewById<TextView>(R.id.tv_kamera)
        val tvBaterai = findViewById<TextView>(R.id.tv_baterai)
        val ivPhoto = findViewById<ImageView>(R.id.ivPhoto)

        tvHarga.setText(name)
        tvDetail.setText(detail)
        tvCpu.setText(cpu)
        tvUkuran.setText(ukuran)
        tvKamera.setText(kamera)
        tvBaterai.setText(baterai)

        Glide.with(this)
            .load(photo)
            .into(ivPhoto)

    }
}