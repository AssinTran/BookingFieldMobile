package com.example.bookingfield.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.bookingfield.data.FirebaseConnector;
import com.example.bookingfield.model.Field;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;

import java.util.ArrayList;
import java.util.List;

public class FieldViewModel extends ViewModel {
    private final MutableLiveData<List<Field>> fields;
    //private DatabaseReference db;
    public FieldViewModel() {
        fields = new MutableLiveData<>(new ArrayList<>());

    }

    public LiveData<List<Field>> getFields() {
        loadFields();
        return fields;
    }

    private void loadFields() {
       
    }
}
