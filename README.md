# Practica 1 (PATRON OBSERVER APLICADO A CANAL DE YOUTUBE)
# Mario Hernandez Pereda (873094)
# Marcos Galan Carrillo (874095)

En esta practica se ha desarrollado un patron Observer aplicado al contexto del "Canal de Yotube" junto con sus debidos suscriptores, los cuales seran notificados de que hay nuevo video, notificandolo por pantalla al usuario (especificando el usuario el cual es notificado), teniendo que crear una serie de clases siendo las siguientes, aplicando a su vez la tecnica de "push & pull" y "la especificacion de modificaciones de interes explicito":

- Main.java : clase en la cual se ejecutara el programa de prueba completo

- CanalYt.java (Subject): clase en la cual se implementa la clase "Sujeto", que se relacionara con una serie de suscriptores (Observers),
  avisandoles de si hay un nuevo video.

- CanalYtConcreto.java (ConcreteSubject): clase hija de CanalYt, la cual adoptara una funcionalidad similar a la clase padre y estara 
  relacionada con SuscriptorConcreto, para poder actualizar el estado de un suscriptor en concreto, cambiando su estado

- Suscriptor.java (Observer): clase en la que se implementa la clase "observador", que se relaciona con una sola instancia
  de la clase CanalYt.java, la cual representa el canal de youtube al que está suscrito dicho usuario.

- SuscriptorConcreto.java (ConcreteObserver): clase hija de Suscriptor, la cual estara relacionada con un canal de youtube en concreto
  teniendo que cambiar su estado de "hayNuevoVideo?" cuando sea necesario (cuando haya un notify)

