package ;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {
    DatabaseReference h1,c1,c2,c3,dt,dw,ba,bb,bc,td;
    TextView hd1,content1,content2,content3,date,draw,bda,bdb,bdc,tdg;
    Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hd1 = (TextView)findViewById(R.id.head1);
        content1 = (TextView)findViewById(R.id.content1);
        content2 = (TextView)findViewById(R.id.content2);
        content3 = (TextView)findViewById(R.id.content3);

        date = (TextView)findViewById(R.id.date);
        draw = (TextView)findViewById(R.id.draw);

        bda = (TextView)findViewById(R.id.a);
        bdb = (TextView)findViewById(R.id.b);
        bdc = (TextView)findViewById(R.id.c);

        bt =(Button)findViewById(R.id.btn);

        tdg = (TextView)findViewById(R.id.three_digit);

        h1 = FirebaseDatabase.getInstance().getReference().child("result").child("heading");

        c1 = FirebaseDatabase.getInstance().getReference().child("result").child("content1");
        c2 = FirebaseDatabase.getInstance().getReference().child("result").child("content2");
        c3 = FirebaseDatabase.getInstance().getReference().child("result").child("content3");

        dt = FirebaseDatabase.getInstance().getReference().child("result").child("date");
        dw = FirebaseDatabase.getInstance().getReference().child("result").child("draw");


        ba = FirebaseDatabase.getInstance().getReference().child("result").child("a");
        bb = FirebaseDatabase.getInstance().getReference().child("result").child("b");
        bc = FirebaseDatabase.getInstance().getReference().child("result").child("c");

        td = FirebaseDatabase.getInstance().getReference().child("result").child("three_digit");

        h1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String str;
                str=dataSnapshot.getValue(String.class);
                hd1.setText(str);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });


        c1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String str;
                str=dataSnapshot.getValue(String.class);
                content1.setText(str);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        c2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String str;
                str=dataSnapshot.getValue(String.class);
                content2.setText(str);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        c3.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String str;
                str=dataSnapshot.getValue(String.class);
                content3.setText(str);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });


        dt.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String str;
                str=dataSnapshot.getValue(String.class);
                date.setText(str);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        dw.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String str;
                str=dataSnapshot.getValue(String.class);
                draw.setText(str);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });


        ba.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String str;
                str=dataSnapshot.getValue(String.class);
                bda.setText(str);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        bb.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String str;
                str=dataSnapshot.getValue(String.class);
                bdb.setText(str);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        bc.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String str;
                str=dataSnapshot.getValue(String.class);
                bdc.setText(str);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });



    }

    public void save (View v){
        String str2=hd1.getText().toString();
        h1.setValue(str2);

        String str3=content1.getText().toString();
        c1.setValue(str3);

        String str4=content2.getText().toString();
        c2.setValue(str4);

        String str5=content3.getText().toString();
        c3.setValue(str5);

        String str6=date.getText().toString();
        dt.setValue(str6);

        String str7=draw.getText().toString();
        dw.setValue(str7);

        String str8=bda.getText().toString();
        ba.setValue(str8);

        String str9=bdb.getText().toString();
        bb.setValue(str9);

        String str10=bdc.getText().toString();
        bc.setValue(str10);

        Toast.makeText(getApplicationContext(),"Data saved!!",Toast.LENGTH_SHORT).show();
    }
}
