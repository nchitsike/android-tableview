package co.akello.tableview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import de.codecrafters.tableview.TableView;
import de.codecrafters.tableview.toolkit.SimpleTableDataAdapter;
import de.codecrafters.tableview.toolkit.SimpleTableHeaderAdapter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TableView tableView=findViewById(R.id.table_data_view);
        String[] headers={"ID","Name","Surname","Age"};
        String[][] data={{"1","John","Doe","89"},{"2","Alfred","Doe","101"}};

        tableView.setHeaderAdapter(new SimpleTableHeaderAdapter(this,headers));
        tableView.setDataAdapter(new SimpleTableDataAdapter(this,data));

    }
}