package com.example.android.newsapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by krzysztof on 23.07.18.
 */

public class NewsAdapter extends ArrayAdapter<News> {

    public NewsAdapter(Context context, List<News> newses) {
        super(context, 0, newses);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.news_list_item, parent, false
            );
        }

        News currentNews = getItem(position);

        TextView sectionView = listItemView.findViewById(R.id.section);
        sectionView.setText(currentNews.getSection());

        TextView titleView = listItemView.findViewById(R.id.title);
        titleView.setText(currentNews.getTitle());

        String publishDateTime = currentNews.getPublishDateTime();
        String[] publishDateTimeParts = publishDateTime.split("T");

        TextView publishDateView = listItemView.findViewById(R.id.publish_date);
        publishDateView.setText(publishDateTimeParts[0]);

        TextView publishTimeView = listItemView.findViewById(R.id.publish_time);
        publishTimeView.setText(publishDateTimeParts[1]
                .substring(0, publishDateTimeParts[1].length() - 1));

        TextView authorTextView = listItemView.findViewById(R.id.author);
        authorTextView.setText(currentNews.getAuthor());

        return listItemView;
    }
}
