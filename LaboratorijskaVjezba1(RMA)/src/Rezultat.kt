import java.util.*
import kotlin.collections.ArrayList

class Rezultat {
    fun provjera(kockice: ArrayList<Int>){
        val malaSkala = intArrayOf(1,2,3,4,5)
        val velikaSkala = intArrayOf(2,3,4,5,6)

        println()
        println("Sortiranje..")

        kockice.sort()
        println()
        println(kockice)

        loop@ for (i in 0..5) {
            var brojIstih=0
            for (j in 0..5) {
                if (kockice[i] == kockice[j]) {
                    brojIstih++
                }
            }
            if (brojIstih == 5) {
                println("Jamb!")
                break@loop
            }
            if (brojIstih == 4) {
                println("Poker!")
                break@loop
            }
        }

        if (kockice.containsAll(velikaSkala.asList())) {
            println("VELIKA SKALA")
            return
        }

        if (kockice.containsAll(malaSkala.asList())) {
            println("MALA SKALA")
        }

    }
}