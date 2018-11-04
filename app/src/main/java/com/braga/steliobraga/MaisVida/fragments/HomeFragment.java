package com.braga.steliobraga.MaisVida.fragments;


import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.button.MaterialButton;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SearchView;
import android.widget.Toast;

import com.braga.steliobraga.MaisVida.R;
import com.braga.steliobraga.MaisVida.activities.AnuncioActivity;
import com.braga.steliobraga.MaisVida.entities.Post;
import com.braga.steliobraga.MaisVida.utils.PostAdapter;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    RecyclerView rv_posts;
    PostAdapter postAdapter;
    List<Post> postsList;

    MaterialButton btn_anunciar;
    MaterialButton btn_goback;
    MaterialButton  btn_anuncio;
    String[] list;



//pesquisa
/*
    SearchView searchView;
    searchView =view.findViewById(R.id.psq);
    SearchManager searchManager = (SearchManager) getSystemService(Context.SEARCH_SERVICE);

        if (searchManager != null)

    {
        searchView.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));
    }
*/





    FirebaseDatabase database;


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
list = new String[]{"agua","mar"};
        //pesquisa
        SearchView searchView;
        searchView =view.findViewById(R.id.psq);
        searchView.cancelLongPress();

      /* // searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
           *//* @Override
            public boolean onQueryTextSubmit(String query) {


                try{
                    postAdapter.getFilter().filter(query);
                } catch (Exception e) {
                    Log.v("Search Filter – K: ", e.getMessage());
                }
            return false;
            }

            @Override
            public boolean onQueryTextChange(String query) {
                try{
                    postAdapter.getFilter().filter(query);
                } catch (Exception e) {
                    Log.v("Search Filter – K: ", e.getMessage());
                }
                return false;*//*
            }
        });*/


        if (getActivity() != null){
            rv_posts = view.findViewById(R.id.rv_posts);
            rv_posts.setLayoutManager(new CustomLinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL,false)); // set the list layout style to vertical.

            postsList = new ArrayList<>();

            Post post1 = new Post("Camila Joana", "+O", "Maputo", "10/09/2018", "Imediata", "doadora", "");
            Post post2 = new Post("Débora William", "+AB", "Cabo Delegado", "10/09/2018", "Imediata", "Requisitante", "");
            Post post3 = new Post("Jessica Abreu", "-B", "Inhambane", "09/09/2018", "Não Imediata", "REQUISITANTE", "");
            Post post4 = new Post("Deny OG", "+A", "Maputo", "06/09/2018", "Imediata", "DOADOR", "");
            Post post5 = new Post("Ruben Maria", "+B", "Inhambane", "06/09/2018", "Imediata", "requisitante", "");


            for (int i = 0; i < 18; i++) {
                postsList.add(post1);
                postsList.add(post2);
                postsList.add(post3);
                postsList.add(post4);
                postsList.add(post5);
            }


            postAdapter = new PostAdapter(getActivity(), postsList);
            rv_posts.setAdapter(postAdapter);
        }

        return view;
    }



   /* @OnClick(R.id.btn_anuncio)
    public void openActivity(){
        Intent intent = new Intent(getActivity(), AnuncioActivity.class);
        startActivity(intent);
  //    Toast.makeText(getContext(), "Clicked", Toast.LENGTH_SHORT).show();
    }*/

    public MaterialButton getBtn_anunciar() {
        btn_anuncio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), AnuncioActivity.class);
                startActivity(intent);
            }
        });
        return btn_anunciar;
    }

    // Layout manager for recycler view
    public class CustomLinearLayoutManager extends LinearLayoutManager {
        public CustomLinearLayoutManager(Context context, int orientation, boolean reverseLayout) {
            super(context, orientation, reverseLayout);
        }
    }

   // Associate searchable configuration with the SearchView



    }







