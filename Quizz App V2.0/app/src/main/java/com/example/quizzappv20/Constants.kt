package com.example.quizzappv20

object Constants {
    const val CORRECT_ANSWERS: String = "cor_ans"

    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        val q1 = Question(1, "What brand does this logo belong to?",
            R.drawable.ic_logo_android,
            "Apple",
            "Android",
            "Windows",
            "Linux",
            2
        )

        val q2 = Question(2, "What brand does this logo belong to?",
            R.drawable.ic_logo_apple,
            "Apple",
            "Android",
            "Windows",
            "Linux",
            1
        )

        val q3 = Question(3, "What brand does this logo belong to?",
            R.drawable.ic_logo_windows,
            "Apple",
            "Android",
            "Windows",
            "Linux",
            3
        )

        val q4 = Question(4, "What brand does this logo belong to?",
            R.drawable.ic_logo_audi,
            "Mercedes",
            "Audi",
            "Volkswagen",
            "Mitsubishi",
            2
        )

        val q5 = Question(5, "What brand does this logo belong to?",
            R.drawable.ic_logo_nike,
            "Lacoste",
            "Ralph Lauren",
            "H&M",
            "Nike",
            4
        )

        val q6 = Question(6, "What brand does this logo belong to?",
            R.drawable.ic_logo_mcdonalds,
            "McDonald's",
            "KFC",
            "Taco Bell",
            "Burger King",
            1
        )

        val q7 = Question(7, "What brand does this logo belong to?",
            R.drawable.ic_logo_chanel,
            "Gucci",
            "Louis Vuitton",
            "Chanel",
            "Balenciaga",
            3
        )

        val q8 = Question(8, "What brand does this logo belong to?",
            R.drawable.ic_logo_converse,
            "Adidas",
            "Nike",
            "Vans",
            "Converse",
            4
        )

        val q9 = Question(9, "What brand does this logo belong to?",
            R.drawable.ic_logo_facebook,
            "Youtube",
            "Facebook",
            "Instagram",
            "Whatsapp",
            2
        )

        val q10 = Question(10, "What brand does this logo belong to?",
            R.drawable.ic_logo_google,
            "Bing",
            "Gucci",
            "Google",
            "Yahoo",
            3
        )

        val q11 = Question(11, "What brand does this logo belong to?",
            R.drawable.ic_logo_mercedes,
            "Mercedes",
            "Audi",
            "BMW",
            "Mitsubishi",
            1
        )

        val q12 = Question(12, "What brand does this logo belong to?",
            R.drawable.ic_logo_netflix,
            "Netflix",
            "Spotify",
            "Youtube",
            "Facebook",
            1
        )

        val q13 = Question(13, "What brand does this logo belong to?",
            R.drawable.ic_logo_pepsi,
            "Coca-Cola",
            "Fanta",
            "Schweppes",
            "Pepsi",
            4
        )

        val q14 = Question(14, "What brand does this logo belong to?",
            R.drawable.ic_logo_twitter,
            "Facebook",
            "Twitter",
            "Instagram",
            "Whatsapp",
            2
        )

        val q15 = Question(15, "What brand does this logo belong to?",
            R.drawable.ic_logo_playstation,
            "XBox",
            "Playstation",
            "Windows",
            "Linux",
            2
        )

        val q16 = Question(16, "What brand does this logo belong to?",
            R.drawable.ic_logo_xbox,
            "XBox",
            "Playstation",
            "Windows",
            "Linux",
            1
        )

        val q17 = Question(17, "What brand does this logo belong to?",
            R.drawable.ic_logo_shell,
            "Petrom",
            "Lukoil",
            "Shell",
            "Euroil",
            3
        )

        val q18 = Question(18, "What brand does this logo belong to?",
            R.drawable.ic_logo_ralph_lauren,
            "Ralph Lauren",
            "Lacoste",
            "Nike",
            "Adidas",
            1
        )

        val q19 = Question(19, "What brand does this logo belong to?",
            R.drawable.ic_logo_youtube,
            "Facebook",
            "Instagram",
            "Twitter",
            "Youtube",
            4
        )

        val q20 = Question(20, "What brand does this logo belong to?",
            R.drawable.ic_logo_volkswagen,
            "Mercedes",
            "Volkswagen",
            "Audi",
            "BMW",
            2
        )

        questionsList.add(q1)
        questionsList.add(q2)
        questionsList.add(q3)
        questionsList.add(q4)
        questionsList.add(q5)
        questionsList.add(q6)
        questionsList.add(q7)
        questionsList.add(q8)
        questionsList.add(q9)
        questionsList.add(q10)
        questionsList.add(q11)
        questionsList.add(q12)
        questionsList.add(q13)
        questionsList.add(q14)
        questionsList.add(q15)
        questionsList.add(q16)
        questionsList.add(q17)
        questionsList.add(q18)
        questionsList.add(q19)
        questionsList.add(q20)

        return questionsList
    }
}