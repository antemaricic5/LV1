class Kockice {
    fun baciKockice(kockice: IntArray): ArrayList<Int> {
        val dobiveniBrojevi = ArrayList<Int>()

        for (i in 0 until kockice.size) {
            dobiveniBrojevi.add(i,(1..6).random())
        }
        return dobiveniBrojevi
    }
}
