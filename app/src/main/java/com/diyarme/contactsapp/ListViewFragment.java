package com.diyarme.contactsapp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.content.CursorLoader;
import android.support.v4.widget.SimpleCursorAdapter;
import android.util.Log;
import android.view.LayoutInflater;

import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;


/**
 * Created by D.Kablaoui on 3/15/2017.
 */

public class ListViewFragment extends Fragment implements AdapterView.OnItemClickListener {


    private SimpleCursorAdapter mCursorAdapter;

    public static ListViewFragment newInstance() {
        ListViewFragment mListViewFragment = new ListViewFragment();
        Bundle bundle = new Bundle();
        mListViewFragment.setArguments(bundle);
        return mListViewFragment;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    public ListViewFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.contactsrecyclerview_activity, container, false);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Cursor contacts = getActivity().getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null,null,null, null);

        while (contacts.moveToNext())
        {
            String name=contacts.getString(contacts.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME));
            String phoneNumber = contacts.getString(contacts.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER));

            Log.d("name", name);
            Log.d("phone", phoneNumber);
        }
        contacts.close();
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }
}


