package hackathon.micromax.startingpoint.fragmentview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import hackathon.micromax.R;

/**
 * Created by apple on 01/07/15.
 */
public class FriendsFragment extends Fragment {

    public FriendsFragment(){
        android.util.Log.d("","");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_friends, container, false);


        return rootView;
    }


}
