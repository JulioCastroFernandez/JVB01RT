--- GUIA DE USO APP GESTION DE CLIENTES ---

Esta aplicación, permite gestionar la información de la base de datos de clientes 
de una empresa. 

A través de un menú interactivo en la consola de Intellji podrás realizar las siguientes acciones:

|| Agregar nuevo cliente.
|| Listar todos los clientes.
|| Actualizar información de un cliente.
|| Eliminar un cliente.
|| Buscar cliente por ciudad.

*Nota: Se asume que la aplicación ya ha sido iniciada en Intellji y se está ejecutando en la consola.

>INICIO DE LA APLICACION

Al iniciar la aplicación en la consola, verás el siguiente menú principal:

---GESTIÓN DE CLIENTES---

1. Agregar nuevo cliente
2. Listar todos los clientes
3. Actualizar información de un cliente
4. Eliminar un cliente
5. Buscar un cliente por ciudad
0. Salir

Deberás introducir el número correspondiente a la acción que deseas realizar y pulsar Enter.

A continuación, se describe cada una de las opciones:

> 1. AGREGAR NUEVO CLIENTE

Selecciona esta opción para registrar un nuevo cliente. La app te solicitara los siguientes datos:

• Nombre (Obligatorio): Nombre del cliente.
• Apellidos (Obligatorio): Apellidos del cliente.
• Sexo (Obligatorio)
• Ciudad (Obligatorio)
• Fecha de nacimiento (Obligatorio)
• Número de teléfono (Obligatorio)
• Correo electrónico (Obligatorio)

Una vez proporcionados todos los datos, la app intentará guardar la información en la base de datos.
Si algo saliera mal, mandaría un mensaje de error.

> 2. LISTAR TODOS LOS CLIENTES

Selecciona esta opción para ver una lista de todos los clientes registrados en la base de datos.

Si hay clientes, se mostrará su información (ID, nombre, apellidos, etc.) listada en la consola.
Si no hay clientes, se indicara que la base de datos está vacía.


> 3. ACTUALIZAR INFORMACIÓN DE UN CLIENTE

Selecciona esta opción para modificar los datos de un cliente existente.

Primero, se te pedirá que introduzcas el **ID** del cliente que deseas actualizar. Si el cliente con ese ID no se encuentra, se te informará.

Si el cliente es encontrado, se mostrarán sus datos actuales. Luego, la aplicación te irá preguntando por cada campo (Nombre, Apellidos, Sexo, Ciudad, etc.).

• Para mantener el valor actual de un campo, simplemente presiona Enter sin escribir nada.
• Para cambiar el valor de un campo, escribe el nuevo dato y presiona Enter.
• Para la fecha de nacimiento y el número de teléfono, si decides cambiarlos, deberás seguir los formatos `YYYY-MM-DD` y solo números, respectivamente. La aplicación validará el formato si intentas cambiarlos.

Después de revisar todos los campos, la aplicación guardará los cambios en la base de datos y te informará si la actualización fue exitosa.

> 4. Eliminar un cliente

Selecciona esta opción para borrar un cliente de la base de datos.

Se te pedirá que introduzcas el **ID** del cliente que deseas eliminar. Si el cliente con ese ID no se encuentra, se te informará y no se realizará ninguna acción.

Si el cliente es encontrado, la aplicación lo eliminará de la base de datos y confirmará la eliminación.

> 5. Buscar cliente por ciudad

Selecciona esta opción para encontrar clientes que residen en una ciudad específica.

Se te pedirá que introduzcas el nombre de la **Ciudad** que deseas buscar.

La aplicación buscará en la base de datos y mostrará una lista de todos los clientes encontrados que coincidan con la ciudad especificada. Si no se encuentra ningún cliente en esa ciudad, se te informará.

> 0. Salir

Selecciona esta opción para finalizar la ejecución de la aplicación. La aplicación se cerrará limpiamente.

> COMO CONTINUAR

Después de realizar la mayoría de las operaciones (excepto Salir), la aplicación pausará y mostrará el mensaje "Presiona Enter para continuar...". Simplemente presiona Enter para regresar al menú principal y elegir otra opción.



