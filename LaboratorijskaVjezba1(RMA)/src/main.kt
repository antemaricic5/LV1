import java.util.*
import kotlin.collections.ArrayList

var kockice = Kockice()
var rezultat = Rezultat()
var pocetneKockice = IntArray(6)
var reader = Scanner(System.`in`)
var odabraneKockice = ArrayList<Int>()
var odgovor = String()

fun main(){

    println("Bacanje prvo...")
    println()

    val kockicePrvoBacanje = kockice.baciKockice(pocetneKockice)
    println("Dobivene kockice: " + kockicePrvoBacanje)

    println("Zelis li ponoviti bacanje? Odgovori sa DA ili NE")
    odgovor = readLine().toString()

    if (odgovor.equals("DA")) {
        println("Odaberi broj kockica koje zelis ostaviti")
    } else{
        println("KRAJ")
    }

   val brojKockica = reader.nextInt()

    for (i in 0 until brojKockica) {
        print("Unesi redni broj " + (i+1) + "." + " kockice: ")
        val index = reader.nextInt()
        odabraneKockice.add(kockicePrvoBacanje.get(index-1))
        reader.reset()
    }
    println()
    println("Odabrane kockice: " + odabraneKockice)
    println()

////////////////////////////////////////////////////////////////////////////////////

    println("Bacanje drugo...")
    println()

    val brojKockicaZaDrugoBacanje = IntArray(pocetneKockice.size - odabraneKockice.size)
    val kockiceDrugoBacanje = kockice.baciKockice(brojKockicaZaDrugoBacanje)
    println("Dobivene kockice: " + kockiceDrugoBacanje)

    println("Zelis li ponoviti bacanje? Odgovori sa DA ili NE")
    val odgovor2 = readLine().toString()

    if (odgovor2.equals("DA")) {
        println("Odaberi broj kockica koje zelis ostaviti")
    } else{
        print(odgovor2)
        println("KRAJ")
    }

   val brojKockica2 = reader.nextInt()

    for (i in 0 until brojKockica2) {
        print("Unesi redni broj " + (i+1) + "." + " kockice: ")
        val index = reader.nextInt()
        odabraneKockice.add(kockiceDrugoBacanje.get(index-1))
        reader.reset()
    }

    println()
    println("Odabrane kockice: " + odabraneKockice)
    println()

    /////////////////////////////////////////////////////////////////////////////////////////

    println("Bacanje trece...")
    val brojKockicaZaTreceBacanje = IntArray(pocetneKockice.size - odabraneKockice.size)
    val kockiceTreceBacanje = kockice.baciKockice(brojKockicaZaTreceBacanje)
    println("Dobivene kockice: " + kockiceTreceBacanje)

    for (i in 0 until kockiceTreceBacanje.size) {
        odabraneKockice.add(kockiceTreceBacanje.get(i))
    }

    println()
    println("Konacne kockice: " + odabraneKockice)

    provjeriRezultat(odabraneKockice)
}

fun provjeriRezultat(odabraneKockice: java.util.ArrayList<Int>) {
    rezultat.provjera(odabraneKockice)
}