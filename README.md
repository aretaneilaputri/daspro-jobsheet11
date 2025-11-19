# daspro-jobsheet11
Pertanyaan Percobaan 1
1. Apakah pengisian elemen array harus dilakukan secara berurutan mulai dari indeks
ke-0? Jelaskan!
Jawaban: Pengisian elemen array tidak wajib berurutan dari indeks ke-0 karena setiap elemen bisa diakses langsung melalui indeksnya. Namun, pengisian secara berurutan lebih disarankan agar data lebih rapi, mudah dibaca, dan cocok dengan penggunaan 
2. Mengapa terdapat null pada daftar nama penonton? 
Jawaban: null muncul karena ada satu bagian dalam array yang belum diisi datanya.karena kita membuat array berukuran 4×2, tetapi hanya mengisi 7 nama saja.maka bagian terakhir (baris ke-4 kolom ke-2) tidak diberi nilai apa pun, sehingga komputer otomatis menampilkan null.
4. Jelaskan fungsi dari penonton.length dan penonton[0].length! 
Apakah penonton[0].length, penonton[1].length, penonton[2].length, dan penonton[3].length memiliki nilai yang sama?Mengapa?
Jawaban: Penonton.length berfungsi untuk mengetahui jumlah baris dalam array 2 dimensi, sedangkan penonton[0].length digunakan untuk mengetahui jumlah kolom pada baris pertama. Nilai penonton[0].length, penonton[1].length, penonton[2].length, dan penonton[3].length semuanya sama karena array dideklarasikan sebagai new String[4][2], sehingga setiap baris otomatis dibuat memiliki jumlah kolom yang sama, yaitu 2 kolom pada masing-masing baris.
10. Menurut Anda, apa kekurangan dan kelebihan foreach loop dibandingkan dengan for 
loop?
Jawaban:Kelebihan foreach loop:
Foreach lebih sederhana dan mudah dibaca karena kita tidak perlu mengatur indeks secara manual. Perulangan langsung mengambil setiap elemen dalam array, sehingga kodenya lebih ringkas dan kecil kemungkinan terjadi error seperti salah indeks.foreach sangat nyaman digunakan ketika kita hanya ingin menampilkan atau memproses semua elemen tanpa mengubah isinya.
Kekurangan foreach loop:
Foreach tidak memberi akses terhadap nomor indeks, jadi kita tidak bisa mengetahui elemen berada di posisi ke berapa. Selain itu, foreach tidak bisa digunakan untuk mengubah nilai elemen secara langsung pada posisi tertentu. Jika kita butuh kontrol penuh terhadap indeks, ingin mengedit elemen, atau butuh melompati beberapa indeks, maka for loop lebih cocok.
11. Berapa indeks baris maksimal untuk array penonton?
Jawaban: Array penonton memiliki 4 baris, yaitu indeks 0, 1, 2, dan 3.Karena indeks dimulai dari 0 maka indeks baris maksimalnya adalah 3.
12. Berapa indeks kolom maksimal untuk array penonton?
Jawaban:etiap baris pada array penonton memiliki 2 kolom, yaitu indeks 0 dan 1.Karena indeks dimulai dari 0, maka indeks kolom maksimalnya adalah 1.
13. Apa fungsi dari String.join()?
Jawaban: String.join() berfungsi untuk menggabungkan beberapa string yang ada dalam sebuah array atau kumpulan data, lalu menyusunnya menjadi satu kalimat dengan pemisah tertentu. Pemisahnya bisa berupa koma, spasi, tanda hubung, atau apa pun yang kita tentukan.

Pertanyaan Percobaan 2
1. Apakah pengisian elemen array dari scanner harus dilakukan secara berurutan mulai 
dari indeks ke-0? Jelaskan! 
Jawaban: Tidak, pengisian elemen array dari scanner tidak harus dimulai dari indeks ke-0, karena array hanya menyediakan posisi penyimpanan jadi bebas memilih mau mengisi bagian mana terlebih dahulu,yang penting baris dan kolom yang di masukkan masih dalam batas ukuran array, sehingga meskipun urutannya acak, program tetap bisa menyimpan data dengan benar sementara elemen yang belum diisi akan tetap bernilai null.

Pertanyaan Percobaan 3
2. Apa fungsi dari Arrays.toString()?
Jaawaban: Arrays.toString() fungsinya adalah mengubah isi array menjadi bentuk teks (string) supaya bisa ditampilkan dengan mudah menggunakan println().