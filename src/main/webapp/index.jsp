<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Plaka SorguJSP</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body background="https://img.freepik.com/free-vector/hand-painted-watercolor-pastel-sky-background_23-2148902771.jpg?w=2000">
<title style="color: black">
    Plaka Sorgulama Hizmeti
</title>
<br/>
<form action="PlakaSorgu" style="text-align: center;
margin-top:150px "id="form" method="get"
      action="index.jsp" class="form-horizontal">
<h1>Plaka Sorgulama Hizmeti</h1>
    <br>
    <label style="height: 50px; font-style: italic; font-size: large">Plaka No </label>
<input type="text" name="plakaNo">
<button class="btn btn-success" style="width: 180px; height: 40px"> Plaka Sorgula </button>
</form>
<br/>
</body>
</html>