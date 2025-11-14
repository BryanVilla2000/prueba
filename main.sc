// PREGUNTA 1 

val datos : List[Double]= List(0.0, 1.2, 4.5, 7.2, 5.0)
def myMethod(datos: List[Double]) : Double = 
  val promedio = datos.sum / datos.length
  
  val sumaCuadrados = datos.map(diferencia => diferencia - promedio)
                           .map(diferencia => diferencia * diferencia)
                           .sum
                           
  Math.sqrt(sumaCuadrados / datos.length)

myMethod(datos)



//PREGUNTA 2

//val notas : List[Double]= List(0.0, 1.2, 4.5, 7.2, 5.0)

//def calificaciones(n: Double) : Double = {if (n>5.0) n+1 else n}

//notas.map(n=>calificaciones(n))

//PREGUNTA 3

def generadorSaludo(fraseBase: String,nombre: String): String = s"$fraseBase, $nombre!"
generadorSaludo("ssss","ddd")
