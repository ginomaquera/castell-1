<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Castell - Ingresar</title>
        <%@include file="/public/header.jsp" %>
    </head>
    <div class="container">
    <div class="row">
        <div class="col-sm-6 col-md-4 col-md-offset-4">        
        <div class="account-wall">
            
            <img class="profile-img" src="https://lh5.googleusercontent.com/-b0-k99FZlyE/AAAAAAAAAAI/AAAAAAAAAAA/eu7opA4byxI/photo.jpg?sz=120"
                    alt="">

            <form class="form-signin" role="form" action="<%=request.getContextPath()%>/j_spring_security_check" method="POST" >
                <h2 class="form-signin-heading text-center">Castell CRM</h2>

                <input type="email" class="form-control" placeholder="Correo" required="" autofocus="" name="j_username">

                <input type="password" class="form-control" placeholder="Contraseña" required="" name="j_password">

                <c:if test="${loginError}">
                    <p class="text-danger text-center">Usuario y/o contraseña incorrectos.</p>
                </c:if>

                <button class="btn btn-lg btn-primary btn-block" type="submit">Ingresar</button>
            </form>
        </div>
        </div>
    </div>
     </div>
    <%@include file="/public/footer.jsp" %>
</html>
