Feature: Carga de documentos que exceden el tamaño máximo

  Scenario: Intento de cargar un documento mayor a 50 MB
    Given el usuario navega a la sección de "Solicitud de renovación"
    When el usuario selecciona la opción para cargar documentos
    And el usuario selecciona un documento que excede los 50 MB
    Then el sistema muestra un mensaje de error indicando que el tamaño del archivo supera el límite permitido