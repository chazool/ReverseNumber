package com.virtusa.reversenumber.manage;

public class PrintNumber {
    public static  void main(String args[]){

        int inputNo=1354;

        int count =(inputNo+"").length();
        int reverceNo=0;
        for (int x=0;x<count;x++){

            int result = inputNo %10;
            inputNo = inputNo /10;
            reverceNo = Integer.parseInt(reverceNo+""+result);

        }
        System.out.print(reverceNo);

    }




}
