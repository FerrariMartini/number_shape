package ifmartini.numbershapes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void testNumber (View view) {

//      getting the user number from UI text field.
        EditText getNumber = (EditText) findViewById(R.id.userNumber);

//      checking at IDE if the user number was got.
        Log.i("userNumber", getNumber.getText().toString());

//      converting the user number to integer
        int intUserNumber = Integer.parseInt(getNumber.getText().toString());

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
