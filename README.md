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
| <img width="720" height="1600" alt="image" src="https://github.com/user-attachments/assets/6485ad77-4ca2-493b-b269-997040c9c939" /> | <img width="720" height="1600" alt="image" src="https://github.com/user-attachments/assets/6e10ad7b-18aa-4176-937a-f24f6a3f0e4a" /> |

| 3. Login User | 4. Register |
| :---: | :---: |
| <img width="720" height="1600" alt="image" src="https://github.com/user-attachments/assets/3aef9f78-2c96-4402-b70a-585997dc4f3c" /> | <img width="720" height="1600" alt="image" src="https://github.com/user-attachments/assets/954fc268-1e3e-40c5-8d83-3919e77706c4" /> |


| 5. Home | 6. Profile |
| :---: | :---: |
| <img width="720" height="1600" alt="image" src="https://github.com/user-attachments/assets/a04abfa8-4e0f-4875-844e-2a0c1bfe20d0" /> | <img width="720" height="1600" alt="image" src="https://github.com/user-attachments/assets/7e46d272-6796-4107-8eb0-e93b37ee47e5" /> |

| 7. Alamat Pengiriman (Order) | 8. Konfirmasi |
| :---: | :---: |
| <img width="720" height="1600" alt="image" src="https://github.com/user-attachments/assets/25b274f4-7403-46db-bc02-5dffcdb3ddee" /> | <img width="720" height="1600" alt="image" src="https://github.com/user-attachments/assets/efb9ae7f-4806-49b5-8069-8998e31f787a" /> |













