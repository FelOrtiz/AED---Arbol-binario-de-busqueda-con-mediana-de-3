#Árbol binario de búsqueda con mediana de 3

##Problema

El ABB-M3 se direfencia del ABB principalmente porque en las hojas (nodos sin hijos) se pueden almacenar hasta 3 llaves, por ende, las operaciones basicas no son exactamente iguales al ABB normal. Las operaciones operan de la siguiente manera:

- Insersión: La inserción sólo se puede realizar en las hojas. Si en la hoja hay espacio para una nueva llave, esta se almacena en orden. Si no existe espacio en la hoja, esta se divide y se forman 3 nuevos nodos: Nodo interno (que almacena la llave del medio), hoja izquierda (que almacena la llave menor) y hoja derecha (que almacena la llave mayor), luego se procede a insertar la llave entrante en la hoja correspondiente.

#### Ejemplo

  <img src="http://i.imgur.com/BeYxd6r.png">

  Como se puede apreciar, al insertar el número 7 se produce la división y se crea el nodo interno con el valor del medio (12) y sus respectivas hojas (5) y (14), luego se inserta el 7 en la hoja menor y nos queda como se ve arriba. Después, se produce el mismo efecto al insertar el número 0.

- Búsqueda: Los nodos internos permiten calcular hacia dónde debería estar la llave a buscar, luego si la llave esta en un nodo interno o en una hoja (comparando la llave a buscar con las llaves de la hoja) esta se considera una búsqueda exitosa, por otro lado, si en la bajada desde la raíz hasta la hoja no esta la llave, la búusqueda se considera infructuosa.

#### Búsqueda exitosa   
  
  <img src="http://i.imgur.com/IfTll5V.png">

  Como se puede apreciar, sólo nos costo 4 comparaciones de llave para saber que el número 6 se encuentra en nuestro árbol que contiene 23 elementos.

#### Búsqueda infructuosa

  <img src="http://i.imgur.com/YZzfp8O.png">

  Por otro lado, procedemos a buscar un número que no existe en nuestro árbol, en este caso el número 22, y nos toma 4 conparaciones para darnos cuenta que no pertecene a nuestro árbol.


- Eliminación: Para eliminar debemos buscar la llave, luego si la llave está en una hoja, esta se elimina directamente. Si la llave esta en un nodo interno, se deben realizar algunos ajustes. Si hay a lo mas 3 llaves en la suma de los subárboles, estos se compactan formando una sola hoja y se conectan con el padre del nodo a eliminar. Luego, si hay mas de 3 llaves en la suma de los subárboles, se debe mover el menor de los mayores o el mayor de los menores al lugar de la llave borrada.

#### Eliminación directa en una hoja

  <img src="http://i.imgur.com/3NGGOhc.png">

  Se puede ver que el núumero a eliminar se encuentra en una hoja, por ende, se elimna directamente.

#### Eliminación de nodo interno con suma de llaves de subárboles menores o iguales a 3
  
  <img src="http://i.imgur.com/nAYbhWH.png">

  Acá eliminamos un nodo interno, y como es lógico no podemos dejar el nodo sin llave, por esta razón procedemos a comprobar si la suma de llaves de los subárboles es menor o igual a 3, lo compactamos en una sola hoja, después eliminamos el nodo interno vacío y jutamos el nodo padre con la nueva hoja.

#### Eliminación de nodo interno con suma de llaves de subárboles mayores a 3

  <img src="http://i.imgur.com/L5xBLGj.png">

  Aquí eliminamos el un nodo interno, luego comprobamos si la suma de las llaves de los subárboles es menor o igual a 3, como no lo es, tenemos que buscar al mayor de los menores y reemplazarlo por el espacio que dejamos en el nodo interno.

##Ejecución

```
$ javac Tarea4.java
$ java -Xms6144m Tarea4 n llavesNo < entrada
```

- `n` cantidad de elementos, con n entre 1 y 10 (ambos incluidos). 
- `llavesNo` archivo que debe contener 500.000 llaves que no estan en el archivo entrada
- `entrada` archivo con n*(10^6) llaves. 