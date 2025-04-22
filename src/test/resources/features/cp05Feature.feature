Feature: Validación de documentos obligatorios en solicitud de renovación

  Scenario: Intentar continuar sin cargar documentos obligatorios
    Given el usuario navega a la sección de "Solicitud de renovación"
    When el usuario intenta continuar sin cargar documentos obligatorios
    Then el sistema muestra un mensaje de error indicando que se requieren documentos obligatorios para continuar