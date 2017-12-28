package ru.andreyv.my_di_project;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import javax.inject.Inject;

import ru.andreyv.my_di_project.LoadData.LoadData;
import ru.andreyv.my_di_project.SetString.SetString;

public class MainActivity extends AppCompatActivity {

    private TextView tv;

    //  базовая аннотация, с помощью которой “запрашивается зависимость"
@Inject SetString str;
@Inject LoadData ld;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = (TextView)findViewById(R.id.tv);

DI.getPostavshik_Objektov_Component().inject(this);


        tv.setText(str.str);



    }


}
