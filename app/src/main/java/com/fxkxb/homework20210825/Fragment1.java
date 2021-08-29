package com.fxkxb.homework20210825;

import android.content.ClipData;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;

import com.baidu.mapapi.CoordType;
import com.baidu.mapapi.SDKInitializer;
import com.baidu.mapapi.map.MapView;

import java.util.Objects;

/**
 * @author : Leon (fxkxb.com)
 * @file : Fragment1.class
 * @date : 2021/8/27 上午11:35
 * @description :
 */
public class Fragment1 extends Fragment {
    MapView mMapView = null;
    DemoApplication demoApplication = new DemoApplication();

    private static final String TAG = Fragment1.class.getSimpleName();
    private ItemViewModel viewModel;

    public Fragment1() {
        Log.d(TAG, "Fragment1: Constructor");
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        viewModel = new ViewModelProvider(requireActivity()).get(ItemViewModel.class);
        ClipData.Item item = new ClipData.Item(TAG + " - onAttach.");
        viewModel.selectItem(item);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewModel = new ViewModelProvider(requireActivity()).get(ItemViewModel.class);
        ClipData.Item item = new ClipData.Item(TAG + " - onCreate.");
        viewModel.selectItem(item);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        viewModel = new ViewModelProvider(requireActivity()).get(ItemViewModel.class);
        ClipData.Item item = new ClipData.Item(TAG + " - onCreateView.");
        viewModel.selectItem(item);
        View view = inflater.inflate(R.layout.fragment1, container, false);
        mMapView = (MapView) view.findViewById(R.id.bmapView);

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        viewModel = new ViewModelProvider(requireActivity()).get(ItemViewModel.class);
        ClipData.Item item = new ClipData.Item(TAG + " - onActivityCreated.");
        viewModel.selectItem(item);
    }

    @Override
    public void onStart() {
        super.onStart();
        viewModel = new ViewModelProvider(requireActivity()).get(ItemViewModel.class);
        ClipData.Item item = new ClipData.Item(TAG + " - onStart.");
        viewModel.selectItem(item);
    }

    @Override
    public void onResume() {
        super.onResume();
        viewModel = new ViewModelProvider(requireActivity()).get(ItemViewModel.class);
        ClipData.Item item = new ClipData.Item(TAG + " - onResume.");
        viewModel.selectItem(item);
    }

    @Override
    public void onPause() {
        super.onPause();
        viewModel = new ViewModelProvider(requireActivity()).get(ItemViewModel.class);
        ClipData.Item item = new ClipData.Item(TAG + " - onPause.");
        viewModel.selectItem(item);
    }

    @Override
    public void onStop() {
        super.onStop();
        viewModel = new ViewModelProvider(requireActivity()).get(ItemViewModel.class);
        ClipData.Item item = new ClipData.Item(TAG + " - onStop.");
        viewModel.selectItem(item);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        viewModel = new ViewModelProvider(requireActivity()).get(ItemViewModel.class);
        ClipData.Item item = new ClipData.Item(TAG + " - onDestroyView.");
        viewModel.selectItem(item);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        viewModel = new ViewModelProvider(requireActivity()).get(ItemViewModel.class);
        ClipData.Item item = new ClipData.Item(TAG + " - onDestroy.");
        viewModel.selectItem(item);
    }

    @Override
    public void onDetach() {
        super.onDetach();
        viewModel = new ViewModelProvider(requireActivity()).get(ItemViewModel.class);
        ClipData.Item item = new ClipData.Item(TAG + " - onDetach.");
        viewModel.selectItem(item);
    }
}
