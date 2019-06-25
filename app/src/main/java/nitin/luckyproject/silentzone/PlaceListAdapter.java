package nitin.luckyproject.silentzone;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class PlaceListAdapter extends RecyclerView.Adapter<PlaceListAdapter.PlaceViewHolder> {
    ArrayList<LocationList> mll;
    Context context;

    public PlaceListAdapter(Context c,ArrayList<LocationList> ll) {
        context =c;
        mll = ll;
    }

    @NonNull
    @Override
    public PlaceViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.list_item, parent, false);
        return new PlaceViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PlaceViewHolder holder, int position) {
        LocationList locationList = mll.get(position);

        holder.addressTextView.setText(locationList.getMaddress());
        holder.nameTextView.setText(locationList.getMplace());

    }


    @Override
    public int getItemCount() {
        return mll.size();
    }






    class PlaceViewHolder extends RecyclerView.ViewHolder {

        TextView nameTextView;
        TextView addressTextView;

        public PlaceViewHolder(View itemView) {
            super(itemView);
            nameTextView = itemView.findViewById(R.id.name_text_view);
            addressTextView = itemView.findViewById(R.id.address_text_view);
        }

    }
}
