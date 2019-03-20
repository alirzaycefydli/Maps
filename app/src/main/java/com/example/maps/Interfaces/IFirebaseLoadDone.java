package com.example.maps.Interfaces;

import java.util.List;

public interface IFirebaseLoadDone {
    void onFirebaseLoadUserNameDone(List<String> listMail);
    void onFirebaseFailed(String message);
}
