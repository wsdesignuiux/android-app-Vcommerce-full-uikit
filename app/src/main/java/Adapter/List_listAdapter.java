package Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import Modellclass.PojoClass;
import ws.wolfsoft.mobile.R;

public class List_listAdapter extends RecyclerView.Adapter<List_listAdapter.ViewHolder> {

    private Context context;
    private ArrayList<PojoClass> pojoClassArrayList;

    public List_listAdapter(Context context, ArrayList<PojoClass> pojoClassArrayList) {
        this.context = context;
        this.pojoClassArrayList = pojoClassArrayList;
    }

    @NonNull
    @Override
    public List_listAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_list, parent, false);

        return new ViewHolder(itemView);

    }

    @Override
    public void onBindViewHolder(@NonNull List_listAdapter.ViewHolder holder, int position) {

        holder.title.setText(pojoClassArrayList.get(position).getTitle());

    }

    @Override
    public int getItemCount() {
        return pojoClassArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView title;
        public ViewHolder(View view) {
            super(view);

            title = view.findViewById(R.id.title);
        }
    }
}
