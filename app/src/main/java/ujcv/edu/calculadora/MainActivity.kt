package ujcv.edu.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var digito:Double = 0.0
    var dato1 : Double = 0.0
    var total : Double = 0.0
    var proceso : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun ceropressed(view: View){
        var cero : Double = 0.0
        digito = aumentar(digito, cero)
        respuesta.text = digito.toString()
    }
    fun onepressed(view: View){
        var uno : Double = 1.0
        digito = aumentar(digito, uno)
        respuesta.text = digito.toString()
    }
    fun twopressed(view: View){
        var dos : Double = 2.0
        digito = aumentar(digito, dos)
        respuesta.text = digito.toString()
    }
    fun threepressed(view: View){
        var tres : Double = 3.0
        digito = aumentar(digito, tres)
        respuesta.text = digito.toString()
    }
    fun fourpressed(view: View){
        var cuatro : Double = 4.0
        digito = aumentar(digito, cuatro)
        respuesta.text = digito.toString()
    }
    fun fivepressed(view: View){
        var cinco : Double = 5.0
        digito = aumentar(digito, cinco)
        respuesta.text = digito.toString()
    }
    fun sixpressed(view: View){
        var seis : Double = 6.0
        digito = aumentar(digito, seis)
        respuesta.text = digito.toString()
    }
    fun sevenpressed(view: View){
        var siete : Double = 7.0
        digito = aumentar(digito, siete)
        respuesta.text = digito.toString()
    }
    fun eigthpressed(view: View){
        var ocho : Double = 8.0
        digito = aumentar(digito, ocho)
        respuesta.text = digito.toString()
    }
    fun ninepressed(view: View){
        var nueve : Double = 9.0
        digito = aumentar(digito, nueve)
        respuesta.text = digito.toString()
    }
    fun sumpressed(view: View){
        dato1 = digito
        digito = 0.0
        proceso = 1
        respuesta.text = ""
    }
    fun restpressed(view: View){
        dato1 = digito
        digito = 0.0
        proceso = 2
        respuesta.text = ""
    }
    fun multipressed(view: View){
        dato1 = digito
        digito = 0.0
        proceso = 3
        respuesta.text = ""
    }
    fun divpressed(view: View){
        dato1 = digito
        digito = 0.0
        proceso = 4
        respuesta.text = ""
    }
    fun clearpressed(view: View){
        respuesta.text = ""
        digito = 0.0
        dato1 = 0.0
        total = 0.0
    }
    fun equalpressed(view: View){
        if (proceso == 1){
            total = dato1 + digito
            digito = total
        }
        if (proceso == 2){
            total = dato1 - digito
            digito = total
        }
        if (proceso == 3){
            total = dato1 * digito
            digito = total
        }
        if (proceso == 4){
            total = dato1 / digito
            digito = total
        }
        respuesta.text = total.toString()
    }


    fun aumentar(actual:Double, nuevo:Double): Double {
        return actual * 10 + nuevo

    }

}