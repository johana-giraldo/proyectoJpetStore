#Autor: Johana Giraldo
  #language:es


  Característica: Creacion y logeo de un nuevo usuario
    Yo como usuario
  Quiero poder registrarme en JpetStore
  Para poder loguearme

    @Caso1
    Escenario: Crear un usuario exitoso
    Dado que el  cliente se encuentra en la página de inicio
    Cuando diligencia cada uno de los campos obligatorios
      Y da clic en el botón “Save Account Information”
    Entonces el usuario queda registrado correctamente

@Caso2

    Escenario: login exitoso
    Dado que el  cliente se encuentra en la página de inicio
    Cuando ingresa su usuario
    Y ingresa su contraseña
    Y da clic en el botón ingresar
    Entonces el usuario queda logueado en la página


