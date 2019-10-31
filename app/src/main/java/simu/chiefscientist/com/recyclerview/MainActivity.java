package simu.chiefscientist.com.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<ExampleItem> exampleList = new ArrayList<>();
        exampleList.add(new ExampleItem("Simuzeche" , "Kaluwa"));
        exampleList.add(new ExampleItem("John" , "Doe"));
        exampleList.add(new ExampleItem("Jane" , "Doe"));
        exampleList.add(new ExampleItem("Mamba" , "Mentality"));
        exampleList.add(new ExampleItem("Kakoko" , "Mindset"));
        exampleList.add(new ExampleItem("Yomali" , "Messi"));
        exampleList.add(new ExampleItem("Gospel" , "Swag"));


        mRecyclerView = findViewById(R.id.recycler_view);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new ExampleAdapter(exampleList);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);



    }
}
