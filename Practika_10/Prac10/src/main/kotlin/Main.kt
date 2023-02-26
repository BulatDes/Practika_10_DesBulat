import Computers.*
fun main() {
    try {
        println("Введите Класс компьютера (Ноутбук,ПК)")
        var nameClass: String = readLine()!!.toString().lowercase()
        when{
            (nameClass=="ноутбук")->nameClass="Ноутбук"
            (nameClass=="пк" || nameClass =="персональный компьютер")->nameClass="Персональный компьютер"
            else->throw Exception("Неправильный ввод")
        }
        println("Введите имя процессора ")
        var nameProc: String = readLine()!!.toString().lowercase()
        println("Введите Тактовую частоту процессора (МГц)")
        val tact: Double = readLine()!!.toDouble()
        if(tact<2500.0 || tact > 8723.0) throw Exception("Неправильный ввод")
        println("Введите объём оперативной памяти (Mb)")
        val volumeRam:Double = readLine()!!.toDouble()
        if(volumeRam<4.0 || volumeRam > 131072.0) throw Exception("Неправильный ввод")


        when(nameClass){
            "Ноутбук"-> {
                println("Введите имя ноутбука")
                val name:String= readLine().toString()
                println("Введите фирму ноутбука")
                val firma:String= readLine().toString()
                println("Введите вес ноутбука (kg)")
                val ves:Double= readLine()!!.toDouble()
                if (ves<1.0 || ves > 10) throw Exception("Неправильный ввод")
                println("Введите объём Винчестера (Гб)")
                val volumeHdd:Double= readln().toDouble()
                if (volumeHdd<40.0 || volumeHdd > 1024) throw Exception("Неправильный ввод")
                val Comp=Laptop(nameClass,nameProc,tact,volumeRam,name,volumeHdd,firma,ves)
                Comp.Info()
            }
                "Персональный компьютер"->{
                    println("Введите имя ПК")
                    val name:String= readLine().toString()
                    println("Введите фирму ПК")
                    val firma:String= readLine().toString()
                    println("Введите объём Винчестера (Гб)")
                    val volumeHdd:Double= readln().toDouble()
                    if (volumeHdd<40.0 || volumeHdd > 1024) throw Exception("Неправильный ввод")
                    val Comp=PC(nameClass,nameProc,tact,volumeRam,name,volumeHdd,firma)
                    Comp.Info()
                }
        }


    }catch (ex:Exception){
        println(ex.message)
    }

}