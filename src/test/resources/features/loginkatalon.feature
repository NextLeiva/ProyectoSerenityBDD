Feature: Funcionalidad make appointment
  Rule: Yo como usuario quiero realizar un appointment
  de manera exitosa y con todos los datos correctamente

    Background: Ingresar a Make appointment web
      Given el usuario ingresar a make appointment page
      And login to make appointment

    @regresion
    Scenario Outline: Validar que make appointment fue exitosa
      When ingresar datos al appoinment datos <facility>, <readmission>, <program>, <visitDate> y <comment>
      Then verificar datos de appointment datos <facility>, <readmission>, <program>, <visitDate> y <comment>
      Examples:
        | facility                        | readmission | program  | visitDate  | comment  |
        | Seoul CURA Healthcare Center    | No          | Medicare | 12/01/2023 | selenium |
        | Hongkong CURA Healthcare Center | Nod         | Medicare | 13/01/2023 | cucumber |
