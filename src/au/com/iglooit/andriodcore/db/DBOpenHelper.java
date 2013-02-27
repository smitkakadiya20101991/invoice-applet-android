package au.com.iglooit.andriodcore.db;

import org.droidparts.model.Entity;
import org.droidparts.persist.sql.AbstractDBOpenHelper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import au.com.iglooit.andriodcore.model.Entry;

public class DBOpenHelper extends AbstractDBOpenHelper {

	private static final String DB_FILE = "droidparts_sample.sqlite";
	private static final int DB_VER = 1;

	public DBOpenHelper(Context ctx) {
		super(ctx, DB_FILE, DB_VER);
	}

	@Override
	protected Class<? extends Entity>[] getEntityClasses() {
		@SuppressWarnings("unchecked")
		Class<? extends Entity>[] arr = new Class[] { Entry.class };
		return arr;
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		dropTables(db);
		onCreate(db);
	}

}
