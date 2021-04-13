- **¿Has aplicado los principios SOLID?**
He intentado escribir código limpio evitando repetir código y haciéndolo todo lo más eficiente que he sabido.

- **¿Cuánto tiempo has estado pensando y escribiendo los tests del código? Si hubieras tenido mucho más tiempo... ¿que habrías añadido?**
No he hecho test de código.

- **¿Por qué motivo has elegido el lenguaje que has usado para este test?**
He usado Kotlin porque es con el que más experiencia tengo en Android Studio.

- **¿Cómo mejorarías la API que has usado?**
Creo que la API no es muy intuitiva, la información que muestra no parece tener relación entre sí y sin conocimiento previo de la información, no sabes
a que se refiere con cada cosa. 

- **¿Qué framework y lenguaje crees que se ha usado para exponer esta API REST? Consejo: En el protocolo HTTP viaja mucha información** 
Con amazón aws se utiliza AWS Flow Framework con Java, ya que se emplea esta infraestructura para alojar la API, deduzco que será este el framework utilizado.

- **¿Crees que esta API soporta peticiones CORS? ¿Cómo has llegado a esa conclusión?**
Creo que si podría soportar peticiones CORS, según he visto, para poder recibir peticiones CORS la API debe devolver una serie de encabezados
cuando se hace una petición. Hice una prueba haciendo yo una petición a la API y devuelve "access-control-allow-origin: *", uno de los headers
que debe devolver según la documentación de AWS. 

- **¿En qué infraestructura crees que está alojada la API? ¿Por qué crees que hemos tomado esa decisión?**
Por el enlace deduzco que se ha usado "amazon aws". No sabría decir la razón exacta, pero supongo que ofrece una plataforma confiable y segura.

- **¿Cómo rastrearías un problema de rendimiento en producción? ¿Alguna vez has tenido que hacerlo?**
Buscaría algún programa para hacer pruebas de carga como jmeter y ver si podría soportar el rendimiento con una presión mayor.
No he hecho ninguna prueba práctica, pero si que tuve que investigar jmeter para un trabajo en el ciclo.

- **Descríbete a ti mismo usando JSON.**
[
  {
    "nombre": "Cristina Gil Morales",
    "edad": 20,
    "email": "cris.gil.morales@gmail.com",
    "estudios": "Grado Superior de Desarrollo de Aplicaciones Multiplataforma",
    "idiomas":[{
	    "español": "nivel nativo",
	    "inglés": "nivel avanzado"
      }
    ],
    "lenguajes_programacion":["Java", "Kotlin", "Python", "C#"],
    "habilidades": ["Resolucion de problemas", "Compañerismo", "Adaptabilidad"],
    "hobbies": ["Musica", "Artes marciales", "Videojuegos", "Anime"]
  }
]