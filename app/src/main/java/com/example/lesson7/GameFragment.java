package com.example.lesson7;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class GameFragment extends Fragment {
    private Button btn1, btn2,btn3, cat, dog, squirrel;
    private ImageView imageView;
    boolean isCat, isDog, isSquirrel;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_game, container, false);
    }

    @Override
    public void onViewCreated(View view,  Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView(view);
        changeImage(view);
        guessAnimal(view);
    }

    private void initView(View view){
        imageView = view.findViewById(R.id.animal_image);
        btn1=view.findViewById(R.id.btn_1);
        btn2=view.findViewById(R.id.btn_2);
        btn3=view.findViewById(R.id.btn_3);
        cat = view.findViewById(R.id.btn_cat);
        dog = view.findViewById(R.id.btn_dog);
        squirrel = view.findViewById(R.id.btn_squirrel);


    }

    private void  changeImage(View view){
        
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView.setImageResource(R.drawable.cat);
                isCat=true;
                isDog=false;
                isSquirrel=false;


            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView.setImageResource(R.drawable.dog);
                isDog=true;
                isCat=false;
                isSquirrel=false;
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView.setImageResource(R.drawable.squirrel);
                isSquirrel=true;
                isDog=false;
                isCat=false;
            }
        });
    }

    private void guessAnimal(View view){

        cat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isCat){
                    Toast.makeText(requireContext(),"Правильно", Toast.LENGTH_SHORT).show();

                }else if (isDog){
                    Toast.makeText(requireContext(),"Ошибка", Toast.LENGTH_SHORT).show();
                }else if (isSquirrel){
                    Toast.makeText(requireContext(),"Ошибка", Toast.LENGTH_SHORT).show();
                }
            }
        });

        dog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isDog){
                    Toast.makeText(requireContext(),"Правильно", Toast.LENGTH_SHORT).show();
                }else if(isCat){
                    Toast.makeText(requireContext(),"Ошибка", Toast.LENGTH_SHORT).show();
                }else if (isSquirrel){
                    Toast.makeText(requireContext(),"Ошибка", Toast.LENGTH_SHORT).show();
                }
            }
        });

        squirrel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isSquirrel){
                    Toast.makeText(requireContext(),"Правильно", Toast.LENGTH_SHORT).show();
                }else if(isDog){
                    Toast.makeText(requireContext(),"Ошибка", Toast.LENGTH_SHORT).show();
                }
                else if (isCat){
                    Toast.makeText(requireContext(),"Ошибка", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }



}

