package com.qsoft.pilotproject.adapter;

import android.content.Context;
import android.database.Cursor;
import android.support.v4.widget.SimpleCursorAdapter;
import android.view.View;
import android.widget.TextView;
import com.example.PilotProject.R;
import com.qsoft.pilotproject.provider.OnlineDioContract;

/**
 * User: BinkaA
 * Date: 10/18/13
 * Time: 2:06 AM
 */
public class CommentAdapter extends SimpleCursorAdapter
{

    public CommentAdapter(Context context, int layout, Cursor c, String[] from, int[] to)
    {
        super(context, layout, c, from, to);
    }

    @Override
    public void bindView(View view, Context context, Cursor cursor)
    {
        super.bindView(view, context, cursor);    //To change body of overridden methods use File | Settings | File Templates.
        TextView tvCommentTitle = (TextView) view.findViewById(R.id.tvCommentTitle);
        TextView tvCommentContent = (TextView) view.findViewById(R.id.tvCommentContent);
        TextView tvCommentTimeCreated = (TextView) view.findViewById(R.id.tvCommentTimeCreate);
        int titleIndex = cursor.getColumnIndex(OnlineDioContract.Comment.COLUMN_DISPLAY_NAME);
        int contentIndex = cursor.getColumnIndex(OnlineDioContract.Comment.COLUMN_CONTENT);
        int timeCreatedIndex = cursor.getColumnIndex(OnlineDioContract.Comment.COLUMN_CREATED_AT);
        tvCommentTitle.setText(cursor.getString(titleIndex));
        tvCommentContent.setText(cursor.getString(contentIndex));
        tvCommentTimeCreated.setText(cursor.getString(timeCreatedIndex));
    }
}
