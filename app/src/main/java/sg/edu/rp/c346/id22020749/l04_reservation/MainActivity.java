package sg.edu.rp.c346.id22020749.l04_reservation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    Button btnReserve;
    Button btnReset;
    DatePicker dp;
    TimePicker tp;
    CheckBox cb;
    EditText Name;
    EditText Telephone;
    EditText GroupSize;
    TextView Complete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnReserve = findViewById(R.id.buttonReserve);
        btnReset = findViewById(R.id.buttonReset);
        dp = findViewById(R.id.datePicker);
        tp = findViewById(R.id.timePicker);
        cb = findViewById(R.id.checkBox);
        Name = findViewById(R.id.editTextName);
        Telephone = findViewById(R.id.editTextTelephone);
        GroupSize = findViewById(R.id.editTextSize);
        Complete = findViewById(R.id.textViewCompleted);

        btnReserve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String displayDate = "Reservation date is " + dp.getDayOfMonth() + "/" + (dp.getMonth()+1) + "/" + dp.getYear();
                String displayTime = "Reservation time is " + tp.getHour() + ":" + tp.getMinute();
                String NameSubmitted = String.valueOf(Name.getText());
                String TelephoneSubmitted = String.valueOf(Telephone.getText());
                String GroupSubmitted = String.valueOf(GroupSize.getText());
                if (cb.isChecked()){
                    String checkboxText = "Smoking area requested.";
                }

                else {
                    String checkboxText = "Non-Smoking area requested.";
                }
                Toast.makeText(MainActivity.this, "Reservation Completed", Toast.LENGTH_LONG).show();
                Complete.setText("These are the submitted information: " + displayDate + "|" + displayTime + "|" + NameSubmitted + "|" + TelephoneSubmitted + "|" + GroupSubmitted);
            }
        });
    }
}