package com.example.odevprog;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class KayitCek {

    PreparedStatement ps=null;//SQL sorgumuzu tutacak ve çalıştıracak nesne.
    Connection con=null;//Veri tabanına bağlantı yapmamızı sağlayacak nesne.
    public List<Araba> getCarsTablosu() {
        try {
            Class.forName("com.mysql.jdbc.Driver");//Hangi türde bir veri tabanını kullanacağını bildiriyoruz.
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/cars","root","");//Bağlanacağı veri tabanını ve kullanacağı kullanıcı adı-parolayı bildiriyoruz.
            ps=con.prepareStatement("SELECT * FROM cars");//cars tablosundaki herşeyi çek diyoruz.
            ResultSet rs=ps.executeQuery();//SQL Sorgusundan dönecek sonuç rs sonuç kümesi içinde tutulacak.
            List<Araba> liste=new ArrayList<>();//Araba sınıfı tipinde liste tanımladık çünkü SQL Sorgusundan dönecek.
            while(rs.next())//Kayıt olduğu sürece her işlem sonunda 1 satır atla.
            {


                Araba aa=new Araba();//SQL Sorgusundan sütunları çekip bu değişkenin içinde Adı veya Alani kısmına atıyacağız.
                aa.setAracSahibiAdı(rs.getString("aracSahibiAdı")); //ResultSet içinden o anki indisdeki "Adi" anahtar kelimesine karşı gelen değer alınıyor.
                aa.setAracSahibiSoyAdı(rs.getString("aracSahibiSoyAdı"));
                aa.setAracMarka(rs.getString("aracMarka"));
                aa.setAracModel(rs.getString("aracModel"));
                aa.setAracYıl(rs.getString("aracYıl"));
                aa.setAracRenk(rs.getString("aracRenk"));
                aa.setPlakaNo(rs.getString("plakaNo"));

                //ResultSet içinden o anki indisdeki anahtar kelimesine karşı gelen değer alınıyor.
                liste.add(aa);//Her bir dönen sonucu listeye ekliyoruz.
            }
            return liste;//Listeyi return ediyoruz.
        }
        catch (ClassNotFoundException | SQLException exception) {
            System.out.println("Bir hata meydana geldi:"+exception);
            return null;
        }
        finally{ //try'a da düşse catch'e de bu bloktaki kod çalıştırılacak.
            try {
                if(con!=null){ //Connection nesnesi belki yukarıda null kalmış olabilir. Kontrol etmekte fayda var.
                    con.close();
                }
                if(ps!=null){ //PreparedStatement nesnesi yukarıda null kalmış olabilir. Kontrol etmekte fayda var.
                    ps.close();
                }
            } catch (SQLException sqlException) {
                System.out.println("Bir hata meydana geldi:"+sqlException);
            }
        }
    }
}
