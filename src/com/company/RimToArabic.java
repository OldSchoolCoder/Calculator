package com.company;

public class RimToArabic {
    private String rimNumber;
    private int ArabicNumber;

    public RimToArabic(String rimNumber) {
        this.rimNumber=rimNumber;
    }

    /*
        public RimToArabic() {

        }

    public void initialize(String rimNumber){ not work
        this.rimNumber=rimNumber;
    }*/

    public int getArabicNumber() {
        switch (rimNumber) {
            case "I":
                this.ArabicNumber=1;
                break;
            case "II":
                this.ArabicNumber=2;
                break;
            case "III":
                this.ArabicNumber=3;
                break;
            case "IV":
                this.ArabicNumber=4;
                break;
            case "V":
                this.ArabicNumber=5;
                break;
            case "VI":
                this.ArabicNumber=6;
                break;
            case "VII":
                this.ArabicNumber=7;
                break;
            case "VIII":
                this.ArabicNumber=8;
                break;
            case "IX":
                this.ArabicNumber=9;
                break;
            case "X":
                this.ArabicNumber=10;
                break;
            default:
                //если на вход арабская то она же и возвращается
                //this.ArabicNumber=Integer.parseInt(rimNumber);
                //здесь исключение не нужно т к ArabicNumber по умалчанию 0 и не попадает в диапазон (итак будет исключение)
                //System.out.println("Исключение из RimToArabic - ввод не римского числа");
                break;
        }
        return this.ArabicNumber;
    }
}
