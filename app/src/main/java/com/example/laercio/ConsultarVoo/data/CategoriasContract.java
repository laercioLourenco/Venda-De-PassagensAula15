package com.example.laercio.ConsultarVoo.data;

import android.provider.BaseColumns;

/**
 * Created by laercio on 09/10/2015.
 */
public class CategoriasContract {

    public CategoriasContract(){}

    public static abstract class OrigemEntry implements BaseColumns {
        public static final String TABLE_NAME = "origem";
        public static final String COLUMN_NAME_ORIGEM_NOME = "nomeOrigem";
    }

    public static abstract class DestinoEntry implements BaseColumns{
        public static final String TABLE_NAME = "destino";
        public static final String COLUMN_NAME_DESTINO_NOME = "nomeDestino";
    }
 }


