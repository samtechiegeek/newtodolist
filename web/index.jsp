<%-- 
    Document   : Signup
    Created on : 10-Dec-2020, 4:54:13 PM
    Author     : Windows
--%>

<%@page import="com.todo.entities.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="font-awesome-animation.min.css">
        <link rel="icon" href="Image/manlaptop.jpg" style="height:40px;width:40px;">
       <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
         <script src="https://code.jquery.com/jquery-3.5.1.min.js" integrity="sha256-9/aliU8dGd2tb6OSsuzixeV4y/faTqgFtohetphbbj0=" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>
        <title>Sign Up </title>
    </head>
    <body>

    <center><h3 class="display-4">Welcome User</h3>
        <br><br>
        
       <div class="container">
                <div class="row">
                    <div class="col-md-4 offset-md-4">
                        <div class="card">
                            <div class="card-header" style="font-size:20px"><center><b>Enter the List Number</b></center></div>
                            <div class="card-body" style="background-color:#e3f2fd;margin-top:20px;font-size:20px">
                               
                              <form class="needs-validation"  action="ListServlet" method="post" id="reg-form">
  <div class="form-group">
       <div class="form-group">
   
    <input type="text" class="form-control" id="username" name="listnumber" placeholder="Enter the list numbers" required>
  </div>
  </div>
                                  <center>  <button class="btn btn-primary" >Create</button></center>
                              </form>
                            </div>
                                </div>
                    </div>
                </div>
       </div>
            
            
    </body>
</html>
