package au.com.iglooit.andriodcore.db;

import org.droidparts.persist.sql.EntityManager;

import android.content.Context;
import au.com.iglooit.andriodcore.model.Entry;

public class EntryManager extends EntityManager<Entry> {

	public EntryManager(Context ctx) {
		super(ctx, Entry.class);
	}

	@Override
	public boolean create(Entry item) {
		item.created = System.currentTimeMillis();
		return super.create(item);
	}

}
