import Computers.Computer

class Laptop (classcomp:String, nameProc:String, tact:Double, volumeRam:Double, val name:String, val volumeHdd:Double, val firma:String,val ves:Double):
    Computer(classcomp,nameProc ,tact, volumeRam) {

    val quality:Double=Quality()

    override fun Quality(): Double {
        var Pquality:Double=quality+0.5*volumeHdd
        return Pquality
    }

    fun Port():String{
        when(ves){
          in 1.0..2.5-> return "Отличная"
           in 2.6..3.5-> return "Хорошая"
           in 3.6..4.5-> return "Неплохая"
            in 4.6..7.0-> return "Плохая"
            else->return "Невозможно таскать"
        }


    }

    override fun Info() {
        println("Ноутбук: $name  Фирма: $firma" +
                "\nИмя процессора: $nameProc \nТактовая частота процессора: $tact МГц \nОбъём оперативной памяти: $volumeRam Мб" +
                "\nОБъём Винчестера: $volumeHdd Гб\nКачество: ${Quality()} \nПортативность: ${Port()} ")
    }

}