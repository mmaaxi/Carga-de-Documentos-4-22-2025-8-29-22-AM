Feature: Carga de documento con formato no válido

  Scenario: El sistema no permite cargar un documento con un formato no permitido
    Given el usuario navega a la sección de "Solicitud de renovación"
    When el usuario selecciona la opción para cargar documentos
    Then se muestra la opción de carga
    When el usuario selecciona un documento en formato no permitido
    And intenta cargar el documento
    Then el sistema muestra un mensaje de error indicando que el formato no es válido