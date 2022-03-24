package com.raywenderlich.saboresdelmundofragments

class ComidaDescripcionMap(var pais : String, var keyComida : String) {


        companion object{

            const val CHILE = "Chile"
            const val ARGENTINA = "Argentina"

            fun getDescription(pais: String, keyComida : String): String {

                var mapaComida = mapOf<String, String>()
                if (pais === CHILE) {

                    mapaComida = mapOf(
                        "Empanada" to "descripcionEmpanada",
                        "Cazuela" to "descripcionCazuela",
                        "Pastel de Choclo" to "descripcionPastel",
                        "Humitas" to "descripcionHumitas",
                        "Pichanga" to "descripcionPichanga"
                    )

                    //return mapaComida.getValue(keyComida)


                } else if (pais == ARGENTINA) {

                    mapaComida = mapOf(
                        "Empanada" to "descripcionEmpanada",
                        "Cazuela" to "descripcionCazuela",
                        "Pastel de Choclo" to "descripcionPastel",
                        "Humitas" to "descripcionHumitas",
                        "Pichanga" to "descripcionPichanga"
                    )

                    //return mapaComida.getValue(keyComida)

                }

                return mapaComida.getValue(keyComida)
                //return mapaComida
            }









        }
    }