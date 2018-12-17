package fr.epita.tictactoe

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import fr.epita.tictactoe.R.string.O
import fr.epita.tictactoe.R.string.X
import kotlinx.android.synthetic.main.activity_game_screen.*
import java.util.*
import android.widget.Toast
import android.R.attr.data
import android.app.PendingIntent.getActivity


class GameScreen : AppCompatActivity() , View.OnClickListener{


    var playerTurn = true //player 1

    fun check(sign:String){
        if (b1.text == sign && b2.text == sign && b3.text ==sign ||
            b1.text == sign && b4.text == sign && b7.text ==sign ||
            b1.text == sign && b5.text == sign && b9.text ==sign ||
            b7.text == sign && b8.text == sign && b9.text ==sign ||
            b3.text == sign && b6.text == sign && b9.text ==sign ||
            b2.text == sign && b5.text == sign && b8.text ==sign ||
            b4.text == sign && b5.text == sign && b6.text ==sign ||
            b3.text == sign && b5.text == sign && b7.text ==sign )
            if (sign == "X")
                Toast.makeText(this@GameScreen, "Loose",Toast.LENGTH_LONG).show()
            else
                Toast.makeText(this@GameScreen,"Win",Toast.LENGTH_LONG).show()
        else if (b1.text != "" && b2.text != "" && b3.text != "" &&
                 b4.text != "" && b5.text != "" && b6.text != "" &&
                 b7.text != "" && b8.text != "" && b9.text != "" )
            Toast.makeText(this@GameScreen,"Draw",Toast.LENGTH_LONG).show()
    }

    fun changeTurn(){
        if (playerTurn) {
            PlayerTurn1.text = "Your Turn:"
            PlayerTurn2.text = ""
        }
        else {
            PlayerTurn1.text= ""
            PlayerTurn2.text = "Your Turn:"
        }
        check("O")
        check("X")
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_screen)


        PlayerName.text = "(" + intent.getStringExtra("name") + ")"

        playerTurn = (1..100).shuffled().first() % 2 == 0
        changeTurn()
        b1.setOnClickListener(this@GameScreen)
        b2.setOnClickListener(this@GameScreen)
        b3.setOnClickListener(this@GameScreen)
        b4.setOnClickListener(this@GameScreen)
        b5.setOnClickListener(this@GameScreen)
        b6.setOnClickListener(this@GameScreen)
        b7.setOnClickListener(this@GameScreen)
        b8.setOnClickListener(this@GameScreen)
        b9.setOnClickListener(this@GameScreen)

    }

    override fun onClick(v: View?) {
        if(v!=null){
            when (v.id) {
                R.id.b1 -> {
                    if (b1.text == "") {
                        if (playerTurn)
                          b1.text= "X"
                        else
                            b1.text="O"
                        playerTurn = !playerTurn
                        changeTurn()
                    }
                }
                R.id.b2 -> {
                    if (b2.text == "") {
                        if (playerTurn)
                            b2.text= "X"
                        else
                            b2.text= "O"
                        playerTurn = !playerTurn
                        changeTurn()
                    }
                }
                R.id.b3 -> {
                    if (b3.text == "") {
                        if (playerTurn)
                            b3.text= "X"
                        else
                            b3.text= "O"
                        playerTurn = !playerTurn
                        changeTurn()
                    }
                }
                R.id.b4 -> {
                    if (b4.text == "") {
                        if (playerTurn)
                            b4.text= "X"
                        else
                            b4.text= "O"
                        playerTurn = !playerTurn
                        changeTurn()
                    }
                }
                R.id.b5 -> {
                    if (b5.text == "") {
                        if (playerTurn)
                            b5.text= "X"
                        else
                            b5.text= "O"
                        playerTurn = !playerTurn
                        changeTurn()
                    }
                }
                R.id.b6 -> {
                    if (b6.text == "") {
                        if (playerTurn)
                            b6.text= "X"
                        else
                            b6.text= "O"
                        playerTurn = !playerTurn
                        changeTurn()
                    }
                }
                R.id.b7 -> {
                    if (b7.text == "") {
                        if (playerTurn)
                            b7.text= "X"
                        else
                            b7.text= "O"
                        playerTurn = !playerTurn
                        changeTurn()
                    }
                }
                R.id.b8 -> {
                    if (b8.text == "") {
                        if (playerTurn)
                            b8.text= "X"
                        else
                            b8.text= "O"
                        playerTurn = !playerTurn
                        changeTurn()
                    }
                }
                R.id.b9 -> {
                    if (b9.text == "") {
                        if (playerTurn)
                            b9.text= "X"
                        else
                            b9.text= "O"
                        playerTurn = !playerTurn
                        changeTurn()

                    }
                }
            }
        }
    }
}


