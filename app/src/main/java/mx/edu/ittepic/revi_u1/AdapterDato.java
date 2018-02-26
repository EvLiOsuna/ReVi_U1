package mx.edu.ittepic.revi_u1;

        import android.support.v7.widget.RecyclerView;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.TextView;
import java.util.ArrayList;

public class AdapterDato extends RecyclerView.Adapter<AdapterDato.ViewHolderDatos> {

    ArrayList<String> listDatos1;
    ArrayList<String> listDatos2;
    ArrayList<String> listDatos3;

    public AdapterDato(ArrayList<String> listDatos1, ArrayList<String> listDatos2, ArrayList<String> listDatos3) {
        this.listDatos1 = listDatos1;
        this.listDatos2 = listDatos2;
        this.listDatos3 = listDatos3;
    }

    @Override
    public ViewHolderDatos onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_list_item, null, false);
        return new ViewHolderDatos(view);
    }

    @Override
    public void onBindViewHolder(ViewHolderDatos holder, int position) {
        holder.asignarDatos(listDatos1.get(position));
        holder.asignarDatos(listDatos2.get(position));
        holder.asignarDatos(listDatos3.get(position));

    }

    @Override
    public int getItemCount() {
        return listDatos1.size();
    }

    public class ViewHolderDatos extends RecyclerView.ViewHolder {
        TextView dato1, dato2, dato3;

        public ViewHolderDatos(View itemView) {
            super(itemView);
            dato1 = itemView.findViewById(R.id.idDato1);
            dato2 = itemView.findViewById(R.id.idDato2);
            dato3 = itemView.findViewById(R.id.idDato3);


        }

        public void asignarDatos(String sdata) {
            dato1.setText(sdata);
            dato2.setText(sdata);
            dato3.setText(sdata);


        }

    }

}