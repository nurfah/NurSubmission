package com.example.nursubmission

object DataJaringan {


    private val namajaringan = arrayOf(
        "TP-Link 840N",
        "TP-Link 820N",
        "Totolink N300",
        "Totolink N200",
        "Totolink SW804",
        "TP-Link AC54",
        "TP-Link Switch 8 Port",
        "D-Link Switch 8 Port",
        "Mikrotik RB941",
        "Mikrotik RB951",
        "Mikrotik RBD54")

    private val jaringandetail = arrayOf ("300Mbps data wireless data nirkabel yang ideal untuk kedua tugas sensitif bandwidth dan pekerjaan dasar. Enkripsi keamanan wireless yang mudah dengan menekan Tombol WPS.  Kontrol bandwidth berbasis IP memungkinkan administrator untuk menentukan berapa banyak bandwidth yang dialokasikan ke setiap PC. Jembatan jaringan nirkabel WDS untuk memperluas jaringan nirkabel Anda",
        "Kecepatan 300Mbps data wireless data nirkabel yang ideal untuk kedua tugas sensitif bandwidth dan pekerjaan dasar. Jembatan jaringan nirkabel WDS untuk memperluas jaringan nirkabel Anda. TL-WR820N adalah gabungan kabel / jaringan nirkabel yang dirancang khusus untuk kebutuhan jaringan usaha kecil dan usaha rumahan.",
        "Sesuai dengan standar IEEE 802.11n/g/b untuk LAN Nirkabel 2.4GHz. Kecepatan data sampai dengan 300Mbps untuk jaringan Wi-Fi. Teknologi canggih MIMO meningkatkan throughput dan jangkauan nirkabel. Mendukung fungsi broadband DHCP, Static IP, PPPoE (dual access), PPTP (dual access), dan L2TP (dual access). Menyediakan keamanan 64/128-bit WEP, WPA, WPA2 dan WPA-Mixed. Terhubung ke keamanan jaringan dengan mudah dan cepat menggunakan WPS. Mendukung Penyaring IP, Pelabuhan, MAC, URL dan Port Forwarding.",
        "Totolink N200RE 300Mbps Mini Wireless N Router 2 Antenna, 300Mbps Wireless N Speed, sharing on different devices, Stable Performance, Easy Setup, Parental Control, Advanced Security, Multiple Networks Available.",
        "TOTOLINK SW804P adalah 8 Port 10/100Mbps Ethernet Switch dengan 4 port sudah mendukung Power Over Ethernet (PoE). Keempat port ini dapat mendeteksi perangkat yang terhubung secara otomatis dan mengirimkan power dan data ke semua IEEE 802.3af Perangkat yang mendukung PoE melalui satu kabel ethernet. SW804P mendukung plug-and-play dan dapat juga terhubung ke server, hub atau switch menggunakan cable straight atau cable crossover.",
        "Dengan kecepatan AC Wi-Fi—AC1200 dual-band cocok untuk streaming video 4k dan download dengan kecepatan tinggi. Mengcover jarak jauh dengan 4x Antenna, dan teknologi Beamforming memberikan jangkauan Wi-Fi yang luas dan koneksi yang andal.  Multi-Mode 3-in-1—Supports Router, Access Point, and Range Extender mode untuk fleksibilitas tambahan. Parental Controls—Mengatur kapan dan bagaimana perangkat yang terhubung dapat mengakses internet.",
        "TL-SF100D Fast Ethernet Switch dirancang untuk SOHO (Small Office / Home Office) atau pengguna workgroup. Semua port didukung auto MDI / MDIX, jadi Anda tidak perlu mengkhawatirkan tentang kabel, semuanya cukup plug and play. Selain itu, dengan teknologi hemat energi yang inovatif, TL-SF1008D dapat menghemat sampai 70% dari konsumsi daya dan Casing plastik yang didesain untuk pemasangan desktop / pada dinding, menjadikannya sebagai solusi ramah lingkungan untuk jaringan bisnis Anda.",
        "DGS-108 8-port Gigabit Switch menggunakan auto-sensing 10/100/1000 Mbps port, memungkinkan workgroup kecil untuk fleksibel terhubung ke Ethernet dan Fast Ethernet dan perangkat Gigabit untuk membuat jaringan terintegrasi. Port ini mendeteksi kecepatan jaringan dan auto negosiasi antara 10BASE-T dan 100BASE-TX pada full dan half-duplex, dan 1000BASE-TX pada full duplex, memungkinkan Anda untuk mendapatkan kecepatan maksimum yang memungkinkan setiap perangkat terhubung ke jaringan Anda.",
        "RB941-2nD memiliki semua kebutuhan router dan gateway untuk segala kondisi jaringan. Router ini adalah salah satu varian Routerboard seri 900 yang memungkinkan digunakan di segala kondisi. Dengan fitur routerOS yang cukup banyak router ini bisa dipasang di Kantor dan di Rumah.Memiliki 4 buah port ethernet, 1 buah access point embedded 2,4 GHz, antenna embedded 2x1,5 dbi. Sudah termasuk power adaptor.",
        "RB951Ui-2HND memiliki semua kebutuhan router dan gateway untuk personal dan kantor. Memiliki 5 buah port ethernet, 1 buah access point embedded 2,4 GHz MIMO, antenna embedded 2,5 dbi, dan satu buah port USB. Sudah termasuk power adaptor.",
        "Spesifikasi RBD52G-5HacD2HnD-TC memiliki semua kebutuhan router dan gateway untuk personal dan kantor. Product Code: RBD52G-5HacD2HnD-TC, Architecture: ARM, CPU: IPQ-4018 , 716MHz 4 Core, Current Monitor: no, Main Storage/NAND: 16MB, RAM: 128MB, LAN Ports: 5    Gigabit: Yes, Switch Chip: 1"
    )

    private val gambarjaringan = intArrayOf( R.drawable.delapan_empat_puluh,
        R.drawable.delapan_dua_puluh,
        R.drawable.totolink_tiga_ratus,
        R.drawable.totolink_dua_ratus,
        R.drawable.totolink_sw,
        R.drawable.ac_lima_empat,
        R.drawable.tplink_sw,
        R.drawable.dlink,
        R.drawable.rb_sembilan_empat_satu,
        R.drawable.rb_sembilan_lima_satu,
        R.drawable.rbd_lima_sembilan
    )

    val listData: ArrayList<Alat_jaringan>
        get() {
            val list = arrayListOf<Alat_jaringan>()
            for (position in namajaringan.indices){
                val alatJaringan = Alat_jaringan()
                alatJaringan.name = namajaringan[position]
                alatJaringan.detail = jaringandetail[position]
                alatJaringan.photo = gambarjaringan[position]
                list.add(alatJaringan)
            }
            return list
        }
}