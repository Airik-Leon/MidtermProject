<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<nav class="navbar navbar-expand-lg navbar-dark bg-danger">
<c:if test="${activeUser == null }">
  <a class="navbar-brand" href="home.do">Swap Meet</a>
</c:if>
<c:if test="${activeUser != null }">
  <a class="navbar-brand" href="login.do">Swap Meet</a>
</c:if>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
    <ul class="navbar-nav">
        <c:if test="${activeUser == null }">
         <li class="nav-item active">
              <a class="nav-link" href="home.do">Home <span class="sr-only">(current)</span></a>
         </li>
         <li class="nav-item">
              <a class="nav-link" href="login.do">Log in</a>
         </li>
        </c:if>
        <c:if test="${activeUser != null }">
             <li><a class="nav-link" href="login.do">${activeUser.username}</a></li>
             <li><a class="nav-link" href="logout.do">Log-out</a></li>
        </c:if>
         <li class="nav-item dropdown">
              <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Groups</a>
              <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                   <c:forEach var="community" items="${activeUser.communities}">
                        <a href="${community.id}" class="dropdown-item">${community.name}</a>
                   </c:forEach>
                   <a href="newGroup.do" class="dropdown-item">New Group</a>
              </div>
         </li>
     </ul>
  </div>
 </nav>
