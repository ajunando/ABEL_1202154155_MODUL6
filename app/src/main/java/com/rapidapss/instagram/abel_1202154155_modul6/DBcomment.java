package com.rapidapss.instagram.abel_1202154155_modul6;

/**
 * Created by Lenovo on 01/04/2018.
 */

import com.google.firebase.database.IgnoreExtraProperties;

//Enkapsulasi data comment
@IgnoreExtraProperties
public class DBcomment {
    String yangkomen, komennya, fotoyangdikomen;

    //Dibutuhkan kosong untuk membaca data
    public DBcomment(){

    }

    //Constructor dari class ini
    public DBcomment(String yangkomen, String komennya, String fotoyangdikomen) {
        this.yangkomen = yangkomen;
        this.komennya = komennya;
        this.fotoyangdikomen = fotoyangdikomen;
    }

    //Sisany getter untuk variabel dari class ini
    public String getFotoyangdikomen() {
        return fotoyangdikomen;
    }

    public String getYangkomen() {
        return yangkomen;
    }

    public String getKomennya() {
        return komennya;
    }

}