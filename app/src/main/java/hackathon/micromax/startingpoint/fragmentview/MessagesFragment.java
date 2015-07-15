package hackathon.test.startingpoint.fragmentview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import hackathon.test.R;

/**
 * Created by apple on 01/07/15.
 */
public class MessagesFragment extends Fragment {

    public MessagesFragment(){
        android.util.Log.d("","");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_messages, container, false);
        return rootView;
    }
}
