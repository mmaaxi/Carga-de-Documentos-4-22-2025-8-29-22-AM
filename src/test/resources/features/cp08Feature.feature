Feature: Validación de documento después de la carga

  Scenario: Cargar y validar documento
    Given el usuario está en la página de carga de documentos
    When el usuario carga un documento válido
    Then el documento se carga correctamente
    And el sistema valida el documento
    And el sistema muestra los resultados de validación en la pantalla