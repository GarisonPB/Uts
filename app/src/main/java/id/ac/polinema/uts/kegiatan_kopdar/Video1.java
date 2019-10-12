package id.ac.polinema.uts.kegiatan_kopdar;


import android.graphics.Color;
import android.media.MediaPlayer;
import android.widget.MediaController;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.VideoView;

import java.util.zip.Inflater;

import id.ac.polinema.uts.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Video1 extends Fragment {

    VideoView videoView;


    public Video1() {
        // Required empty public constructor

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        View rootView = inflater.inflate(R.layout.fragment_video1, container, false);
        MediaController mc= new MediaController(getActivity());

        VideoView view = (VideoView)rootView.findViewById(R.id.videoView2);
        String path = "android.resource://" + getActivity().getPackageName() + "/" + R.raw.video1;
        view.setVideoURI(Uri.parse(path));
        view.setMediaController(mc);
        view.setZOrderOnTop(true);
        view.start();

        return rootView;

    }


}
