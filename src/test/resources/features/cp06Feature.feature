Feature: Progreso de carga de documento grande

  Scenario: Cargar un documento grande en la sección de "Solicitud de renovación"
    Given que el usuario navega a la sección de "Solicitud de renovación"
    When selecciona un archivo grande
    And inicia la carga del archivo
    Then aparece una ventana mostrando el progreso de la carga hasta que se completa