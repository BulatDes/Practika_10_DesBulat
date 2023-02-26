package Computers
abstract class Computer(val classcomp:String, val nameProc:String, val tact:Double,val volumeRam:Double):Computing_machine {

    override fun Quality():Double{
        var quality:Double
        quality=(0.1*tact)+volumeRam
        return quality
    }
    override fun Info() {
        println("Класс компьютера: $classcomp " +
                "\nИмя процессора: $nameProc \nТактовая частота процессора: $tact \nОбъём оперативной памяти: $volumeRam" +
                "\nКачество: ${Quality()}")
    }

}