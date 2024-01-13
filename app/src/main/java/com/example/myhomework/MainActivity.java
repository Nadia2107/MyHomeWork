package com.example.myhomework;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {


    private String exponent = "2.11345544485876834966459043583445466756767677765645343324385965757483490454578675094374596509496679549433545234795873409375567045404389657583697689043687680834806589083406740" +
            "2457968039596586549039458665049823485796747908045843038967534890456567443795478579544274795757934795776796585680437632335445353456454245656509489575764747845975579573479579579380958658568968966" +
            "4759767376890659668954586680538056688042406730822456559808045685480348066848046568048034805868034348067640475670674034760706383745656367557473465657455734796765897934456497456593373946459437565";

    private int[] arrayInt;
    private int volume3;
    private int volume5;
    private int rareDigit;
    private String reversStringInt;

    private TextView infoApp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        arrayInt = arrayInt(exponent);
        volume3 = volume3(arrayInt);
        volume5 = volume5(arrayInt);
        rareDigit = rareDigit(arrayInt);

        infoApp = findViewById(R.id.infoApp);

        infoApp.setText("Массив из строки " + Arrays.toString(arrayInt) + "\n"
                + "Колличество цифр 3 " + volume3 + "\n"
                + "Колличество цифр 5 " + volume5 + "\n"
                + "Самая редкая цифра" + rareDigit + "\n");


    }


    private int[] arrayInt(String string) {
        String stringNew = string.replace(".","");
        String[] arrayString = stringNew.split("");
        int[] arrayInteger = new int[arrayString.length];
        for (int i = 0; i < arrayString.length; i++) {
            arrayInteger[i] = Integer.parseInt(arrayString[i]);
        }
        return  arrayInteger;
    }


    private int volume3(int[] arrayDigit) {
        int count = 0;
        for (int i : arrayDigit) {
            if (i == 3) {
                count++;
            }
        }
        return count;
    }


    private int volume5(int[] arrayDigit) {
        int count = 0;
        for (int i : arrayDigit) {
            if (i == 5) {
                count++;
            }
        }
        return count;
    }


    private int rareDigit(int[] arrayDigit) {
        int[] count = new int[10];
        for (int i : arrayDigit) {
            switch (i) {
                case 0:
                    count[0]++;
                    break;
                case 1:
                    count[1]++;
                    break;
                case 2:
                    count[2]++;
                    break;
                case 3:
                    count[3]++;
                    break;
                case 4:
                    count[4]++;
                    break;
                case 5:
                    count[5]++;
                    break;
                case 6:
                    count[6]++;
                    break;
                case 7:
                    count[7]++;
                    break;
                case 8:
                    count[8]++;
                    break;
                case 9:
                    count[9]++;
                    break;
            }
        }
        int rare = 0;
        for (int i = 1; i < count.length; i++) {
            if (count[i] > count[rare]) rare = i;
        }
        return rare;
    }

    private int[] reversArrayInt(int[] arrayDigit) {
        int[] revers = new int[arrayDigit.length];
        for (int i = arrayDigit.length - 1; i >= 0; i--) {
            revers[arrayDigit.length - (i + 1)] = arrayDigit[i];
        }
        return revers;
    }

}



