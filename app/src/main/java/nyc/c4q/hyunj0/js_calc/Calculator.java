package nyc.c4q.hyunj0.js_calc;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

//Sarah will be the back-end gal with Joshelyn as her sidekick!!

public class Calculator extends ActionBarActivity {

    public
    Button  point,
            zero, one, two, three, four, five, six, seven, eight, nine,
            e, pi,
            add, subtract, multiply, divide,
            percentage,
            factorial,
            inverse,
            sqrt, exp, expTen,
            log, ln,
            sine, cosine, tangent,
            radians, degrees,
            equals, ans,
            openParen, closeParen,
            clear;

    TextView preview;
    String expression;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        point = (Button) findViewById(R.id.point);
        zero = (Button) findViewById(R.id.zero);
        one = (Button) findViewById(R.id.one);
        two = (Button) findViewById(R.id.two);
        three = (Button) findViewById(R.id.three);
        four = (Button) findViewById(R.id.four);
        five = (Button) findViewById(R.id.five);
        six = (Button) findViewById(R.id.six);
        seven = (Button) findViewById(R.id.seven);
        eight = (Button) findViewById(R.id.eight);
        nine = (Button) findViewById(R.id.nine);

        e = (Button) findViewById(R.id.e);
        pi = (Button) findViewById(R.id.pi);

        add = (Button) findViewById(R.id.add);
        subtract = (Button) findViewById(R.id.subtract);
        multiply = (Button) findViewById(R.id.multiply);
        divide = (Button) findViewById(R.id.divide);

        percentage = (Button) findViewById(R.id.percentage);

        factorial = (Button) findViewById(R.id.factorial);

        inverse = (Button) findViewById(R.id.inverse);

        sqrt = (Button) findViewById(R.id.sqrt);
        exp = (Button) findViewById(R.id.exp);
        expTen = (Button) findViewById(R.id.expTen);

        log = (Button) findViewById(R.id.log);
        ln = (Button) findViewById(R.id.ln);

        sine = (Button) findViewById(R.id.sine);
        cosine = (Button) findViewById(R.id.cosine);
        tangent = (Button) findViewById(R.id.tangent);

        radians = (Button) findViewById(R.id.radians);
        degrees = (Button) findViewById(R.id.degrees);

        equals = (Button) findViewById(R.id.equals);

        ans = (Button) findViewById(R.id.ans);

        openParen = (Button) findViewById(R.id.openParen);
        closeParen = (Button) findViewById(R.id.closeParen);

        clear = (Button) findViewById(R.id.clear);

        preview = (TextView) findViewById(R.id.preview);

        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                preview.append(".");
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                preview.append("0");
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                preview.append("1");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                preview.append("2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                preview.append("3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                preview.append("4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                preview.append("5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                preview.append("6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                preview.append("7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                preview.append("8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                preview.append("9");
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                preview.append("+");
            }
        });
        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                preview.append("-");
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                preview.append("*");
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                preview.append("/");
            }
        });
        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expression = preview.getText().toString();
                Expression calculate = new Expression(expression);
                preview.setText(calculate.eval().toString());
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_basic_calc, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
