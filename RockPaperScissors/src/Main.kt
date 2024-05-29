fun main() {
    var computerChoice = ""
    var playerChoice = ""
    print("Rock,Paper,Scissors? enter your choice")
    playerChoice = readln()
    val randomNumber = (1..3).random()//used range here
    when (randomNumber) {
        1 -> {
            computerChoice = "Rock"
        }

        2 -> {
            computerChoice = "Paper"
        }

        3 -> {
            computerChoice = "Scissors"
        }
    }
    println(computerChoice)
    val winner = when {
        playerChoice == computerChoice -> "game tied"
        playerChoice == "Rock" && computerChoice == "Scissors" -> "player won"
        playerChoice == "Paper" && computerChoice == "Rock" -> "player won"
        playerChoice == "Scissors" && computerChoice == "Paper" -> "player won"
        else -> "computer won"
    }
    if(winner=="game tied"){
        println("nobody won")
    }
    if(winner=="player won"){
        println("you won")
    }
    else {
        println("you lost")
    }

}
