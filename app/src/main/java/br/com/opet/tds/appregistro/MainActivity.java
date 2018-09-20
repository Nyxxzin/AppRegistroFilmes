package br.com.opet.tds.appregistro;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainActivity extends Activity {

    private List<Produto> produtos;
    private EditText editNome;
    private EditText editCategoria;
    private EditText editQuantidade;
    private EditText editValor;
    private ListView listProduto;
    private ArrayAdapter<Produto> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        produtos = new ArrayList<>();
        editNome = findViewById(R.id.editNome);
        editCategoria = findViewById(R.id.editCategoria);
        editQuantidade = findViewById(R.id.editQuantidade);
        editValor = findViewById(R.id.editValor);
        listProduto = findViewById(R.id.listProduto);

        atualizarProdutos();
    }

    private void atualizarProdutos(){
        if(adapter == null) {
            adapter = new ProdutoAdapter(getApplicationContext(), R.layout.produto_item, produtos);
            listProduto.setAdapter(adapter);
        }else{
            adapter.notifyDataSetChanged();
        }
    }

    public void salvarProduto(View v){
        String nome = editNome.getText().toString();
        String categoria = editCategoria.getText().toString();
        Double quantidade = Double.parseDouble(editQuantidade.getText().toString());
        Double valor = Double.parseDouble(editValor.getText().toString());

        Produto a = new Produto();
        a.setNome(nome);
        a.setCategoria(categoria);
        a.setQuantidade(quantidade);
        a.setValor(valor);

        produtos.add(a);

        /*
        Collections.sort(produtos, new Comparator<Produto>() {
            @Override
            public int compare(Produto f1, Produto f2) {
                if  (f1.getNota() < f2.getNota())
                return 1;

                if (f1.getNota() > f2.getNota())
                    return -1;
                return 0;
            }
        });

        while(filmes.size() > 10){
            filmes.remove(filmes.size() -1);
        }*/
        atualizarProdutos();
    }
}
