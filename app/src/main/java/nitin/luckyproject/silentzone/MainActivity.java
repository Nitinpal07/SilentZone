package nitin.luckyproject.silentzone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ArrayList<LocationList> list =new ArrayList<>();
        LocationList l1 = new LocationList("Delhi","india gate");
        LocationList l2 = new LocationList("Rohini","metro");
        list.add(l1);
        list.add(l2);
        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        PlaceListAdapter adapter = new PlaceListAdapter(MainActivity.this,list);
        recyclerView.setAdapter(adapter);


        //setting layoutManager



    }
}
