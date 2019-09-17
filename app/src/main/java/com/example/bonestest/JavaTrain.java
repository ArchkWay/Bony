package com.example.bonestest;

        import android.app.AlarmManager;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.SeekBar;
        import android.widget.TextView;

        import androidx.annotation.NonNull;
        import androidx.annotation.Nullable;
        import androidx.appcompat.app.AppCompatActivity;
        import androidx.fragment.app.Fragment;

public class JavaTrain extends Fragment {
    SeekBar seekBar;
    SeekBar seekBar2;
    SeekBar seekBar3;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
//        ((MainActivity) getActivity()).listenSwitcher();
        AlarmManager alarmManager = (AlarmManager)
                getActivity().getSystemService(getActivity().ALARM_SERVICE);
    }
    //    @Override
//    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        seekBar = findViewById(R.id.sbHours);
//        seekBar2 = findViewById(R.id.sbHours);
//        seekBar3 = findViewById(R.id.sbHours);
//    }
//    private void sss(SeekBar seekBar, final TextView textView){
//        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
//            @Override
//            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
//                textView.setText("ss progress");
//            }
//
//            @Override
//            public void onStartTrackingTouch(SeekBar seekBar) {
//
//            }
//
//            @Override
//            public void onStopTrackingTouch(SeekBar seekBar) {
//
//            }
//        });
//    }
}
