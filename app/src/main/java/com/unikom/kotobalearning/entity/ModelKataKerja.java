package com.unikom.kotobalearning.entity;

public class ModelKataKerja {

    private String textQuestionKataKerja[] = {
            "1. あきます",
            "2. あるきます",
            "3. ふきます",
            "4. はきます",
            "5. はたらきます",
            "6. ひきます",
            "7. いきます",
            "8. かきます",
            "9. ききます",
            "10. みがきます"
    };

    private String multipleKataKerja[][] = {
            {"terbuka", "terbang", "memanggil", "tinggal"},
            {"beristirahat", "berjalan kaki", "mengambil", "mendaki"},
            {"membaca", "bertiup", "membuang", "berhenti"},
            {"menulis", "turun", "menjual", "mengenakan"},
            {"berkata", "bekerja", "membeli", "mengerti"},
            {"menarik", "pulang", "mengerti", "memotong"},
            {"pergi", "memotong", "melakukan", "memerlukan"},
            {"mendengar", "menyusahkan", "berbicara", "menulis"},
            {"membawa", "melengkung", "mendengar", "berdiri"},
            {"berdiri", "memoles", "menyerahkan", "menunggu"}
    };

    private String mCorrectAnswer[] = {
            "terbuka", "berjalan kaki", "bertiup", "mengenakan", "bekerja", "menarik", "pergi", "menulis", "mendengar", "memoles"
    };

    public int getLength(){
        return textQuestionKataKerja.length;
    }

    public String getQuestion(int a) {
        String question = textQuestionKataKerja[a];
        return question;
    }

    public String getChoice(int index, int num) {
        String choice0 = multipleKataKerja[index][num-1];
        return choice0;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswer[a];
        return answer;
    }
}
