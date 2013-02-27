package au.com.iglooit.andriodcore.json;

import org.droidparts.persist.json.JSONSerializer;

import android.content.Context;
import au.com.iglooit.andriodcore.model.Entry;

public class EntrySerializer extends JSONSerializer<Entry> {

	public EntrySerializer(Context ctx) {
		super(ctx, Entry.class);
	}

}
