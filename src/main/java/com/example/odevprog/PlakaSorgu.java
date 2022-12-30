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
        boolean check=true;
        for ( i=0; i<kayitCek.getCarsTablosu().size(); i++){
         if (kayitCek.getCarsTablosu().get(i).getPlakaNo().equals(plakaNo)){
             check=false;
             printWriter.print("<html><head>");
             printWriter.print("<title>Bigiler</title>");
             printWriter.print("</head>");
             printWriter.print("<body background=\"https://img.freepik.com/free-vector/hand-painted-watercolor-pastel-sky-background_23-2148902771.jpg?w=2000\">");
             printWriter.print(" <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">");
             printWriter.print("<table border=2; style=\"height: 50px; font-style: italic; font-size: large; text-align: center; \twidth:600px;\n" +
                     "\tmargin:150px auto;\n" +
                     "\ttable-layout:fixed;\n" +
                     "\tborder-collapse:collapse;\">");
             printWriter.print(" <tr bgcolor=\"red\">\n" +
                     "                <td colspan=\"7\">Plaka Bilgileri </td>\n" +
                     "            </tr>");

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
        if (check){
            printWriter.println("Kayit Bulunamadi...");
        }



    }
}
