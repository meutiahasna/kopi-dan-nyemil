## Aplikasi Kopi dan Nyemil

### Deskripsi Aplikasi
Aplikasi "Kopi dan Nyemil" adalah aplikasi mobile berbasis Android untuk pemesanan menu kopi dan cemilan yang dirancang berdasarkan wireframe UTS Pengembangan Aplikasi Mobile (PAM) yang telah diberikan.
Aplikasi ini dibangun menggunakan Android Studio dengan template Empty Views Activity berbasis bahasa pemrograman Kotlin tanpa menggunakan database eksternal (menggunakan data statis (dummy data)). Berikut wireframe yang dimaksud:

### Fitur
Aplikasi ini mengimplementasikan semua tampilan dan fitur yang terdapat pada wireframe, yaitu:

- **Splash/Welcome**:
Tampilan awal aplikasi yang menampilkan logo, judul aplikasi, dan tombol _Start now_.

- **Sign Up**:
Tampilan bagi pengguna untuk memilih navigasi menuju halaman _Register_ atau halaman _Login_.

- **Login User**:
Form autentikasi pengguna menggunakan _username_ dan _password_ yang dilengkapi dengan validasi input detail via Toast bertingkat untuk mendeteksi secara spesifik jika username kosong, password kosong, atau keduanya kosong bersamaan.

- **Register**:
Form pendaftaran pengguna baru (Nama lengkap, username, dan password) yang dilengkapi dengan validasi input via Toast bertingkat untuk mendeteksi secara spesifik jika nama lengkap kosong, username kosong, password kosong, atau ketiganya kosong bersamaan.

- **Home**:
Menampilkan minimal 5 item makanan/minuman dengan deskripsi dan detail harga menggunakan RecyclerView.

- **Profile**:
Halaman informasi pengguna dengan tombol pembaruan nama pengguna (_Save_).

- **Alamat pengiriman (Order)**:
Form pengisian data pengiriman (Nama lengkap, alamat, dan patokan atau detail lengkap) yang ditampilkan setelah memilih salah satu menu di halaman Home atau mengklik tombol Order di halaman Home/Profile. Bagian ini dilengkapi dengan validasi input detail via Toast bertingkat untuk mendeteksi secara spesifik jika nama lengkap kosong, alamat kosong, atau keduanya kosong bersamaan, sedangkan untuk bagian patokan/detail lengkap bersifat opsinal untuk diisi.

- **Konfirmasi pesanan**:
Halaman konfirmasi bahwa pesanan telah berhasil diproses yang ditampilkan setelah mengklik tombol _Order dan Kirim_ di halaman Order.

### Teknologi yang digunakan
* Bahasa Pemrograman: Kotlin
* IDE (Lingkungan Pengembangan): Android Studio
* Minimum SDK: API 27 ("Oreo"; Android 8.1)
* Desain Antarmuka (UI): XML Layout

### Cara menjalankan aplikasi
1. Clone repository: 
2. Buka folder proyek ini di Android Studio
3. Tunggu proses Sync Gradle (Sync Project with Gradle Files) selesai
4. Jalankan aplikasi pada Emulator atau Perangkat Fisik Android via USB Debugging

### Screenshot tampilan
