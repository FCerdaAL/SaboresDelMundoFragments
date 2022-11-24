# SaboresDelMundoFragments

El siguiente proyecto se hizo con fines de aprendizaje, específicamente adquirir habilidades en el uso de RecyclerView, la navegación entre fragmentos y el paso 
de datos entre los mismos. Recordar que un RecyclerView es una manera de mostrar elementos en forma de lista; pero de manera optimizada, donde se cargan las vistas 
que caben en la pantalla y no todas a la vez, mejorando el uso de recursos de la App. Un fragmento no es nada más que una pantalla, es decir una visualización. 
La documentación de Google recomienda que por cada aplicación haya 1 actividad y todas las demás vistas sean fragmentos, es decir 1 Activity x N Fragments.

Para ello se creó una app de platillos típicos de países en América, el cual cuenta con tres fragmentos y una sola actividad:

Fragmento 1: Listado de países (RecyclerView):

<img src="https://user-images.githubusercontent.com/25965764/159942940-52a372cc-16d1-4487-8e6e-481693edeb8c.png" width="297" height="628">


Fragmento 2: Listado de platillos del país (RecycleView) (En este caso se seleccionó Chile):


<img src="https://user-images.githubusercontent.com/25965764/159943361-efb4fa4e-4ba3-47ff-a837-02b94369c7bc.png" width="297" height="628">


Fragmento 3: Descripción del platilllo seleccionado (TextView con una breve descripción). (En este caso se seleccionó Empanada):

<img src="https://user-images.githubusercontent.com/25965764/159943491-a95342be-efb4-4675-91bf-3109598b316e.png" width="297" height="628">


En la siguiente imágen se volvió a la pantalla anterior y se seleccionó Argentina. Se visualiza un cambio en el listado de platillos, especificamente en el nombre de los
platillos; sin embargo las imágenes permanecieron sin cambio y esto es porque no se cambió el URL de las imágenes asociadas al nuevo listado perteneciente a Argentina.
Pero se puede hacer fácilmente.


<img src="https://user-images.githubusercontent.com/25965764/159948938-52071ccd-367a-41de-9da3-02814e5401b5.png" width="297" height="628">


Tanto Fragmento 1 y Fragmento 2 tendrán un FragmentContainerView para contener el RecyclerView. Fragmento 3 sólo utilizó un TextView para fines de prueba.
Pero se podrían agregar más imágenes, entre otras cosas.

De Fragmento 1 (pantalla inicial) se ve un espacio disponible al lado izquierdo de la imágen, esto es porque se utilizó el RecyclerView del listado de platillos. 
En este último, cada elemento (ViewHolder) tiene una imágen y el nombre del platillo, por lo que quedó con este formato. Pero se podría agregar una bandera.

Toda la información a desplegar se guardó de manera local en la app. El listado de países estará inserto dentro de una clase de Kotlin (companion object), 
la cual en conjunto con su data class correspondiente devolverá el listado (ListOf del tipo de data class). 

Para el fragmento 2 se creó una clase que contiene un Map el cual mapea el platillo elegido junto con una descripción que será mostrada en el Fragmento 3.

Para saber qué país y platillo se debe desplegar, se utilizó sharedViewModel, el cual permite pasar datos entre Fragmentos. Este sharedViewModel utilizará LiveData,
para actualizar de manera automática las listas que se desplegarán en los Fragmentos.

Se pensó en terminar este proyecto en su totalidad y subirla a la playstore, pero debido al copyright de las imágenes se dejó como proyecto sólo de aprendizaje.

