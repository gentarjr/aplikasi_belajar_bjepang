package com.unikom.kotobalearning.entity;

public class ModelKataSifat {

    private String textQuestionKataSifat[] = {
            "1. あおい",
            "2. あぶない",
            "3. あかい",
            "4. あかるい",
            "5. あまい",
            "6. あたらしい",
            "7. あたたかい",
            "8. あつい",
            "9. ちいさい",
            "10. ちかい"
    };

    private String multipleKataSifat[][] = {
            {"biru", "merah", "kuning", "hijau"},
            {"hati-hati", "bahaya", "lucu", "kotor"},
            {"hijau", "putih", "merah", "kuning"},
            {"hitam", "gelap", "transparan", "terang"},
            {"pedas", "asam", "manis", "pahit"},
            {"baru", "lama", "panjang", "berat"},
            {"panas", "sejuk", "dingin", "hangat"},
            {"ringan", "tebal", "tipis", "berat"},
            {"kecil", "besar", "banyak", "sempit"},
            {"kotor", "dekat", "jauh", "bulat"}
    };

    private String mCorrectAnswer[] = {
            "biru", "bahaya", "merah", "terang", "manis", "baru", "hangat", "tebal", "kecil", "dekat"
    };

    public int getLength(){
        return textQuestionKataSifat.length;
    }

    public String getQuestion(int a) {
        String question = textQuestionKataSifat[a];
        return question;
    }

    public String getChoice(int index, int num) {
        String choice0 = multipleKataSifat[index][num-1];
        return choice0;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswer[a];
        return answer;
    }
}
