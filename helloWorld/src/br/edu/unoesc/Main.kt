package br.edu.unoesc

import java.util.*

fun main(args: Array<String>){

    val scan = Scanner(System.`in`)
    println("Valor")
    var valor = scan.nextLine().trim().toDouble()
    println("Parcelas")
    var qtdpar = scan.nextLine().trim().toInt()
    println("Dias")
    var dias = scan.nextLine().trim().toLong()

    Calcular(valor,dias,qtdpar)

}