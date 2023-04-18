#Autor: Johana Giraldo
  #language:es

  @JpetStore
  Característica: Creacion y logueo de un nuevo usuario
    Yo como usuario
    Quiero poder registrarme en JpetStore
    Para poder realizar compras

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

    @Caso3
    Escenario:Consultar catálogo de productos desde el menú superior
    Dado que el  cliente se encuentra en la página de inicio
    Cuando da clic a una de las categorías del menú superior
    Entonces el cliente visualiza una tabla con los productos de la categoria

    @Caso4
    Escenario: Agregar productos al carrito de compras
    Dado que el  cliente se encuentra en la página de inicio
    Cuando da clic a una de las categorías del menú superior
    Y da clic en uno de los productos
    Y da clic en Add to Cart
    Entonces el producto se agrega al carrito de compras

    @Caso5
    Escenario: Relizar compra
    Dado que el  cliente se encuentra en la página de inicio
    Cuando se loguee
    Y agrega productos al carrito de compras
    Y realize el proceso de compra
    Entonces visualizara la factura de la compra
