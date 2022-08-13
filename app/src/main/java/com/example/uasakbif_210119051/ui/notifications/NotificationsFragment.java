package com.example.uasakbif_210119051.ui.notifications;


//Nama :Rahmayudhi Prakoso
//Nim  :10119051
//Kelas:IF-2

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.example.uasakbif_210119051.R;
import com.example.uasakbif_210119051.databinding.FragmentNotificationsBinding;
import com.example.uasakbif_210119051.ui.dashboard.DashboardViewModel;

public class NotificationsFragment extends Fragment {


    ViewPager viewPager;
    Adapter adapter;

    private FragmentNotificationsBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        DashboardViewModel slideshowViewModel =
                new ViewModelProvider(this).get(DashboardViewModel.class);

        binding = FragmentNotificationsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

//        final TextView textView = binding.textSlideshow;
//        slideshowViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setupViewPager();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    private void setupViewPager() {
        adapter = new Adapter(requireActivity());
        viewPager = getView().findViewById(R.id.viewpager);
        viewPager.setAdapter(adapter);
    }

    private class Adapter extends PagerAdapter {
        Context context;
        LayoutInflater inflater;

        public Adapter(Context context) {
            this.context = context;
        }

        // list img
        int[] list_img = {
                R.drawable.unikom,
                R.drawable.tangan,
                R.drawable.tentang
        };

        // list judul
        int[] list_judul = {
                R.string.judul1,
                R.string.judul2,
                R.string.judul3
        };

        //list deskripsi
        int[] list_desk = {
                R.string.desk_1,
                R.string.desk_2,
                R.string.desk_3
        };



        @Override
        public int getCount() {
            return list_judul.length;
        }

        @Override
        public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
            return (view == object);
        }

        @NonNull
        @Override
        public Object instantiateItem(@NonNull ViewGroup container, int position) {
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View view = inflater.inflate(R.layout.item_layout, container, false);
            LinearLayout linearLayout = view.findViewById(R.id.item_layout);
            ImageView imageView = view.findViewById(R.id.img);
            TextView judul = view.findViewById(R.id.judul);
            TextView desk = view.findViewById(R.id.deskripsi);

            imageView.setImageResource(list_img[position]);
            judul.setText(list_judul[position]);
            desk.setText(list_desk[position]);
            container.addView(view);
            return view;
        }

        @Override
        public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
            container.removeView((LinearLayout) object);
        }
    }

}