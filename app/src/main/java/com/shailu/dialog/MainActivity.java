package com.shailu.dialog;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView texttable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        texttable=(TextView)findViewById(R.id.text);
    }

    public void helloworld(View view)
    {
        final AlertDialog.Builder alert=new AlertDialog.Builder(MainActivity.this);
        View myview=getLayoutInflater().inflate(R.layout.dialog,null);

        final EditText inputtableno=(EditText)myview.findViewById(R.id.table_no_text);
        Button button=(Button)myview.findViewById(R.id.ok);
        alert.setView(myview);
        final AlertDialog alertDialog=alert.create();
        alertDialog.setCanceledOnTouchOutside(false);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                texttable.setText(inputtableno.getText().toString());
                alertDialog.dismiss();
            }
        });



        alertDialog.show();

    }
}