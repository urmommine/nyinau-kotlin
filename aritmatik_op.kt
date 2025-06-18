fun main(){
    var x = 10
    var y = 5

    y++ 

    x += 2

    println("hasil = ${x / y}")
    // Dokumentasi tentang operator aritmatika dalam Kotlin:
    
    // 1. Operator aritmatika dasar
    var a = 10
    var b = 3
    
    println("Penjumlahan: $a + $b = ${a + b}")
    println("Pengurangan: $a - $b = ${a - b}")
    println("Perkalian: $a * $b = ${a * b}")
    println("Pembagian: $a / $b = ${a / b}")
    println("Modulus (sisa bagi): $a % $b = ${a % b}")
    
    // 2. Operator increment dan decrement
    var counter = 5
    println("Nilai awal counter: $counter")
    counter++ // Increment (menambah 1)
    println("Setelah counter++: $counter")
    counter-- // Decrement (mengurangi 1)
    println("Setelah counter--: $counter")
    
    // 3. Operator assignment gabungan
    var nilai = 10
    println("Nilai awal: $nilai")
    nilai += 5 // Sama dengan: nilai = nilai + 5
    println("Setelah nilai += 5: $nilai")
    nilai -= 3 // Sama dengan: nilai = nilai - 3
    println("Setelah nilai -= 3: $nilai")
    nilai *= 2 // Sama dengan: nilai = nilai * 2
    println("Setelah nilai *= 2: $nilai")
    nilai /= 4 // Sama dengan: nilai = nilai / 4
    println("Setelah nilai /= 4: $nilai")
    nilai %= 3 // Sama dengan: nilai = nilai % 3
    println("Setelah nilai %= 3: $nilai")
    
    // 4. Precedence (urutan operasi)
    var hasil = 2 + 3 * 4 // Perkalian dilakukan terlebih dahulu
    println("2 + 3 * 4 = $hasil") // Hasil: 14, bukan 20
    
    // 5. Penggunaan tanda kurung untuk mengubah urutan
    var hasilDenganKurung = (2 + 3) * 4
    println("(2 + 3) * 4 = $hasilDenganKurung") // Hasil: 20
}