window.fbAsyncInit = function() {
    FB.init({
      appId            : '147631892478300',
      autoLogAppEvents : true,
      xfbml            : true,
      version          : 'v2.10'
    });
    
    FB.getLoginStatus(function(response) {
        statusChangeCallback(response);
    });
      
  };

  function checkLoginState() {
    FB.getLoginStatus(function(response) {
      statusChangeCallback(response);
    });
  }
  
  function statusChangeCallback(response){
      if(response.status === "connected"){
          FB.api("/me?fields=first_name,last_name,email,birthday,gender,picture",function(response){
             if(response && !response.error){
                $.ajax({
                   url:"/FutPlayFinal/inicio/facebook",
                   method:"post",
                   dataType:"json",
                   data:{email:response.email},
                   complete:function(data){
                        console.log(data);
                        if(data.responseText==="1"){
                            window.location.href = "/FutPlayFinal/material-dashboard/pages/propietario/indexPropietario.jsp";
                        }
                        else if(data.responseText==="2"){
                            window.location.href = "/FutPlayFinal/material-dashboard/pages/jugador/indexJugador.jsp";
                        }
                        else{
                            $("#modalRuta").modal("show");
                            $(".btnPropFacebook").on("click",function(){
                                var gender = response.gender;
                                var genero="";
                                if(gender==="male"){
                                    genero="Masculino";
                                }
                                else{
                                    genero="Femenino";
                                }
                               $.ajax({
                                  url:"/FutPlayFinal/usuario/registrar",
                                  method:"post",
                                  dataType:"json",
                                  data:{UNombre:response.first_name,UApellido:response.last_name,UFechaNacimiento:response.birthday,UTelefono:"",UGenero:genero,UCorreo:response.email,UContrasenia:"",UAvatar:response.picture.data.url},
                                  success: function(data){
                                      if(data>"0"){
                                          $.ajax({
                                              url:"/FutPlayFinal/propietario/registrar",
                                              method:"post",
                                              dataType:"json",
                                              data:{UCorreo:response.email}
                                          }).done(function(data){
                                            if(data>"0"){
                                                swal({
                                                   title:"Bienvenido",
                                                   text:"Disfruta de la experiencia futplay!",
                                                   type:"success",
                                                   confirmButtonText:"Aceptar",
                                                   preConfirm:function(){
                                                       window.location.href="/FutPlayFinal/material-dashboard/pages/propietario/indexPropietario.jsp";
                                                   }
                                                }); 
                                            }
                                            else{
                                                swal("Error","Ocurrio un error al momento de procesar la solicitud","error");
                                            }
                                          });
                                      }
                                      else{
                                          swal("Error","Ocurrio un error al momento de procesar la solicitud","error");
                                      }
                                  }
                               });
                            });
                            $(".btnJugFacebook").on("click",function(){
                                var gender = response.gender;
                                var genero="";
                                if(gender==="male"){
                                    genero="Masculino";
                                }
                                else{
                                    genero="Femenino";
                                }
                               $.ajax({
                                  url:"/FutPlayFinal/usuario/registrar",
                                  method:"post",
                                  dataType:"json",
                                  data:{UNombre:response.first_name,UApellido:response.last_name,UFechaNacimiento:response.birthday,UTelefono:"",UGenero:genero,UCorreo:response.email,UContrasenia:"",UAvatar:response.picture.data.url},
                                  success: function(data){
                                      if(data>"0"){
                                          window.location.href = "/FutPlayFinal/material-dashboard/jugador/completarPerfilFB.jsp";
                                      }
                                      else{
                                          swal("Error","Ocurrio un error al momento de procesar la solicitud","error");
                                      }
                                  }
                               });
                            });
                        }
                   }
                });
             } 
          });
      }
  }
  (function(d, s, id){
     var js, fjs = d.getElementsByTagName(s)[0];
     if (d.getElementById(id)) {return;}
     js = d.createElement(s); js.id = id;
     js.src = "https://connect.facebook.net/en_US/all.js";
     fjs.parentNode.insertBefore(js, fjs);
   }(document, 'script', 'facebook-jssdk'));
   
  $("#loginBtn").on("click",function(){
    FB.login(function(response) {
        statusChangeCallback(response);
    },{scope: 'public_profile,email,user_birthday'});
  });