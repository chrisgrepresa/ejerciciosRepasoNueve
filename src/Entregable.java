public interface Entregable {

    public void entregar(); //cambia atributo entregado a true
    public void devolver();  //cambia atributo entregado a false
    public boolean isEntregado();  //devuelve el estado del atributo prestado.

    public void compareTo (Videojuego, Serie);

    

/*

    Método compareTo (Object a), compara las horas estimadas en los videojuegos y en las series
    el numero de temporadas. Como parámetro que tenga un objeto, no es necesario que
    implementes la interfaz Comparable. Recuerda el uso de los casting de objetos.



    Implementa los anteriores métodos en las clases Videojuego y Serie.
    Ahora crea una aplicación ejecutable y realiza lo siguiente:

    Crea dos arrays, uno de Series y otro de Videojuegos, de 5 posiciones cada uno.

    Crea un objeto en cada posición del array, con los valores que desees, puedes usar distintos constructores.

    Entrega algunos Videojuegos y Series con el método entregar().

    Cuenta cuantos Series y Videojuegos hay entregados. Al contarlos, devuélvelos.

    Por último, indica el Videojuego tiene más horas estimadas y la serie con mas temporadas. Muestralos en pantalla con toda su información (usa el método toString()).*/
}
