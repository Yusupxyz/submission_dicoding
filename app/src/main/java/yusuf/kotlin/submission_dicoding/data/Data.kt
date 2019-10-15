package yusuf.kotlin.submission_dicoding.data

import yusuf.kotlin.submission_dicoding.R
import yusuf.kotlin.submission_dicoding.model.Smartphone
import java.util.*


object Data {
    private val names = arrayOf("Realme C1",
            "Samsung Galaxy A20",
            "OPPO A5s",
            "OPPO A1k",
            "Vivo S1 Pro",
            "Samsung Galaxy A10",
            "Vivo Y93",
            "OPPO A7",
            "Xiaomi Redmi Note 7",
            "Vivo Y91C")

    private val details = arrayOf("Realme C2 masih belum tersingkir di posisi teratas di jajaran HP smartphone terbaik paling dicari Agustus 2019. Kemunculannya digadang sebagai The New Entry Level King di Indonesia untuk menggantikan pendahulunya Realme C1. Selain itu Realme C2 menawarkan banyak keunggulan mulai desain Cutting Diamond yang ikonik pada HP Android berlayar 6.1 inci HD+ Dewdrop ini. Realme C2 juga mampu bertahan seharian berkat kekuatan baterai 4,000 mAh.",
        "Sebagai HP yang menyasar segmen low-entry, Samsung Galaxy A20 dibekali dengan teknologi dan fitur terbaru. Harga di bawah 2 jutaan yang menggiurkan untuk HP sekelas Samsung, penggunanya akan memiliki HP berlayar AMOLED yang biasa dimiliki HP papan atas. Meski layarnya hanya beresolusi HD+, Samsung Galaxy A20 yang mengandalkan layar Infinity-V 6.4 inci ini terasa ringan untuk bermain game. Jeroannya berbekal chipset Exynos 7884 yang susah bisa memainkan game sekelas PUBG dengan baik. HP ini juga ditenagai baterai 4,000 mAh yang bisa bertahan all-day, lengkap dengan USB Type-C. Samsung menyematkan dual kamera 13MP f/1.9 sebagai lensa wide dan kamera ultrawide 5MP f/2.2. Di bagian depan tersemat kamera selfie 8MP di notch mungil. Satu lagi, Samsung juga menyematkan antarmuka OneUI yang biasa dimiliki ponsel flagship pada Samsung Galaxy A20.",
        "OPPO A5s sudah dibekali chipset Helio P35 dengan clock-speed 2.3GHz, lebih kencang dibandingkan pendahulunya OPPO A5. Chip Helio P35 ini dipadukan dengan kartu grafis GPU PowerVR GE8320 untuk mendongkrak kinerja saat bermain game. Tampilannya juga semakin modern dengan desain Waterdrop Screen, OPPO A5s (AX5s) berlayar 6.2 inci HD+ yang nyaman untuk beraktivitas mobile dan menikmati hiburan.",
        "HP OPPO A1k ini mengandalkan penampilan kekinian dengan sokongan layar 6.1 inci yang sudah dilapisi dengan Gorilla Glass 3 yang lebih tahan goresan. Selain itu memori internalnya 32GB juga lebih besar dan mampu menampung file dan aplikasi dalam jumlah banyak.",
        "Versi Pro dari Vivo S1 ini telah memiliki peningkatan chipset dengan dukungan chipset Snapdragon 675 yang lebih baik. Namun ukuran layar Vivo S1 Pro lebih kecil dengan bentang layar 6.39 inci dan panel Super AMOLED. Rasio screen-to-body mencapai 91.64% dan resolusi layar full HD+, layar Vivo S1 Pro juga tampil mulus tanpa notch atau poni.",
        "HP Android terbaik ini tampil apik dengan layar Infinity-V 6.2 inci HD+ yang terlihat lapang. Bodi 3D Glasstic di bagian belakang terlihat apik. HP Samsung ini juga dibekali kamera yang bisa menghasilkan foto berkualitas. Kamera single di bagian belakang berkekuatan 13MP f/1.0 dan kamera depan 5MP untuk selfie, Galaxy A10 juga semakin bernilai dengan hadirnya fitur kamera seperti AR Stickers, Stamp, dan Filter. Baterai Samsung Galaxy A10 hanya berkapasitas 3,400 mAh saja, namun diklaim bisa bertahan seharian. Di jeroannya tertanam kekuatan chip Exynos 7884, dipadukan RAM 2GB dan ROM 32GB, kinerja HP Samsung Galaxy A10 cukup tangguh untuk beraktivitas mobile harian dan mengakses multimedia. Berbekal fitur Face Unlock untuk menggantikan sensor fingerprint, Samsung Galaxy A10 memang layak untuk dimiliki!",
        "Performanya melejit cepat berkat kekuatan chipset Snapdragon 439 octa-core dengan teknologi 14 nm. Kinerjanya semakin maksimal berkat sokongan RAM 4GB dan ROM 64GB, sehingga Vivo Y93 cukup tangguh untuk aktivitas mobile harian, multitasking dan gaming.",
        "Salah satu HP smartphone terbaik paling dicari Agustus 2019 ini menawarkan keunggulan layar Waterdrop Screen 6.2 inci dan baterai jumbo 4,230 mAh yang tahan seharian, yang membuat OPPO A7 banyak diburu di pasaran. HP OPPO A7 ini memiliki rasio screen-to-body menyentuh 89% yang membuat layarnya tampil begitu luas dan nyaman, sehingga nyaman untuk beraktivitas mobile dan menikmati multimedia. Layarnya juga dilindungi Gorilla Glass 3, sehingga lebih tahan goresan.",
        "Pernah merajai sebagai HP smartphone terbaik, popularitas Redmi Note 7 didukung harganya yang sangat terjangkau dan spesifikasinya yang menggiurkan. Dengan harga di bawah Rp2 jutaan, Anda sudah mendapatkan HP yang dipersenjatai chipset Snapdragon 660 AIE didukung teknologi AI. Redmi Note 7 tersedia dalam opsi RAM 3GB/32GB, RAM 4GB/64GB, dan RAM 4GB/128GB yang tangguh melakukan banyak hal mulai multitasking hingga gaming, Redmi Note 7 juga berpenampilan sekelas HP flagship berkat 6.3 inci full HD+ Dot Drop yang sudah dilapisi Gorilla Glass 5. Demikian juga dengan sisi kameranya yang digadang selevel flagship berkat dukungan dual kamera di panel belakang, 48MP + 5MP. Sensor 48MP sebenarnya memiliki hasil tidak beda jauh dari kamera 12MP, berkat teknologi ISOCELL Plus dan Tetracell yang menggabungkan 4 pixel menjadi 1 super pixel. Selain itu HP Redmi Note 7 ini bisa bertahan seharian berkat baterai 4,000 mAh yag support Quick Charge 4, namun chargernya harus dibeli terpisah. Fitur NFC dan perekaman 4K belum dimiliki HP Redmi ini.",
        "Penampilannya mirip dengan Vivo Y91 dan sama-sama dibekali dengan chipset Helio P22 octa-core 2.0Ghz yang dipadukan dengan RAM 2GB dan memori internal 32GB. Vivo Y91C juga memiliki kartu grafis GPU PowerVR 8320 yang bisa memacu performa gaming yang baik di kelasnya. Penampilannya juga sesuai dengan kriteria HP modern saat ini dengan layar 6.22 inci HD+ yang lapang dan nyaman untuk beraktivitas mobile. Desain notch Waterdrop dan panel gradasi dengan opsi warna Fusion Black dan Sunset Red membuat Vivo Y91C semakin kekinian.")

