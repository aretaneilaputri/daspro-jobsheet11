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