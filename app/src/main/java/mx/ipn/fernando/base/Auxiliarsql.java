package mx.ipn.fernando.base;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Auxiliarsql extends SQLiteOpenHelper{

    String SQL_TABLA = "CREATE TABLE Reservacion (_id INTEGER PRIMARY KEY, NOMBRE TEXT)";


    public Auxiliarsql(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_TABLA);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
