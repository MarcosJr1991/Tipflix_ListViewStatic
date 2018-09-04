package customlistview.com.testecustomlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int[] Imagens = {R.drawable.anoitedojogo,R.drawable.aquaman,R.drawable.arranhaceu,R.drawable.dozeherois,R.drawable.invasaoalondres,
                    R.drawable.oassassino,R.drawable.oestrangeiro,R.drawable.operacaoinvasao,R.drawable.rambo,R.drawable.blackwater};

    String[] Nomes = {"A Noite Do Jogo "," Aquaman"," Arranhaceu "," Doze Herois "," Invasão a Londres",
                    "O Assassino "," O Estrangeiro "," Operação Invasão "," Rambo "," Black Water"};

    String[] Descrição = {" Comédia , Ação ", " Ação ", " Ação , Suspense "," Guerra"," Ação ",
                        "  Suspense, Ação ", " Suspense, Ação ", " Ação, Suspense ", " Ação ", " Ação, Suspense "};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView)findViewById(R.id.listView);

        personalizadoAdapter personalizadoAdapter = new personalizadoAdapter();

        listView.setAdapter(personalizadoAdapter);

    }
    class personalizadoAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return Imagens.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            view = getLayoutInflater().inflate(R.layout.customlayout,null);

            ImageView imageView = (ImageView)view.findViewById(R.id.imageView);
            TextView texview_nome = (TextView)view.findViewById(R.id.textView_nome);
            TextView texview_descricao = (TextView)view.findViewById(R.id.textView_descricao);

            imageView.setImageResource(Imagens[i]);
            texview_nome.setText(Nomes[i]);
            texview_descricao.setText(Descrição[i]);


            return view;
        }
    }
}
