package com.company;

public class ArabicToRims {
    private int arabicNumber;
    private String rimNumber="";
    //private Map<String, String> digitMap=new HashMap<String, String>();
    //private List<int> list=new ArrayList<int>();
    private int[] arrInt=new int[]{1,4,5,9,10,40,50,90,100};
    private String[] arrStr=new String[]{"I","IV","V","IX","X","XL","L","XC","C"};
    private int step;

    public ArabicToRims(int arabicNumber) {
        this.arabicNumber=arabicNumber;
        //digitMap.put();

    }

    public String getRimNumber() {
        step=arrStr.length-1;
        //двигаемся по массиву назад уменьшая индекс пока арабское не будет = знач из масива
        while (arabicNumber>0) {
            if (arabicNumber>=arrInt[step]) {
                rimNumber+=arrStr[step];
                arabicNumber-=arrInt[step];
            } else {
                step--;
            }
        }

        return rimNumber;
    }
}
