# Reto
Un proyecto donde se ejemplifica el uso del patr�n serenity screenplay con cucumber y gradle.

Las pruebas de este ejemplo se corren contra la p�gina web de metro.pe.

Por defecto, los tests corren en Chrome.


# Detalles generales de la implementaci�n

El siguiente proyecto consiste en la automatizaci�n de la b�squeda de un producto dentro de la pagina de compras https://www.metro.pe/, el robot abre el navegador e ingresa a la URL ya mencionada, seguido se valida si el PopUp del inicio est� presente o no, si est� presente lo cierra, sino continua con la prueba, cerrado el PopUp se digita el nombre del producto a buscar en el buscador de la pagina de compras y se realiza una acci�n de ENTER para hacer efectiva la b�squeda, teniendo un resultados de producto se busca dentro de ellos el producto buscado y se da click, en caso de que no este se devuelve producto no encontrado, en la pagina del detalle del producto se agrega el producto al carrito y luego el robot ingresa al carrito, donde se valida si el producto se agrego correctamente, para este en caso de tener vario productos se toma la lista de estos y se compara el nombre del producto en el carrito con el que espera, si as� se agrego una acci�n de dar clik en el checkbox del producto en el carrito para hacer efectiva la validaci�n y al final se cierra el navegador.

    
# Requerimientos

Para correr el proyecto se necesita Java JDK 1.8 y Gradle preferiblemente con la versi�n 5.4.

#  Para correr el proyecto

"gradle clean test aggregate" es el comando que correr� los tests y generar� el reporte en la carpeta /target/site/serenity/