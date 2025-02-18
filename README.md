# Practica 1 (PATRON OBSERVER APLICADO A CANAL DE YOUTUBE Y SUSCRIPTORES)
# Mario Hernandez Pereda (873094)
# Marcos Galan Carrillo (874095)

En esta practica se ha desarrollado un patron Observer aplicado al contexto del "Canal de Yotube" junto con sus debidos suscriptores, los cuales seran notificados de que hay nuevo video, notificandolo por pantalla al usuario (especificando el usuario el cual es notificado), teniendo que crear una serie de clases siendo las siguientes, aplicando a su vez la tecnica de "push & pull" y "la especificacion de modificaciones de interes explicito":

- Explicación de cómo se materializa en tu implementación cada una de las clases presentes en la estructura del patrón. 
Main.java : clase en la cual se ejecutara el programa de prueba completo

CanalYt.java (Subject): clase en la cual se implementa la clase "Sujeto", que se relacionara con una serie de suscriptores (Observers),
avisandoles de si hay un nuevo video.

CanalYtConcreto.java (ConcreteSubject): clase hija de CanalYt, la cual adoptara una funcionalidad similar a la clase padre y estara 
relacionada con SuscriptorConcreto, para poder actualizar el estado de un suscriptor en concreto, cambiando su estado

Suscriptor.java (Observer): clase en la que se implementa la clase "observador", que se relaciona con una sola instancia
de la clase CanalYt.java, la cual representa el canal de youtube al que está suscrito dicho usuario.

SuscriptorConcreto.java (ConcreteObserver): clase hija de Suscriptor, la cual estara relacionada con un canal de youtube en concreto
teniendo que cambiar su estado de "hayNuevoVideo?" cuando sea necesario (cuando haya un notify)
  
- Explicación de cómo se materializan en tu implementación las relaciones presentes en la estructura del patrón.

Podemos ver que en la figura tenemos dos relaciones, una que relacion el subject con uno o más observadores, y otra que relaciona,
cada observer concreto con un subject concreto.
Podemos observar esto en nuestro programa, para relacionar los subjects con los observers, lo que hemos hecho es que el subject
tenga una lista donde puede almacenar los observers con los que se relaciona (array de suscriptores).
Por otro lado, cada uno de los observers concretos (suscriptores concretos) tienen un atributo para identificar el subject
concreto con el que están relacionados.

- Explicación de cómo se materializan en tu implementación los atributos y las operaciones presentes en la estructura del patrón.
En el patrón, podemos observar diversos métodos y atributos correspondientes a las diferentes clases.
Clase Subject -> attach(Observer), Detach(Observer), Notify()
Clase CanalYt -> agnadirSuscriptor(), eliminarSuscriptor(), notificarSuscriptor().

Clase ConcreteSubject -> GetState(), SetState(), subjectState
Clase CanalYtConcreto -> GetState(), SetState(), videoNuevo
Además de eso, tienen los métodos de atach, detach implementados especificamente

Clase Observer -> Update()
Clase Suscriptor -> Update()

Clase ConcreteObserver -> Update(), observerState
Clase SuscriptorConcreto -> Update(), hayVideo (atributo que nos dice si hay video o no pero podriamos quitarlo)


- Explicación de cómo se materializa en tu implementación la interacción descrita en la sección Collaborations del patrón.
En la sección de collaborations, podemos ver que se realiza un cambio de estado de un subject, después se notifica a todos los observadores, se manda un aviso de actualización a estos, y se actualiza su estado con el nuevo.

Nuestra implementación realiza todo esto, sin embargo tenemos además algunas modificaciones para hacerlo algo más eficiente.

- Si se implementa alguna de las mejoras que se proponen en la sección de implementación del documento proporcionado en Moodle sobre el patrón Observer, hay
  de explicarla al profesor. Se valorarán especialmente los apartados 6 y 7 de dicha sección (modelo push and pull y especificar modificaciones de interés explícitamente).

Hemos aplicado un modelo Push, el cual se basa en que el sujeto envía a los observadores información detallada sobre el cambio, ya sea que los observadores la necesiten o no,
pasandole el nuevo estado a cambiar como argumento del metodo update. Creemos que es más eficiente, ya que mediante el modelo Pull, tendriamos que realizar una invocacion del metodo getState(), al propio Subject para así poder obtener realmente el nuevo estado a cambiar del observer. Hemos aplicado un enum llamado EventoNotificacion, para asi poder difrenciar entre los distintos grupos de interes al añadir un suscriptor a un canal de YT, updateando unicamente aquellos que sean de un grupo de interes especifico, y los que no necesitan esa info ya que son de otro grupo de interés, obviando el invocar update().





