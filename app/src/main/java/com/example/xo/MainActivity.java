package com.example.xo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ButtonBarLayout;

import android.app.admin.FactoryResetProtectionPolicy;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView turn, result;
    Button bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9;
    byte counter;
    boolean one, two, three, four, five, six, seven, eight, nine, one1, two2, three3, four4, five5, six6, seven7, eight8, nine9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        turn = findViewById(R.id.turn);
        result = findViewById(R.id.Result);
        bt1 = findViewById(R.id.bt1);
        bt2 = findViewById(R.id.bt2);
        bt3 = findViewById(R.id.bt3);
        bt4 = findViewById(R.id.bt4);
        bt5 = findViewById(R.id.bt5);
        bt6 = findViewById(R.id.bt6);
        bt7 = findViewById(R.id.bt7);
        bt8 = findViewById(R.id.bt8);
        bt9 = findViewById(R.id.bt9);

    }

    public void check() {
// 123-456-789-147-258-369-159-357
        if ((one == true && two == true && three == true) || (four == true && five == true && six == true) ||
                (seven == true && eight == true && nine == true) || (one == true && four == true && seven == true) ||
                (two == true && five == true && eight == true) || (three == true && six == true && nine == true) ||
                (one == true && five == true && nine == true) || (three == true && five == true && seven == true)){
            result.setText("O Won");
        bt1.setEnabled(false);
        bt2.setEnabled(false);
        bt3.setEnabled(false);
        bt4.setEnabled(false);
        bt5.setEnabled(false);
        bt6.setEnabled(false);
        bt7.setEnabled(false);
        bt8.setEnabled(false);
        bt9.setEnabled(false);
    }
        else if ((one1 == true && two2 == true && three3 == true) || (four4 == true && five5 == true && six6 == true) ||
                (seven7 == true && eight8 == true && nine9 == true) || (one1 == true && four4 == true && seven7 == true) ||
            (two2 == true && five5 == true && eight8 == true) || (three3 == true && six6 == true && nine9 == true) ||
                (one1 == true && five5 == true && nine9 == true) || (three3 == true && five5 == true && seven7 == true))
        {
            result.setText("X Won");
            bt1.setEnabled(false);
            bt2.setEnabled(false);
            bt3.setEnabled(false);
            bt4.setEnabled(false);
            bt5.setEnabled(false);
            bt6.setEnabled(false);
            bt7.setEnabled(false);
            bt8.setEnabled(false);
            bt9.setEnabled(false);
        }
else if(counter == 9)
    result.setText("Draw");
    }


    public void b1(View view) {
        counter++;
        bt1.setEnabled(false);
        if (counter % 2 == 0) {
            turn.setText("Turn : X");
            bt1.setText("O");
            one = true;
        } else if (counter % 2 == 1) {
            turn.setText("Turn : O");
            bt1.setText("X");
            one1 = true;
        }
        check();
    }

    public void b2(View view) {
        counter++;
        bt2.setEnabled(false);
        if (counter % 2 == 0) {
            turn.setText("Turn : X");
            bt2.setText("O");
            two = true;
        } else if (counter % 2 == 1) {
            turn.setText("Turn : O");
            bt2.setText("X");
            two2 = true;
        }
        check();
    }

    public void b3(View view) {
        counter++;
        bt3.setEnabled(false);
        if (counter % 2 == 0) {
            turn.setText("Turn : X");
            bt3.setText("O");
            three = true;
        } else if (counter % 2 == 1) {
            turn.setText("Turn : O");
            bt3.setText("X");
            three3 = true;
        }
        check();
    }

    public void b4(View view) {
        counter++;
        bt4.setEnabled(false);
        if (counter % 2 == 0) {
            turn.setText("Turn : X");
            bt4.setText("O");
            four = true;
        } else if (counter % 2 == 1) {
            turn.setText("Turn : O");
            bt4.setText("X");
            four4 = true;
        }
        check();
    }

    public void b5(View view) {
        counter++;
        bt5.setEnabled(false);
        if (counter % 2 == 0) {
            turn.setText("Turn : X");
            bt5.setText("O");
            five = true;
        } else if (counter % 2 == 1) {
            turn.setText("Turn : O");
            bt5.setText("X");
            five5 = true;
        }
        check();
    }

    public void b6(View view) {
        counter++;
        bt6.setEnabled(false);
        if (counter % 2 == 0) {
            turn.setText("Turn : X");
            bt6.setText("O");
            six = true;
        } else if (counter % 2 == 1) {
            turn.setText("Turn : O");
            bt6.setText("X");
            six6 = true;
        }
        check();
    }

    public void b7(View view) {
        counter++;
        bt7.setEnabled(false);
        if (counter % 2 == 0) {
            turn.setText("Turn : X");
            bt7.setText("O");
            seven = true;
        } else if (counter % 2 == 1) {
            turn.setText("Turn : O");
            bt7.setText("X");
            seven7 = true;
        }
        check();
    }

    public void b8(View view) {
        counter++;
        bt8.setEnabled(false);
        if (counter % 2 == 0) {
            turn.setText("Turn : X");
            bt8.setText("O");
            eight = true;
        } else if (counter % 2 == 1) {
            turn.setText("Turn : O");
            bt8.setText("X");
            eight8 = true;
        }
        check();
    }

    public void b9(View view) {
        counter++;
        bt9.setEnabled(false);
        if (counter % 2 == 0) {
            turn.setText("Turn : X");
            bt9.setText("O");
            nine = true;
        } else if (counter % 2 == 1) {
            turn.setText("Turn : O");
            bt9.setText("X");
            nine9 = true;
        }
        check();
    }


    public void restart(View view) {
        turn.setText("");
        result.setText("");
        one = false;
        two = false;
        three = false;
        four = false;
        five = false;
        six = false;
        seven = false;
        eight = false;
        nine = false;
        one1 = false;
        two2 = false;
        three3 = false;
        four4 = false;
        five5 = false;
        six6 = false;
        seven7 = false;
        eight8 = false;
        nine9 = false;
        bt1.setEnabled(true);
        bt2.setEnabled(true);
        bt3.setEnabled(true);
        bt4.setEnabled(true);
        bt5.setEnabled(true);
        bt6.setEnabled(true);
        bt7.setEnabled(true);
        bt8.setEnabled(true);
        bt9.setEnabled(true);
        bt1.setText("");
        bt2.setText("");
        bt3.setText("");
        bt4.setText("");
        bt5.setText("");
        bt6.setText("");
        bt7.setText("");
        bt8.setText("");
        bt9.setText("");
        counter=0;
    }
}