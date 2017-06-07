package test.muhammed.com.listviewandroid;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.ListViewCompat;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private ListViewCompat mListViewCompat = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setUI();
    }

    private void setUI() {
        mListViewCompat = (ListViewCompat) findViewById(R.id.listView);
        ArrayList<String> names = getNameList();
        mListViewCompat.setDivider(new ColorDrawable(Color.BLACK));
        mListViewCompat.setDividerHeight(2);
        mListViewCompat.setAdapter(new NameAdapter(this, names));

        mListViewCompat.setOnItemClickListener(this);
//        registerForContextMenu(mListViewCompat);
    }

    private ArrayList<String> getNameList() {
        ArrayList<String> names = new ArrayList<>();
        names.add("Muhammed");
        names.add("Muhammed");
        names.add("Muhammed");
        names.add("Muhammed");
        names.add("Muhammed");
        names.add("Muhammed");
        names.add("Muhammed");
        names.add("Muhammed");
        names.add("Muhammed");
        names.add("Muhammed");
        names.add("Muhammed");
        names.add("Muhammed");
        names.add("Muhammed");
        names.add("Muhammed");
        names.add("Muhammed");
        names.add("Muhammed");
        names.add("Muhammed");
        names.add("Muhammed");
        names.add("Muhammed");
        names.add("Muhammed");
        names.add("Muhammed");
        names.add("Muhammed");
        names.add("Muhammed");
        names.add("Muhammed");
        names.add("Muhammed");
        names.add("Muhammed");
        names.add("Muhammed");
        names.add("Muhammed");
        names.add("Muhammed");
        return names;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this, "Position : " + position, Toast.LENGTH_SHORT).show();
    }

    private static class ViewHolder {
        private TextView textView;
    }

    private class NameAdapter extends ArrayAdapter<String> {
        private ArrayList<String> names;

        public NameAdapter(Context context, ArrayList<String> names) {
            super(context, R.layout.row, names);
            this.names = names;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            ViewHolder viewHolder;
            if (convertView == null) {
                viewHolder = new ViewHolder();
                LayoutInflater layoutInflater = (LayoutInflater) getContext().getSystemService(LAYOUT_INFLATER_SERVICE);
                convertView = layoutInflater.inflate(R.layout.row, parent, false);
                viewHolder.textView = (TextView) convertView.findViewById(R.id.nameTextView);
                convertView.setTag(viewHolder);
            } else {
                viewHolder = (ViewHolder) convertView.getTag();
            }
            viewHolder.textView.setText(names.get(position));
            return convertView;
        }
    }

//    @Override
//    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
//        Toast.makeText(this, "Hello", Toast.LENGTH_SHORT).show();
//        super.onCreateContextMenu(menu, v, menuInfo);
//    }
}
