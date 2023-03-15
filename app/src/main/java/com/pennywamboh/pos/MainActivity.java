package com.pennywamboh.pos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
   Button dressButton, topButton, trouserButton, skirtButton, resetButton;
   TextView dressQuantity, topsQuantity, trousersQuantity, skirtQuantity;
   TextView dressSubtotal, topsSubtotal, trousersSubtotal, skirtSubtotal;
   TextView grandTotal, discount, netTotal;

   int dresses = 0, tops = 0, trousers = 0 , skirts = 0;
   int dressPrice = 3000, topsPrice = 500, trouserPrice = 2500 , skirtPrice = 1500, gTotal = 0;

   float discount15, nTotal;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dressButton = findViewById(R.id.dressButton);
        topButton = findViewById(R.id.topButton);
        trouserButton = findViewById(R.id.trouserButton);
        skirtButton = findViewById(R.id.skirtButton);
        resetButton = findViewById(R.id.resetButton);

        dressQuantity = findViewById(R.id.dressQuantity);
        trousersQuantity = findViewById(R.id.trousersQuantity);
        topsQuantity = findViewById(R.id.topsQuantity);
        skirtQuantity = findViewById(R.id.skirtQuantity);

        dressSubtotal = findViewById(R.id.dressSubtotal);
        trousersSubtotal = findViewById(R.id.trousersSubtotal);
        topsSubtotal = findViewById(R.id.topsSubtotal);
        skirtSubtotal = findViewById(R.id.skirtSubtotal);

        grandTotal = findViewById(R.id.grandTotal);
        discount = findViewById(R.id.discount);
        netTotal = findViewById(R.id.netTotal);


        setOnclickListeners();

    }

    private void setOnclickListeners() {
        dressButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dresses = dresses + 1;
                dressQuantity.setText(String.valueOf(dresses));
                dressSubtotal.setText(String.valueOf(dresses * dressPrice));
                gTotal = gTotal + (dresses * dressPrice);

                discount15 = gTotal * 15/100;
                nTotal = gTotal - discount15;
                grandTotal.setText(String.valueOf(gTotal));
                discount.setText(String.valueOf(discount15));
                netTotal.setText(String.valueOf(nTotal));

            }
        });

        topButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tops = tops + 1;
                topsQuantity.setText(String.valueOf(tops));
                topsSubtotal.setText(String.valueOf(tops * topsPrice));
                gTotal = gTotal + (tops * topsPrice);

                discount15 = gTotal * 15/100;
                nTotal = gTotal - discount15;
                grandTotal.setText(String.valueOf(gTotal));
                discount.setText(String.valueOf(discount15));
                netTotal.setText(String.valueOf(nTotal));

            }
        });

        skirtButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skirts = skirts + 1;
                skirtQuantity.setText(String.valueOf(skirts));
                skirtSubtotal.setText(String.valueOf(skirts * skirtPrice));
                gTotal = gTotal + (skirts * skirtPrice);

                discount15 = gTotal * 15/100;
                nTotal = gTotal - discount15;
                grandTotal.setText(String.valueOf(gTotal));
                discount.setText(String.valueOf(discount15));
                netTotal.setText(String.valueOf(nTotal));

            }
        });

        trouserButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                trousers = trousers + 1;
                trousersQuantity.setText(String.valueOf(trousers));
                trousersSubtotal.setText(String.valueOf(trousers * trouserPrice));
                gTotal = gTotal + (trousers * trouserPrice);

                discount15 = gTotal * 15/100;
                nTotal = gTotal - discount15;
                grandTotal.setText(String.valueOf(gTotal));
                discount.setText(String.valueOf(discount15));
                netTotal.setText(String.valueOf(nTotal));

            }
        });

        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dresses = 0;
                tops = 0;
                trousers = 0;
                skirts = 0;

                discount15 = 0;
                nTotal = 0;
                gTotal = 0;

                grandTotal.setText("0");
                discount.setText("0");
                netTotal.setText("0");

                topsSubtotal.setText("0");
                dressSubtotal.setText("0");
                trousersSubtotal.setText("0");
                skirtSubtotal.setText("0");

                trousersQuantity.setText("0");
                skirtQuantity.setText("0");
                topsQuantity.setText("0");
                dressQuantity.setText("0");
            }
        });

    }
}