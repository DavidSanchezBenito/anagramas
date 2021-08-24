Using JAVA & Eclipse Task description: The task is to write a program which finds all anagrams of a given word in a dictionary (the anagram must also be part of the dictionary). The dictionary is a simple text file which contains one word per line. The program should handle anagram-requests as fast as possible. Consider a pre-processing of the dictionary to optimize the requests.

La aplicación se compone de dos métodos principales:

leerArchivo() => Lee el fichero facilitado, y manipularlo para dejar exclusivamente los caracteres alfanuméricos, y líneas vacias. a. Además, las letras se ordenan alfanuméricamente. b. Al método le damos la ruta del fichero origen y genera otro que renombro y se llama: "d:/descargado2021.txt
comprobarPalabra => Buscar la primera palabra del fichero en todo el nuevo fichero generado, y cuenta si está un mínimo de dos veces, en este caso esa palabra existe como Anagrama (pues han sido ya ordenadas las letras) a. El problema encontrado aquí es que al iterar el fichero no consigo que cada palabra vuelva a comenzar desde el principio, sino que la primera palabra buscada, se llega al final y al volver a buscar la 2ª ya no busca nada porque el puntero parece que está al final del texto.
Documentación que he utilizado para realizar el ejercicio:

No puedo concretar porque he estado mirando paginas para recordar leer/escribir ficheros y manipulación de Strings para dejar las palabras ordenadas correctamente, pero básicamente Youtube y StackFlow.
PD: si puedo, mañana domingo, grabo en una captura el funcionamiento y resumo lo que he hecho, para que lo veáis más rápido.

Saludos,

David Sanchez Benito
