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
import androidx.lifecycle.ViewModelProvider;

/**
 * @author : Leon (fxkxb.com)
 * @file : Fragment2.class
 * @date : 2021/8/27 上午11:35
 * @description :
 */
public class Fragment2 extends Fragment {
    private static final String TAG = Fragment2.class.getSimpleName();
    private ItemViewModel viewModel;

    public Fragment2(){
        Log.e(TAG, "Fragment2 Constructor.");
    }
    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        viewModel = new ViewModelProvider(requireActivity()).get(ItemViewModel.class);
        ClipData.Item item = new ClipData.Item(TAG+" - onAttach.");
        viewModel.selectItem(item);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewModel = new ViewModelProvider(requireActivity()).get(ItemViewModel.class);
        ClipData.Item item = new ClipData.Item(TAG+" - onCreate.");
        viewModel.selectItem(item);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        viewModel = new ViewModelProvider(requireActivity()).get(ItemViewModel.class);
        ClipData.Item item = new ClipData.Item(TAG+" - onCreateView.");
        viewModel.selectItem(item);

        return inflater.inflate(R.layout.fragment2, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.e(TAG, "onActivityCreated.");
        viewModel = new ViewModelProvider(requireActivity()).get(ItemViewModel.class);
        ClipData.Item item = new ClipData.Item(TAG+" - onActivityCreated.");
        viewModel.selectItem(item);
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.e(TAG, "onStart.");
        viewModel = new ViewModelProvider(requireActivity()).get(ItemViewModel.class);
        ClipData.Item item = new ClipData.Item(TAG+" - onStart.");
        viewModel.selectItem(item);
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.e(TAG, "onResume.");
        viewModel = new ViewModelProvider(requireActivity()).get(ItemViewModel.class);
        ClipData.Item item = new ClipData.Item(TAG+" - onResume.");
        viewModel.selectItem(item);
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.e(TAG, "onPause.");
        viewModel = new ViewModelProvider(requireActivity()).get(ItemViewModel.class);
        ClipData.Item item = new ClipData.Item(TAG+" - onPause.");
        viewModel.selectItem(item);
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.e(TAG, "onStop.");
        viewModel = new ViewModelProvider(requireActivity()).get(ItemViewModel.class);
        ClipData.Item item = new ClipData.Item(TAG+" - onStop.");
        viewModel.selectItem(item);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.e(TAG, "onDestroyView.");
        viewModel = new ViewModelProvider(requireActivity()).get(ItemViewModel.class);
        ClipData.Item item = new ClipData.Item(TAG+" - onDestroyView.");
        viewModel.selectItem(item);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "onDestroy.");
        viewModel = new ViewModelProvider(requireActivity()).get(ItemViewModel.class);
        ClipData.Item item = new ClipData.Item(TAG+" - onDestroy.");
        viewModel.selectItem(item);
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.e(TAG, "onDetach.");
        viewModel = new ViewModelProvider(requireActivity()).get(ItemViewModel.class);
        ClipData.Item item = new ClipData.Item(TAG+" - onDetach.");
        viewModel.selectItem(item);
    }
}
