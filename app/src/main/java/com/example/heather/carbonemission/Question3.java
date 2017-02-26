package com.example.heather.carbonemission;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Question3.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Question3#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Question3 extends Fragment {
    private int hours;
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("autohours", hours);    // Save current View's state here
    }
    public Question3() {
        // Required empty public constructor
    }

    public static Question3 newInstance() {
        Question3 fragment = new Question3();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_question3, container, false);
        EditText editTextName = (EditText) rootView.findViewById(R.id.editText4);
        editTextName.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent){
                boolean handled = false;
                if (i == EditorInfo.IME_ACTION_NEXT) {
                    hours = Integer.parseInt(textView.getText().toString());
                }
                return handled;
            }
        });
        return rootView;
    }



    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
