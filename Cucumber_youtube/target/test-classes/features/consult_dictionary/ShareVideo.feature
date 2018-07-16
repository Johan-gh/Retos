Feature: buscar video

  Scenario: buscar video 'shape of my heart'
    Given el usuario esta en la pagina de youtube
    When busca el video 'shape of my heart'
    When reproducir 
    When compartir
    When googleplus
    
  