    private val harga = arrayOf("Rp 1.298.000",
        "Rp 1.999.000",
        "Rp 1.699.000",
        "Rp 1.599.000",
        "Rp 5.544.304",
        "Rp 1.499.000",
        "Rp 1.699.000",
        "Rp 2.350.000",
        "Rp 2.089.000",
        "Rp 1.420.000")

    private val cpu = arrayOf("MediaTek Helio MT6762 P22 Octa-core Cortex-A53",
        "Exynos 7884 Octa-core",
        "MediaTek MT6765 Helio P35 Octa core",
        "MediaTek MT6762R Helio P22 (12 nm) Octa core",
        "Qualcomm SDM675 Snapdragon 675AIE (11 nm) Octa core",
        "Exynos 7884 Octa-core",
        "MediaTek Helio P22 MT6762R Octa core",
        "Qualcomm SDM450 Snapdragon 450 (14 nm) octa-core Cortex-A53",
        "Qualcomm SDM660 Snapdragon 660 AIE (14 nm) Octa core",
        "MediaTek Helio P22 MT6762R Octa-core")

    private val kamera = arrayOf("5.00 MP; 13.00 MP",
        "8MP; 13MP + 5MP",
        "8MP; 13MP + 2MP",
        "5MP; 8MP",
        "32MP; 48MP + 8MP + 5MP",
        "5MP; 13MP",
        "8MP; 13MP + 2MP",
        "16MP; 13MP + 2MP",
        "13MP; 48MP + 5MP",
        "5MP; 13MP")

    private val ukuranLayar = arrayOf("6.10 inches",
        "6.4 inches",
        "6.2 inches",
        "6.1 inches",
        "6.39 inches",
        "6.2 inches",
        "6.22 inches",
        "6.2 inches",
        "6.3 inches",
        "6.22 inches")

    private val baterai = arrayOf("4000 mAh",
        "Non-removable Li-Po 4000 mAh",
        "4230 mAh",
        "4000 mAh",
        "Non-removable Li-Po 3,700 mAh battery",
        "3400 mAh",
        "4030 mAh",
        "4230 mAh",
        "4000 mAh (typ) / 3900mAh (min) Baterai tidak dapat dipindahkan Mendukung Teknologi Qualcomm Quick Charge 4",
        "4,030 mAh")

    private val images = intArrayOf(
        R.drawable.realme_c1,
        R.drawable.samsung_galaxy_a20,
        R.drawable.oppo_a5s,
        R.drawable.oppo_a1k,
        R.drawable.vivo_s1_pro,
        R.drawable.samsung_galaxy_a10,
        R.drawable.vivo_y83,
        R.drawable.oppo_a7,
        R.drawable.xiaomi_redmi_note_7,
        R.drawable.vivo_y91c
    )

    val listData: ArrayList<Smartphone>
        get() {
            val list = arrayListOf<Smartphone>()
            for (position in names.indices) {
                val smartphone = Smartphone()
                smartphone.name = names[position]
                smartphone.detail = details[position]
                smartphone.harga = harga[position]
                smartphone.cpu = cpu[position]
                smartphone.ukuranLayar = ukuranLayar[position]
                smartphone.kamera = kamera[position]
                smartphone.baterai = baterai[position]
                smartphone.photo = images[position]
                list.add(smartphone)
            }
            return list
        }
}