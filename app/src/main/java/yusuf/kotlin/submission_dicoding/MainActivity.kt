package yusuf.kotlin.submission_dicoding


import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import yusuf.kotlin.submission_dicoding.adapter.ListAdapter
import yusuf.kotlin.submission_dicoding.data.Data
import yusuf.kotlin.submission_dicoding.model.Smartphone
import java.util.*

class MainActivity : AppCompatActivity() {
    private lateinit var rvSmartphone: RecyclerView
    private var title = "HP Paling Dicari Agustus 2019"
    private val list = ArrayList<Smartphone>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        setActionBarTitle(title)

        rvSmartphone = findViewById(R.id.rv_smartphone)
        rvSmartphone.setHasFixedSize(true)

        list.addAll(Data.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvSmartphone.layoutManager = LinearLayoutManager(this)
        val listAdapter = ListAdapter(list)
        rvSmartphone.adapter = listAdapter

        listAdapter.setOnItemClickCallback(object : ListAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Smartphone) {
                val intent = Intent(this@MainActivity,DetailActivity::class.java)
                intent.putExtra(EXTRA_NAME,data.name)
                intent.putExtra(EXTRA_DETAIL,data.detail)
                intent.putExtra(EXTRA_HARGA,data.harga)
                intent.putExtra(EXTRA_SPEK_CPU,data.cpu)
                intent.putExtra(EXTRA_SPEK_UKURAN,data.ukuranLayar)
                intent.putExtra(EXTRA_SPEK_BATERAI,data.baterai)
                intent.putExtra(EXTRA_PHOTO,data.photo)
                intent.putExtra(EXTRA_SPEK_KAMERA,data.kamera)
                startActivity(intent)
            }
        })
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    private fun setActionBarTitle(title: String) {
        if (supportActionBar != null) {
            (supportActionBar as ActionBar).title = title
        }
    }

    override fun onOptionsItemSelected(item: MenuItem) = when (item.itemId) {
        R.id.action_profile -> {
            val intent = Intent(this@MainActivity,ProfileActivity::class.java)
            startActivity(intent)
            true
        }
        else -> {
            // If we got here, the user's action was not recognized.
            // Invoke the superclass to handle it.
            super.onOptionsItemSelected(item)
        }
    }

    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_DETAIL = "extra_detail"
        const val EXTRA_HARGA = "extra_harga"
        const val EXTRA_SPEK_CPU = "extra_spek_cpu"
        const val EXTRA_SPEK_UKURAN = "extra_spek_ukuran"
        const val EXTRA_SPEK_BATERAI = "extra_spek_baterai"
        const val EXTRA_SPEK_KAMERA= "extra_spek_kamera"
        const val EXTRA_PHOTO = "extra_photo"
    }

}