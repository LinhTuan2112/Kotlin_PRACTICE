open class DaGiac (private val soCanh: Int,private val canh: IntArray){
     open fun chuVi(): Int {
         var chuVi = 0
         for(i in canh){
            chuVi += i
        }
         return chuVi
    }
    fun inCacCanh (){
        print("Các cạnh của đa giác là:  ")
        for(i in canh){
            println(i)


        }
    }
}