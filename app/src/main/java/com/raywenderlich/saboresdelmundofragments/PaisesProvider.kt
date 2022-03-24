package com.raywenderlich.saboresdelmundofragments

class PaisesProvider(var pais : String) {

    companion object{

        val superHeroList = listOf<Paises>(
            Paises("Chile"),
            Paises("Argentina"),
            Paises("Brasil"),
            Paises("Paraguay"),
            Paises("Canada"),
            Paises("Estados Unidos"),
        )

    }

}