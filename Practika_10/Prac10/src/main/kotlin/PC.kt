import Computers.*
class PC( classcomp:String, nameProc:String, tact:Double, volumeRam:Double,val name:String,val volumeHdd:Double,val firma:String):Computer(classcomp,nameProc ,tact, volumeRam) {

    val quality:Double=Quality()

    override fun Quality(): Double {
        var Pquality:Double=quality+0.5*volumeHdd
        return Pquality
    }

    override fun Info() {
        println("Персональный компьютер: $name  Фирма: $firma" +
                "\nИмя процессора: $nameProc \nТактовая частота процессора: $tact МГц\nОбъём оперативной памяти: $volumeRam Мб" +
                "\nОбъём Винчестера: $volumeHdd Гб\nКачество: ${Quality()}")
    }

}