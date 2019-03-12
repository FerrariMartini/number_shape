package ifmartini.numbershapes;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //    Class with attributes and methods to evaluate and test the given user number.
    class Number {
        int number;

        //        A method to test if given user number is Square. The return is a boolean result.
        public boolean isSquare() {
            double squareRoot = Math.sqrt(number);

            if (squareRoot == Math.floor(squareRoot)) {
                return true;
            } else {
                return false;
            }
        }

        //        A method to test if given user number is Triangular. The return is a boolean result.
        public boolean isTriangular() {
            int x = 1;
            int triangularNumber = 1;

            while (triangularNumber < number) {

                x++;

                triangularNumber = triangularNumber + x;

            }
            if (triangularNumber == number) {
                return true;

            } else {

                return false;

            }
        }

    }

    //  method to test the number when the buttonTest is pressed.
    public void testNumber(View view) {
        String message = " ";

//      getting the user number from UI text field.
        EditText getNumber = (EditText) findViewById(R.id.userNumber);

////      checking at IDE if the user number was got.
//            Log.i("userNumber", getNumber.getText().toString());

//      converting the user number to integer
        int intUserNumber = Integer.parseInt(getNumber.getText().toString());

        if (getNumber.getText().toString().isEmpty()) {

            message = "Please enter a number";

        } else {

//      Instantiation of Number class (Attributes and methods) for "connect" both to used
// attributes and methods of the class here.
            Number myNumber = new Number();

            myNumber.number = intUserNumber;

            if (myNumber.isSquare() && myNumber.isTriangular()) {

                message = myNumber.number + " is both triangular and square number";

            } else if (myNumber.isTriangular()) {
                message = myNumber.number + " is only triangular number";

            } else {
                message = myNumber.number + " is only square number";

            }
        }

        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG).show();

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
