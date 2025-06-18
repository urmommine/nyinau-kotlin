fun main(){
    println("test mode")
    Variabel()
}

fun Variabel(){
    var x = 5
    println("value of x = $x")
    // Dokumentasi tentang variabel dalam Kotlin:
    
    // 1. Deklarasi variabel dengan 'var' (mutable/variable)
    // var dapat diubah nilainya setelah dideklarasikan
    var mutableVar = 10
    println("Nilai awal mutableVar: $mutableVar")
    mutableVar = 20
    println("Nilai setelah diubah: $mutableVar")
    
    // 2. Deklarasi variabel dengan 'val' (immutable/constant)
    // val tidak dapat diubah nilainya setelah dideklarasikan
    val immutableVal = 15
    println("Nilai immutableVal: $immutableVal")
    // immutableVal = 25 // Ini akan error karena val tidak bisa diubah
    
    // 3. Tipe data eksplisit
    var stringVar: String = "Hello Kotlin"
    var intVar: Int = 42
    var doubleVar: Double = 3.14
    var booleanVar: Boolean = true
    
    println("String: $stringVar")
    println("Integer: $intVar")
    println("Double: $doubleVar")
    println("Boolean: $booleanVar")
    
    // 4. Null safety dengan nullable types
    var nullableString: String? = null
    println("Nullable string: $nullableString")
    nullableString = "Sekarang ada nilai"
    println("Nullable string setelah diisi: $nullableString")
    
    // 5. Type inference (Kotlin dapat mendeteksi tipe data secara otomatis)
    var inferredType = "Kotlin mendeteksi ini sebagai String"
    var inferredNumber = 100 // Kotlin mendeteksi ini sebagai Int
    println("Inferred string: $inferredType")
    println("Inferred number: $inferredNumber")
}