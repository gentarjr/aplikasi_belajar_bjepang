package com.unikom.kotobalearning.entity;

public class ModelKataBenda {

    private String textQuestionKataBenda[] = {
            "1. もの",
            "2. ぼうし",
            "3. かさ",
            "4. メガネ",
            "5. ハンカチ",
            "6. タオル",
            "7. せっけん",
            "8. シャンプー",
            "9. さいふ",
            "10. おかね"
    };

    private String multipleKataBenda[][] = {
            {"Barang", "Topi", "Payung", "Kacamata"},
            {"Korek Api", "Topi", "Obat", "Kunci"},
            {"Kaos Kaki", "Sepatu", "Payung", "Barang Bawaan"},
            {"Kacamata", "Tas", "Rokok", "Majalah"},
            {"Laptop", "Handphone", "Mouse", "Sapu tangan"},
            {"jaket", "Handuk", "Dompet", "Kunci"},
            {"Kipas Angin", "Bantal", "Sabun", "Rokok"},
            {"Tas", "Shampo", "Handuk", "Televisi"},
            {"Jaket", "Baju", "Celana", "Dompet"},
            {"Uang", "Handuk", "Jam", "Handphone"}
    };

    private String mCorrectAnswer[] = {
            "Barang", "Topi", "Payung", "Kacamata", "Sapu tangan", "Handuk", "Sabun", "Shampo", "Dompet", "Uang"
    };

    public int getLength(){
        return textQuestionKataBenda.length;
    }

    public String getQuestion(int a) {
        String question = textQuestionKataBenda[a];
        return question;
    }

    public String getChoice(int index, int num) {
        String choice0 = multipleKataBenda[index][num-1];
        return choice0;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswer[a];
        return answer;
    }
}
