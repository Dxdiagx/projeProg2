package com.example.odevprog;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "PlakaSorgu", value = "/PlakaSorgu")
public class PlakaSorgu extends HttpServlet {
int i=0;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter printWriter = response.getWriter();
        response.setContentType("text/html");
        Araba araba=new Araba();
        String plakaNo = request.getParameter("plakaNo").toUpperCase();
        KayitCek kayitCek=new KayitCek();
        for ( i=0; i<kayitCek.getCarsTablosu().size(); i++){
         if (kayitCek.getCarsTablosu().get(i).getPlakaNo().equals(plakaNo)){
             printWriter.println("Plaka No : "+kayitCek.getCarsTablosu().get(i).getPlakaNo());
             printWriter.println("Arac Sahibinin Adi : "+kayitCek.getCarsTablosu().get(i).getAracSahibiAdı());
             printWriter.println("Arac Sahibinin Soyadi : "+kayitCek.getCarsTablosu().get(i).getAracSahibiSoyAdı());
             printWriter.println("Aracin Markasi : "+kayitCek.getCarsTablosu().get(i).getAracMarka());
             printWriter.println("Aracin Modeli : "+kayitCek.getCarsTablosu().get(i).getAracModel());
             printWriter.println("Aracin Model Yili : "+kayitCek.getCarsTablosu().get(i).getAracYıl());
             printWriter.println("Aracin Rengi : "+kayitCek.getCarsTablosu().get(i).getAracRenk());

         }
            printWriter.print("<html><head>");
            printWriter.print("<title>Servlet Ekran</title>");
            printWriter.print("</head>");
            printWriter.print("<body>");
            printWriter.print("<h2>Get() Methodu bilgileri</h2>");
            printWriter.print("<h2>Girilen kullanıcı bilgileri</h2>");
            printWriter.print("<h3> username: "+"Samet"+"</h3>");
            printWriter.print("<h3> pasword: "+"Acar"+"</h3>");
            printWriter.print("</body></html>");
        }


    }
}
