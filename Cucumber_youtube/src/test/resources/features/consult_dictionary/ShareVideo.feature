Feature: buscar video

	
  Scenario: buscar video 'shape of my heart'
    Given el usuario esta en la pagina de youtube
    When busca y reproduce el video 'shape of my heart'     
    When comparte y selecciona GooglePlus 
    When el usuario ingresa con el usuario 'johan1035.gh@gmail.com' y la clave 'Johan1402@'
    When el usuario publica el video buscado con el mensaje 'Publicacion automatica con cucumber' 
    
  Scenario: entrar a googleplus
    Given el usuario esta en la pagina de googleplus    
    When  el usuario ingresa con el usuario 'email' y la clave 'pass' a googleplus
    When login 'email''pass'
    When inicio
  
  
  

    
  
