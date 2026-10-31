## Aplikasi Kopi dan Nyemil

### Deskripsi Aplikasi
Aplikasi "Kopi dan Nyemil" adalah aplikasi mobile berbasis Android untuk pemesanan menu kopi dan cemilan yang dirancang berdasarkan wireframe UTS Pengembangan Aplikasi Mobile (PAM) yang telah diberikan.
Aplikasi ini dibangun menggunakan Android Studio dengan template Empty Views Activity berbasis bahasa pemrograman Kotlin tanpa menggunakan database eksternal (menggunakan data statis (dummy data)).

Berikut wireframe yang dimaksud:

<img width="816" height="500" alt="Wireframe" src="https://github.com/user-attachments/assets/fd224cc4-34e8-4180-9591-c37c0657a56c" />


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
```bash
git clone https://github.com/meutiahasna/kopi-dan-nyemil
```
2. Buka folder proyek ini di Android Studio
3. Tunggu proses Sync Gradle (Sync Project with Gradle Files) selesai
4. Jalankan aplikasi pada Emulator atau Perangkat Fisik Android via USB Debugging

### Screenshot tampilan

| 1. Splash / Welcome | 2. Sign up |
| :---: | :---: |
| <img width="720" height="1600" alt="image" src="https://github.com/user-attachments/assets/2da798d9-0dde-45f9-9e4d-85637cbacc29" /> | <img width="720" height="1600" alt="image" src="https://github.com/user-attachments/assets/c7a90e52-b0dc-4d43-a98f-ed56083cfa82" /> |

| 3. Login User | 4. Register |
| :---: | :---: |
| <img width="720" height="1600" alt="image" src="https://github.com/user-attachments/assets/40c0ab6c-d1e9-4910-aff4-d01e37a27b2f" /> | <img width="720" height="1600" alt="image" src="https://github.com/user-attachments/assets/9e1d515d-ef0e-4dd1-8592-83d0661f0e31" /> |


| 5. Home | 6. Profile |
| :---: | :---: |
| <img width="720" height="1600" alt="image" src="https://github.com/user-attachments/assets/b5b51d60-ff38-45fd-88af-9033582533f0" /> | <img width="720" height="1600" alt="image" src="https://github.com/user-attachments/assets/f3fb6550-997c-4f89-be1e-3c409f76a149" /> |

| 7. Alamat Pengiriman (Order) | 8. Konfirmasi |
| :---: | :---: |
| <img width="720" height="1600" alt="image" src="https://github.com/user-attachments/assets/a9c00299-61de-43b2-abfc-a348b55390c1" /> | <img width="720" height="1600" alt="image" src="https://github.com/user-attachments/assets/f3b68106-3df4-407a-8897-616abbb36c0b" /> |













