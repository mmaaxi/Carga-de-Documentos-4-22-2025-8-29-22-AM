Feature: Carga de documento válido

  Scenario: Cargar un documento válido en la sección de solicitud de renovación
    Given el usuario navega a la sección de "Solicitud de renovación"
    When el usuario selecciona la opción para cargar documentos
    And el usuario selecciona un documento válido "Listado de asegurados" en formato XLS
    Then el usuario confirma la carga del documento
    And el documento se carga con éxito y se muestra un mensaje de confirmación