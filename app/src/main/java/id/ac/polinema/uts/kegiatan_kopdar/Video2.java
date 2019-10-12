package id.ac.polinema.uts.kegiatan_kopdar;


import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.MediaController;
import android.widget.VideoView;

import id.ac.polinema.uts.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Video2 extends Fragment {

    VideoView videoView;


    public Video2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_video2, container, false);
        MediaController mc= new MediaController(getActivity());

        VideoView view = (VideoView)rootView.findViewById(R.id.videoView);
        String path = "android.resource://" + getActivity().getPackageName() + "/" + R.raw.video2;
        view.setVideoURI(Uri.parse(path));
        view.setMediaController(mc);
        view.setZOrderOnTop(true);
        view.start();

        return rootView;
    }

}
