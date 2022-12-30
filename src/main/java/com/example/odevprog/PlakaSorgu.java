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
             printWriter.print("<html><head>");
             printWriter.print("<title>Bigiler</title>");
             printWriter.print("</head>");
             printWriter.print(" <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">");
             printWriter.print("<body>");
             printWriter.print("<table border=2;>");
             printWriter.print("<tr>");
             printWriter.print("<td>Plaka No</td>");
             printWriter.print("<td>Arac Sahibinin Adi</td>");
             printWriter.print("<td>Arac Sahibinin Soyadi</td>");
             printWriter.print("<td>Aracin Markasi</td>");
             printWriter.print("<td>Aracin Modeli</td>");
             printWriter.print("<td>Aracin Model Yili</td>");
             printWriter.print("<td>Aracin Rengi</td>");
             printWriter.print("</tr>");
             printWriter.print("<tr>");
             printWriter.print("<td>"+kayitCek.getCarsTablosu().get(i).getPlakaNo()+"</td");
             printWriter.print("</tr>");
             printWriter.print("<td>"+kayitCek.getCarsTablosu().get(i).getAracSahibiAdı()+"</td");
             printWriter.print("</tr>");
             printWriter.print("<td>"+kayitCek.getCarsTablosu().get(i).getAracSahibiSoyAdı()+"</td");
             printWriter.print("</tr>");
             printWriter.print("<td>"+kayitCek.getCarsTablosu().get(i).getAracMarka()+"</td");
             printWriter.print("</tr>");
             printWriter.print("<td>"+kayitCek.getCarsTablosu().get(i).getAracModel()+"</td");
             printWriter.print("</tr>");
             printWriter.print("<td>"+kayitCek.getCarsTablosu().get(i).getAracYıl()+"</td");
             printWriter.print("</tr>");
             printWriter.print("<td>"+kayitCek.getCarsTablosu().get(i).getAracRenk()+"</td");
             printWriter.print("</tr>");
             printWriter.print("</table>");
             printWriter.print("</body></html>");
         }


        }


    }
}
