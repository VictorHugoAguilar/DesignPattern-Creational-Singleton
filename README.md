# DesignPattern - Creational - Singleton
Patrón de diseño - Creacional - Singleton

## Propósito

Singleton es un patrón de diseño creacional que nos permite asegurarnos de que una clase tenga una única instancia, a la vez que proporciona un punto de acceso global a dicha instancia.

## Todas las implementaciones del patrón Singleton tienen estos dos pasos en común:

Hacer privado el constructor por defecto para evitar que otros objetos utilicen el operador new con la clase Singleton.
Crear un método de creación estático que actúe como constructor. Tras bambalinas, este método invoca al constructor privado para crear un objeto y lo guarda en un campo estático. Las siguientes llamadas a este método devuelven el objeto almacenado en caché.
Si tu código tiene acceso a la clase Singleton, podrá invocar su método estático. De esta manera, cada vez que se invoque este método, siempre se devolverá el mismo objeto.

![UML Sigleton](https://github.com/VictorHugoAguilar/DesignPattern-Creational-Singleton/blob/master/img/singleton-diagram.png?raw=true)

![Diagrama de secuencia](https://github.com/VictorHugoAguilar/DesignPattern-Creational-Singleton/blob/master/img/singleton-sequence.png?raw=true)

