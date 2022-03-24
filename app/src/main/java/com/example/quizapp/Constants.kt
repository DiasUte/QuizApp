package com.quizapp

import com.example.quizapp.Question
import com.example.quizapp.R

object Constants {

    // TODO (STEP 1: Create a constant variables which we required in the result screen.)
    // START
    var USER_NAME: String = "user_name"
    var TOTAL_QUESTIONS: String = "total_questions"
    var CORRECT_ANSWERS: String = "correct_answers"
    // END

    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        // 1
        val que1 = Question(
            1, "Who is this?",
            R.drawable.einstein,
            "Einstein", "Tesla",
            "Stalin", "Elon Musk", 1
        )

        questionsList.add(que1)

        // 2
        val que2 = Question(
            2, "What the speed of light?",
            R.drawable.light_speed,
            "3 * 10^9", "4 * 10^8",
            "3 * 10^8", "3 * 100^8", 3
        )

        questionsList.add(que2)

        // 3
        val que3 = Question(
            3, "Who won the first Nobel Prize in Physics?",
            R.drawable.nobel,
            "Albert Einstein", "Nicole Teska",
            "John Bardeen", "Wilhelm Röntgen", 4
        )

        questionsList.add(que3)

        // 4
        val que4 = Question(
            4, "The name of the scientist who threw the cannonballs from the Leaning Tower of Pisa?",
            R.drawable.tower,
            "Archimed", "Galileo Galilei",
            "Michael Faraday", "Isaac Newton", 2
        )

        questionsList.add(que4)

        // 5
        val que5 = Question(
            5, "Who invented dynamite?",
            R.drawable.dynamite,
            "Ernest Reserford", "J.J Thomson",
            "Alfred Nobel", "John Dalton", 3
        )

        questionsList.add(que5)

        // 6
        val que6 = Question(
            6, "Physical quantity measured in m/s",
            R.drawable.speed,
            "Speed", "Length",
            "Massa", "Pressure", 1
        )

        questionsList.add(que6)

        // 7
        val que7 = Question(
            7, "Device for measuring atmospheric pressure",
            R.drawable.barometr,
            "Dynamometer", "Hydrometer",
            "Barometer", "Pressure gauge", 3
        )

        questionsList.add(que7)

        // 8
        val que8 = Question(
            8, "For 30 seconds, the train moved evenly at a speed of 72 km / h. determine the path",
            R.drawable.train,
            "650m", "500m",
            "100m", "600m", 4
        )

        questionsList.add(que8)

        // 9
        val que9 = Question(
            9, "What is the name of the force with which the Earth attracts its bodies to itself?",
            R.drawable.earth,
            "The strength of elasticity", "Gravity",
            "Weight", "Archimedean power", 2
        )

        questionsList.add(que9)

        // 10
        val que10 = Question(
            10, "The aggregate state in which the substance retains its volume takes the form of a vessel in which to be",
            R.drawable.agg,
            "Liquid", "Gas",
            "Plasma", "Steam", 1
        )

        questionsList.add(que10)

        return questionsList
    }
}