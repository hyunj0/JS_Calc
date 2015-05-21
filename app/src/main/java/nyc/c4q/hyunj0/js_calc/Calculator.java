package nyc.c4q.hyunj0.js_calc;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.math.BigDecimal;

//Sarah will be the back-end gal with Joshelyn as her sidekick!!

public class Calculator extends ActionBarActivity {

    public
    //Basic calculator
    Button  point,
            zero, one, two, three, four, five, six, seven, eight, nine,
            add, subtract, multiply, divide,
            equals,
            clear,

    //Scientific calculator
            openParen, closeParen,
            pi, e,
            percentage,
            factorial,
            inverse,
            sqrt, exp, expTen,
            log, ln,
            sine, cosine, tangent,
            radians, degrees,
            ans;

    TextView preview;
    String expression, answer;

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

        add = (Button) findViewById(R.id.add);
        subtract = (Button) findViewById(R.id.subtract);
        multiply = (Button) findViewById(R.id.multiply);
        divide = (Button) findViewById(R.id.divide);

        equals = (Button) findViewById(R.id.equals);

        clear = (Button) findViewById(R.id.clear);

        openParen = (Button) findViewById(R.id.openParen);
        closeParen = (Button) findViewById(R.id.closeParen);

        pi = (Button) findViewById(R.id.pi);
        e = (Button) findViewById(R.id.e);

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

        ans = (Button) findViewById(R.id.ans);

        preview = (TextView) findViewById(R.id.preview);

        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expression = preview.getText().toString();
                if (expression.isEmpty()) {
                    preview.append("0.");
                } else if (!(Character.isDigit(expression.charAt(expression.length() - 1)))) {
                    if (expression.charAt(expression.length() - 1) != '.')
                        preview.append("0.");
                } else {
                    preview.append(".");
                }
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
                if (expression.contains("π"))
                    expression = expression.replace("π", "PI");
                if (expression.contains("√"))
                    expression = expression.replace("√", "SQRT");
                if (expression.contains("%"))
                    expression = expression.replace("%", "/100");
                if (expression.contains("ANS"))
                    expression = expression.replace("ANS", answer);
                Expression calculate = new Expression(expression);
                answer = calculate.eval().toString();
                preview.setText(answer);
            }
        });

        if (clear != null) {
            clear.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    preview.setText("");
                }
            });
        }

        if (openParen != null) {
            openParen.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    preview.append("(");
                }
            });
        }
        if (closeParen != null) {
            closeParen.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    preview.append(")");
                }
            });
        }

        if (pi != null) {
            pi.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    preview.append("π");
                }
            });
            factorial.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    preview.append("!");
                }
            });
        }
        if (e != null) {
            e.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    preview.append("e");
                }
            });
        }

        if (percentage != null) {
            percentage.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    preview.append("%");
                }
            });
        }

        if (factorial != null) {
            factorial.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    preview.append("!");
                }
            });
        }

        if (sqrt != null) {
            sqrt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    preview.append("√(");
                }
            });
        }
        if (exp != null) {
            exp.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    preview.append("^");
                }
            });
        }
        if (expTen != null) {
            expTen.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    preview.append("E");
                }
            });
        }

        if (log != null) {
            log.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    preview.append("log(");
                }
            });
        }
        if (ln != null) {
            ln.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    preview.append("ln(");
                }
            });
        }

        if (sine != null) {
            sine.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    preview.setText("sin(");
                }
            });
        }
        if (cosine != null) {
            cosine.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    preview.setText("cos(");
                }
            });
        }
        if (tangent != null) {
            tangent.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    preview.setText("tan(");
                }
            });
        }

        if (ans != null) {
            ans.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    preview.append("ANS");
                }
            });
        }
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
