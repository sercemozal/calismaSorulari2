package com.sercem.calisama2

import android.os.Bundle
import java.util.*

fun main()
{
    kitleIndeks()
    println("------------------------")
   tekSayiToplam()
    println("------------------------")
    banka()
}

fun kitleIndeks()
{
    println("Vücut Kitle Indeksi Hesabı")

    var input = Scanner(System.`in`)
    println("Kilonuzu kg olarak girin:")
    var kilo = input.nextInt()
    println("Boyunuzu cm olarak girin:")
    var boycm =  input.nextInt()

    var boym = boycm/100.0

    var vucutKitleIndeksi = kilo/(boym*boym)

    var durum: String = when(vucutKitleIndeksi)
    {
        in 0.0..20.0 -> "düşük"
        in 20.0..25.0 -> "ortalama"
        in 25.0..30.0 -> "fazla"
        else -> "obez"
    }
    println("Vücut kitle indeksiniz $vucutKitleIndeksi, $durum kilodasınız.")
}

fun tekSayiToplam() {
    var input = Scanner(System.`in`)
    println("1'den hangi sayıya kadar olan tek sayıların toplamını öğrenmek istersiniz?")
    var sayi = input.nextInt()

    var toplam = 0
    var i = 0

    while (i<sayi)
    {
        if(i%2 != 0)
        {

            toplam +=i

        }
        i++
    }
    println("1'den girdiğiniz $sayi sayısına kadar olan tek sayıların toplamı: $toplam")

}

fun banka()
{
    var bakiye = 500
    while(true)
    {
        val input = Scanner(System.`in`)
        println(" 1-Para Yatırma \n 2-Para Çekme \n 3-Bakiye Bilgisi \n 0-Çıkış \n Yapmak İstediğiniz İşlemi Seçiniz:")
        val secim =input.nextInt()



       if(secim==1)
       {
           println("Ne kadar para yatıracaksınız?")
           val yatirilacak = input.nextInt()

           bakiye += yatirilacak
           println("Yeni bakiye = $bakiye")

           println(" Devam etmek ister misiniz? \n 1-Evet \n 2-Hayır")
           val devam =input.nextInt()
           if(devam ==1 )
           {
               continue
           }
           else
               break

       } else if (secim == 2)
       {
           println("Ne kadar para çekeceksiniz?")
           val cekilecek = input.nextInt()
           if(bakiye>= cekilecek)
           {
               bakiye-= cekilecek
               println("Yeni bakiye = $bakiye")

               println(" Devam etmek ister misiniz? \n 1-Evet \n 2-Hayır")
               val devam =input.nextInt()
               if(devam ==1 )
               {
                   continue
               }
               else
                   break
           }
           else{
               println("Bakiyeniz yetersiz.")
               continue
           }

       } else if(secim == 3)
       {
           println("Mevcut bakiye = $bakiye")
           println(" Devam etmek ister misiniz? \n 1-Evet \n 2-Hayır")
           val devam =input.nextInt()
           if(devam ==1 )
           {
               continue
           }
           else
               break

       }else if (secim == 0)
       {
           break
       }else
       {
           println("Geçerli bir işlem giriniz")
           continue
       }
    }

}