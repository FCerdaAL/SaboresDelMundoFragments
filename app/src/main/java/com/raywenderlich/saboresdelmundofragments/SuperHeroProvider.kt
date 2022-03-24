package com.raywenderlich.saboresdelmundofragments


class SuperHeroProvider(var pais : String) {


    companion object{

        const val CHILE = "Chile"
        const val ARGENTINA = "Argentina"

        fun getPais(pais: String): List<SuperHero> {

            var superHeroList : List<SuperHero> = emptyList()
            if (pais === CHILE){

                superHeroList = listOf<SuperHero>(
                    SuperHero(
                        "Empanada","https://comidasperuanas.net.pe/wp-content/uploads/2021/06/receta-de-empanada.jpg"

                    ),
                    SuperHero(
                        "Cazuela","https://img-global.cpcdn.com/recipes/fadaee2fd7c899a6/400x400cq70/photo.jpg"

                    ),
                    SuperHero(
                        "Pastel de Choclo","https://www.gourmet.cl/wp-content/uploads/2016/09/choclos-570x458.jpg"

                    ),
                    SuperHero(
                        "Humitas","//live.staticflickr.com/152/356662195_1c641228e4_b.jpg"

                    ),
                    SuperHero(
                        "Pichanga","https://comidastipicaschilenas.cl/wp-content/uploads/2021/06/Receta-de-Pichanga-Chilena.jpg"

                    ),
                )



            }

            else if(pais == ARGENTINA){

                superHeroList = listOf<SuperHero>(
                    SuperHero(
                        "argentina1","https://comidasperuanas.net.pe/wp-content/uploads/2021/06/receta-de-empanada.jpg"

                    ),
                    SuperHero(
                        "argentina2","https://img-global.cpcdn.com/recipes/fadaee2fd7c899a6/400x400cq70/photo.jpg"

                    ),
                    SuperHero(
                        "argentina3","https://www.gourmet.cl/wp-content/uploads/2016/09/choclos-570x458.jpg"

                    ),
                    SuperHero(
                        "argentina4","https://cdn7.kiwilimon.com/brightcove/8201/8201.jpg"

                    ),
                    SuperHero(
                        "argentina5","https://comidastipicaschilenas.cl/wp-content/uploads/2021/06/Receta-de-Pichanga-Chilena.jpg"

                    ),
                )

            }
            return superHeroList}









    }
}