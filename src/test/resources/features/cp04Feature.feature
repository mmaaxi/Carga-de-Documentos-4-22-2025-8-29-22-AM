Feature: Carga de múltiples documentos
  Como usuario del sistema
  Quiero cargar múltiples documentos
  Para completar mi solicitud de renovación

  Scenario: Cargar múltiple documentos
    Given el usuario está en la sección de "Solicitud de renovación"
    When el usuario selecciona la opción para cargar documentos
    And selecciona múltiples documentos válidos en formatos permitidos
    And confirma la carga
    Then todos los documentos se cargan correctamente y se muestra un mensaje de confirmación con la lista de documentos cargados