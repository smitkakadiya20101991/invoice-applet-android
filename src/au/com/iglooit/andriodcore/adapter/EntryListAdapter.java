package au.com.iglooit.andriodcore.adapter;

import org.droidparts.adapter.cursor.EntityCursorAdapter;
import org.droidparts.adapter.tag.Text2Tag;
import org.droidparts.persist.sql.stmt.Select;

import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import au.com.iglooit.andriodcore.model.Entry;

public class EntryListAdapter extends EntityCursorAdapter<Entry> {

	public EntryListAdapter(Context ctx, Select<Entry> select) {
		super(ctx, Entry.class, select);
	}

	@Override
	public View newView(Context context, Cursor cursor, ViewGroup parent) {
		View v = layoutInflater.inflate(android.R.layout.simple_list_item_2,
				null);
		Text2Tag tag = new Text2Tag(v);
		v.setTag(tag);
		return v;
	}

	@Override
	public void bindView(Context context, View view, Entry item) {
		Text2Tag tag = (Text2Tag) view.getTag();
		tag.text1.setText(item.name);
		tag.text2.setText(String.valueOf(item.created));
	}

}
