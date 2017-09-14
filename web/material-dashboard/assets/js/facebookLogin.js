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
          alert("yes");
      }
      else{
          alert("no");
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
    });
  });